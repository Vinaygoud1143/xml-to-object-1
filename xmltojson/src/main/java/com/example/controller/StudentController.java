package com.example.controller;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entiry.Student;
import com.example.service.PersonService;

@RestController
public class StudentController {

	PersonService personservice;
	
	private static final String FILE_NAME="NewFile.xml";

	@RequestMapping("/check")
	public ResponseEntity<Object> testing() throws Exception {
		
		Student student=null;
		
		 student=personservice.xmlToObject(new FileInputStream(new File(FILE_NAME)));
		
		 if(student==null) {
				return new ResponseEntity<Object>("object is not created",HttpStatus.BAD_REQUEST);
			}
			
		
		 return new ResponseEntity<Object>(student,HttpStatus.OK);
		
	}
}
