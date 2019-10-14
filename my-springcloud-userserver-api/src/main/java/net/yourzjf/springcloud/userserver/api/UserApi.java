package net.yourzjf.springcloud.userserver.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.yourzjf.springcloud.userserver.dto.User;

@RequestMapping("/user")
public interface UserApi {

    @GetMapping("")
    List<User> list();

    @GetMapping("/{id}")
    User get(@PathVariable("id") Integer id);

    @PostMapping("")
    User post(@RequestBody User user);

    @PutMapping("")
    User put(@RequestBody User user);

    @DeleteMapping("/{id}")
    int delete(@PathVariable("id") Integer id);

    @GetMapping("/query")
    List<User> query(@RequestParam("name") String name);
}
