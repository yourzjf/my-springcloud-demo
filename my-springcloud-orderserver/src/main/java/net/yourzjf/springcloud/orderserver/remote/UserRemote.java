package net.yourzjf.springcloud.orderserver.remote;

import org.springframework.cloud.openfeign.FeignClient;

import net.yourzjf.springcloud.userserver.api.UserApi;

@FeignClient(value = "userserver", contextId = "userRemote")
public interface UserRemote extends UserApi {}
