package com.spring_jpa;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpa1Application {

    

	public static void main(String[] args) {
ConfigurableApplicationContext	configurableApplicationContext=  SpringApplication.run(SpringJpa1Application.class, args);
Operation operation=configurableApplicationContext.getBean(Operation.class);
//	operation.addDetails();

//operation.deleteData();
//	operation.getAll();


//operation.getAllusers();
//operation.insertDataByNativeQuery(109, "Karti@123","kartika");
//operation.insertDataByNativeQuery2(110, "tata@123","Tata");
//operation.getuserDetailsBySortingorder();
operation.getuserDetailsBySortingOrderDesc();
	}

}
