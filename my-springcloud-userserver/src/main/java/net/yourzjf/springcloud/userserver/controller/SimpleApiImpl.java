package net.yourzjf.springcloud.userserver.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiImpl {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi! " + name;
    }
}
