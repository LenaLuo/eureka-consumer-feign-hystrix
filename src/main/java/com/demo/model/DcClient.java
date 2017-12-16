package com.demo.model;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.controller.DcClientFallback;

@FeignClient(name = "eureka-client", fallback = DcClientFallback.class)

public interface DcClient {

//	@GetMapping("/dc")
	@RequestMapping(value="/dc", method=RequestMethod.GET)
	String consumer();
}
