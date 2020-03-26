package com.vinay.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinay.service.Employee;

@Service
public class JsonOperationsService {

	@Autowired
	ObjectMapper mapper;
	
	public Employee converToObject(String jsonstring) throws JsonMappingException, JsonProcessingException {
		
		Employee employeeobject=mapper.readValue(jsonstring, Employee.class);
		
		return employeeobject;
	}
	
	public  String convertToJson(Employee employee) throws JsonProcessingException {
	
	String result=mapper.writeValueAsString(employee);
	return result;
	}
	
}
