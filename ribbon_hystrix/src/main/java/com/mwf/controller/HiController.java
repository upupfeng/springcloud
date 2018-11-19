package com.mwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwf.service.HiService;
import com.netflix.discovery.converters.Auto;

@RestController
public class HiController {
	
	@Autowired
	private HiService hiService;
	
	@RequestMapping("hi")
	public String hi(String name ){
		return hiService.hi(name);
	}
}





