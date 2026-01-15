package com.spring_jpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

import java.util.*;

@Component
public class Operation {

   // private final SpringJpa1Application springJpa1Application;
	@Autowired
	MyInterface myInterface;
//
//    Operation(SpringJpa1Application springJpa1Application) {
//        this.springJpa1Application = springJpa1Application;
//    }
//public void addDetails() {
//	User_Detail user_Detail1=new User_Detail();
//	user_Detail1.setPassWord("sai@123");
//	user_Detail1.setUser_id(108);
//	user_Detail1.setUser_name("Sai");
//	
//	User_Detail user_Detail2=new User_Detail();
//	user_Detail2.setPassWord("Ashu@123");
//	user_Detail2.setUser_id(109);
//	user_Detail2.setUser_name("Ashu");
//	
//	List<User_Detail> l=List.of(user_Detail1,user_Detail2);
//	myInterface.saveAll(l);}
//	

//	@Transactional
//	public void get_By_Id() {
//		try {
//		User_Detail use=	myInterface.getById(105);
//		System.out.println(use.getUser_name());
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
    
//    public void deleteData() {
//    	myInterface.deleteById(108);
//    }

//    
//    public void getAll() {
//    	
//    List<User_Detail> list=	myInterface.findAll();
//    list.forEach(e->System.out.println(e.getPassWord()+"    "+e.getUser_id()+"        "+e.getUser_name()));
//    }
//   
//
//public void insertDataByNativeQuery(int id,String pass,String name) {
//    int count=  myInterface.insertByPositionalParamIndex(id, pass, name);
//    System.out.println(count);
//}
//    public void insertDataByNativeQuery2(int id,String pass,String name) {
//    	myInterface.insertByPositionalParamname(id, pass, name);
//    }
//    public void getuserDetailsBySortingorder() {
//  List<User_Detail> list1= 	myInterface.findAll(Sort.by("userName"));
// // list1.forEach(ele->System.out.println(ele.getUser_id()+", "+ele.getUser_name()));
//  list1.stream().forEach(ele->System.out.println(ele.toString()));
//  
//    	
//    }
    
    
    public void getuserDetailsBySortingOrderDesc() {
 List<User_Detail> list2=  myInterface.findAll(Sort.by(Sort.Direction.DESC, "userName").and(Sort.by("userId")));
 list2.forEach(System.out::println);
//list1.stream().forEach(ele->System.out.println(ele.toString()));
    }
}
