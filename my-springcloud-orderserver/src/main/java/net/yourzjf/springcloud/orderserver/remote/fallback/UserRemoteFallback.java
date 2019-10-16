package net.yourzjf.springcloud.orderserver.remote.fallback;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import net.yourzjf.springcloud.orderserver.remote.UserRemote;
import net.yourzjf.springcloud.userserver.dto.User;

@Component("userRemoteFallback")
public class UserRemoteFallback implements UserRemote {

    @Override
    public List<User> list() {
        System.out.println("fallback: UserRemoteFallback.list()");
        return Collections.emptyList();
    }

    @Override
    public User get(Integer id) {
        System.out.println("fallback: UserRemoteFallback.get(" + id + ")");
        return new User();
    }

    @Override
    public User post(User user) {
        System.out.println("fallback: UserRemoteFallback.post(" + user + ")");
        return user;
    }

    @Override
    public User put(User user) {
        System.out.println("fallback: UserRemoteFallback.put(" + user + ")");
        return null;
    }

    @Override
    public int delete(Integer id) {
        System.out.println("fallback: UserRemoteFallback.delete(" + id + ")");
        return 0;
    }

    @Override
    public List<User> query(String name) {
        System.out.println("fallback: UserRemoteFallback.query(" + name + ")");
        return null;
    }
}
