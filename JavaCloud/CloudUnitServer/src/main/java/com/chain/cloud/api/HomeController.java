package com.chain.cloud.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${server.port}")
    private String port;
	
	@RequestMapping("/home")
    public String home() {
        return "home";
    }
	
	@RequestMapping("/sayHi")
	public String hi(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

}
