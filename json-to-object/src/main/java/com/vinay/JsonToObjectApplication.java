package com.vinay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonToObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonToObjectApplication.class, args);
	}

//	@Bean
//	public ObjectMapper CreatingMapperObject() {
//		return new ObjectMapper();
//		
//	}
	
}
