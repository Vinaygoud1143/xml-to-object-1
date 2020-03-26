package com.example.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.example.entiry.Student;


@Service
public class PersonService {

	
	
	public Student xmlToObject(InputStream is) throws JAXBException, FileNotFoundException {
		
		JAXBContext jaxbcontext=JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller=jaxbcontext.createUnmarshaller();
		return (Student)unmarshaller.unmarshal(is); 
					
	}
	
	
	
}
