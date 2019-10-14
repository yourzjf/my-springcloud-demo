package net.yourzjf.springcloud.userserver.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.yourzjf.springcloud.userserver.api.UserApi;
import net.yourzjf.springcloud.userserver.dto.User;

@RestController
public class UserApiImpl implements UserApi {

    private static final AtomicInteger idgen = new AtomicInteger(3);
    private static ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();
    static {
        users.put(1, User.builder(1, "张三").build());
        users.put(2, User.builder(2, "李四").setAge(18).setIdcard("331126199001010101").build());
    }

    @Override
    public List<User> list() {
        System.out.println("list " + users.values());
        return new ArrayList<>(users.values());
    }

    @Override
    public User get(@PathVariable Integer id) {
        System.out.println("get " + id);
        id = Objects.requireNonNull(id);
        return users.get(id);
    }

    @Override
    public User post(@RequestBody User user) {
        System.out.println("post " + user);
        user = Objects.requireNonNull(user);
        Integer id = idgen.getAndIncrement();
        user.setId(id);
        users.put(id, user);
        return user;
    }

    @Override
    public User put(@RequestBody User user) {
        System.out.println("put " + user);
        user = Objects.requireNonNull(user);
        if (!users.containsKey(user.getId())) {
            return null;
        }
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public int delete(@PathVariable Integer id) {
        System.out.println("delete " + id);
        id = Objects.requireNonNull(id);
        if (users.containsKey(id)) {
            users.remove(id);
            return 1;
        }
        return 0;
    }

    @Override
    public List<User> query(@RequestParam String name) {
        System.out.println("query " + name);
        name = Objects.requireNonNull(name);
        return new ArrayList<>(users.values());
    }
}
