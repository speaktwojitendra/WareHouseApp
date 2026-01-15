package com.Spring.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {
	

	public static void main(String[] args) {
		String query="insert into emp111 values(101,'jk')";
ApplicationContext context=		SpringApplication.run(SpringJdbcApplication.class, args);
Jdbc_Demo  table=context.getBean(Jdbc_Demo.class );
System.out.println(table.template.update(query));
System.out.println("data inserted successfully");
table.insertData(7369);
table.loadData();
		
	}

}
