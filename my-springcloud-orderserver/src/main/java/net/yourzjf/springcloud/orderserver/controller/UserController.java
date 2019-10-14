package net.yourzjf.springcloud.orderserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.yourzjf.springcloud.orderserver.remote.UserRemote;
import net.yourzjf.springcloud.userserver.dto.User;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private UserRemote userRemote;

    @GetMapping("/user")
    public List<User> list() {
        System.out.println("/consumer/user");
        return userRemote.list();
    }

    @GetMapping("/user/{id}")
    public User get(@PathVariable Integer id) {
        return userRemote.get(id);
    }

    @PostMapping("/user")
    public User post(@ModelAttribute User user) {
        System.out.println("POST /consumer/user " + user);
        return userRemote.post(user);
    }

    @PutMapping("/user")
    public User put(@ModelAttribute User user) {
        System.out.println("PUT /consumer/user " + user);
        return userRemote.put(user);
    }

    @DeleteMapping("/user/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return userRemote.delete(id);
    }

    @GetMapping("/query")
    public List<User> query(@RequestParam("name") String name) {
        return userRemote.query(name);
    }
}
