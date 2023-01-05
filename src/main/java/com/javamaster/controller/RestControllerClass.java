package com.javamaster.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.javamaster.domain.HelloWorldObject;

@RestController
public class RestControllerClass {

	@PostMapping("/api/myrequest")
	public ResponseEntity<HelloWorldObject> catchPostMapping(@RequestBody HelloWorldObject object){
		System.out.println(object);
		HelloWorldObject responceObject = new HelloWorldObject();
		responceObject.setId(2);
		responceObject.setMessage("Hello world");
		return new ResponseEntity<HelloWorldObject>(responceObject, HttpStatus.OK);
	}
	
}
