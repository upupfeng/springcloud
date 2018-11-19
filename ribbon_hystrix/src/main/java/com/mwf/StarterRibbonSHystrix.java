package com.mwf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.shared.Application;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class StarterRibbonSHystrix {
	public static void main(String[] args) {
		SpringApplication.run(StarterRibbonSHystrix.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate getResource(){
		return new RestTemplate();
	}
}

