package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
@ImportResource("classpath:NewFile.xml")  
public class XmltojsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmltojsonApplication.class, args);
	}

}
