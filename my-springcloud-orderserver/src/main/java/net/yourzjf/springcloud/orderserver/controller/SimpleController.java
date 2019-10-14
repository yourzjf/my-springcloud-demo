package net.yourzjf.springcloud.orderserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.yourzjf.springcloud.orderserver.remote.SimpleRemote;

@RestController
public class SimpleController {

    @Autowired
    private SimpleRemote simpleRemote;

    @RequestMapping("/hello/{name}")
    public String sayHi(@PathVariable String name) {
        String remoteSay = simpleRemote.sayHi(name);
        return remoteSay + " I'm Consumer!";
    }
}
