package com.chain.cloud.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloudunitserver")
public interface CloudUnitClient {

	@RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
	
}
