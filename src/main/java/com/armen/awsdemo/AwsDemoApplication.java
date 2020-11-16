package com.armen.awsdemo;

import com.armen.awsdemo.config.DynamoDbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsDemoApplication {

	@Autowired
	private DynamoDbConfig config;

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}

}
