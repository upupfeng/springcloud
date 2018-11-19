package com.mwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mwf.service.HiService;

@RestController
public class HiController {
	@Autowired
	private HiService hiService;
	@RequestMapping("hi")
	public String sayHi(String name ){
		return name+","+hiService.hi(name);
	}
}
