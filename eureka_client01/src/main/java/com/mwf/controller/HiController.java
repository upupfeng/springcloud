package com.mwf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	@Value("${server.port}")
	private String port;
	@RequestMapping("hi")
	public String hi(){
		return "hi"+port;
	}
	
	@RequestMapping("hi1")
	public String hi1(){
		return "hi1"+port;
	}
}
