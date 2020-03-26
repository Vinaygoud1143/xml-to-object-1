package com.vinay.controller;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vinay.entity.JsonOperationsService;
import com.vinay.service.Employee;

@RestController
public class JsonOperationsController {

	@Autowired
	JsonOperationsService jsonoperationsservice;
	
	@RequestMapping("/jsontoobject")
	public ResponseEntity<Object> convertingJsonToObject(@RequestParam String jsonstring ) throws JsonMappingException, JsonProcessingException{
		
		if(org.springframework.util.StringUtils.isEmpty(jsonstring)){
			return new ResponseEntity<Object>("empty String",HttpStatus.BAD_REQUEST);
		}
		
		Employee resutlobject=jsonoperationsservice.converToObject(jsonstring);
		System.out.println("Enumber is "+resutlobject.getEmployeenumber()+"Ename is "+resutlobject.getEmployeename()+"Esalary is "+resutlobject.getEmployeesalary());
		
		return new ResponseEntity<Object>(resutlobject,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping("/objecttostring")
	public ResponseEntity<Object> convertingObjectToJson(@RequestBody Employee employee ) throws JsonMappingException, JsonProcessingException{
		
		if(employee==null){
			return new ResponseEntity<Object>("empty String",HttpStatus.BAD_REQUEST);
		}
		
		String jsonstring=jsonoperationsservice.convertToJson(employee);
		
		return new ResponseEntity<Object>(jsonstring,HttpStatus.ACCEPTED);
	}
	
}
