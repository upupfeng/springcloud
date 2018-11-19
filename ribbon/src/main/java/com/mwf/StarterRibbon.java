package com.mwf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class StarterRibbon {
	
	public static void main(String[] args) {
		SpringApplication.run(StarterRibbon.class, args);
	}
	@LoadBalanced  //实现服务负载均衡的逻辑
	@Bean  
	public RestTemplate getResource(){
		return new RestTemplate();
	}
}
