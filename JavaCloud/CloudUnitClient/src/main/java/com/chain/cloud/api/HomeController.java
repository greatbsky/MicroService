package com.chain.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.cloud.clients.CloudUnitClient;

@RestController
public class HomeController {

	@Value("${server.port}")
    private String port;
	
	@RequestMapping("/home")
    public String home() {
        return "hi ,i am from port:" + port;
    }

	@Autowired
	CloudUnitClient client;
	
	@RequestMapping("/hi")
	public String hi(@RequestParam String name) {
		return client.sayHi(name);
	}
}
