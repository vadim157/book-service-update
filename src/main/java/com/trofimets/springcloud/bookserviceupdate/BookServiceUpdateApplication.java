package com.trofimets.springcloud.bookserviceupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceUpdateApplication.class, args);
	}

}
