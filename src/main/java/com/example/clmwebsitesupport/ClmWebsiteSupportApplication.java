package com.example.clmwebsitesupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ClmWebsiteSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClmWebsiteSupportApplication.class, args);
	}

}
