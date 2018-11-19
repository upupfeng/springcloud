package com.mwf;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StarterConfigServer {
	public static void main(String[] args) {
		SpringApplication.run(StarterConfigServer.class, args);
	}
}
