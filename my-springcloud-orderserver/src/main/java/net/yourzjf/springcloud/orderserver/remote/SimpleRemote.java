package net.yourzjf.springcloud.orderserver.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userserver", contextId = "simpleRemote")
public interface SimpleRemote {

    @GetMapping("/hello/{name}")
    String sayHi(@PathVariable("name") String name);
}
