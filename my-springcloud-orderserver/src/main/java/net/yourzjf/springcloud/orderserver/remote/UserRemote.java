package net.yourzjf.springcloud.orderserver.remote;

import org.springframework.cloud.openfeign.FeignClient;

import net.yourzjf.springcloud.userserver.api.UserApi;

@FeignClient("spring-cloud-provider")
public interface UserRemote extends UserApi {}
