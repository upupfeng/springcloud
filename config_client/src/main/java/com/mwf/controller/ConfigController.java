package com.mwf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${spring.redis.nodes}")
	private String nodes;
	@RequestMapping("config")
	public String getConfig(){
		return nodes;
	}
	
}
