package com.mwf.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi")
public interface HiService {
	//这里的请求指的是被请求方的名字
	@RequestMapping(value="hi1",method=RequestMethod.GET)
	public String hi(@RequestParam("name") String name) ;
}
