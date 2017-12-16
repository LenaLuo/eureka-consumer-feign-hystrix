package com.demo.controller;

import org.springframework.stereotype.Component;

import com.demo.model.DcClient;

@Component
public class DcClientFallback implements DcClient {

	@Override
	public String consumer(){
		return "fallback";
	}
}
