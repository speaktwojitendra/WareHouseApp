package com.spring.rest.controler;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/getHello")
	
public String getHello() {
	return "Hello Guys...";
}
	@RequestMapping("/getDataClass")
	
public DataClass getDataClass() {
	DataClass dataClass=new DataClass(100, "HEllo");
	return dataClass;
}
	

	@RequestMapping("/getListOfDataClass")
	
public List<DataClass> getListOfDataClass() {
	DataClass dataClass1=new DataClass(100, "HEllo");
	DataClass dataClass2=new DataClass(200, "jkl");
	DataClass dataClass3=new DataClass(300, "HEllgjgjo");
	DataClass dataClass4=new DataClass(400, "jkhuhh ");
	  List<DataClass> list =List.of(dataClass1, dataClass2, dataClass3, dataClass4);
	  return list;
	
}
	
	
   	
}
