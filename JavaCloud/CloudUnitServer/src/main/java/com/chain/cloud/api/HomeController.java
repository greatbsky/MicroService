package com.chain.cloud.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "home", tags = "主入口接口", description = "主入口接口zzz")
@RestController
public class HomeController {

	@Value("${server.port}")
    private String port;
	
	@ApiOperation(value = "show home", notes = "显示home", response = String.class)
	@GetMapping("/home")
    public String home() {
        return "home";
    }
	
	@GetMapping("/sayHi")
	public String hi(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

}
