package net.yourzjf.springcloud.orderserver.remote;

import org.springframework.cloud.openfeign.FeignClient;

import net.yourzjf.springcloud.orderserver.remote.fallback.UserRemoteFallback;
import net.yourzjf.springcloud.userserver.api.UserApi;

@FeignClient(value = "userserver", contextId = "userRemote", fallback = UserRemoteFallback.class)
public interface UserRemote extends UserApi {}
