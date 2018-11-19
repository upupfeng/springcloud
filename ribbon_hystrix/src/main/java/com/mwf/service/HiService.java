package com.mwf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service 
public class HiService {
	@Autowired
	private RestTemplate template;
	@HystrixCommand(fallbackMethod="errorHi")
	public String hi(String name) {
		String response = template.getForObject("http://service-hi/hi", String.class);
		return name+","+response;
	}
	public String errorHi(String name){
		return name+"  error is happened";
	}

}
