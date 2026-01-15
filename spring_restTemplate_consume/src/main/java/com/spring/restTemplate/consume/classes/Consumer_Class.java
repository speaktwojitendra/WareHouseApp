package com.spring.restTemplate.consume.classes;
import java.util.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer_Class {
@RequestMapping("/data")
public String getProducerData() {
	UserDetails user=new UserDetails();
	user.setAge(15);
	user.setId(12);
	user.setName("Bikash");
	user.setPassword("Bikash@123");
	HttpEntity<UserDetails>entity=new HttpEntity<>(user);
	RestTemplate restTemplate=new RestTemplate();
ResponseEntity<String>restEntity=	restTemplate.exchange("http://localhost:8087/users/register", HttpMethod.POST, entity, String.class);
 String response =restEntity.getBody();

	return response;
	
}
@RequestMapping("/pass")
public List<UserDetails> getDetails(){
RestTemplate restTemplet =new RestTemplate();
Map<String,String>map=new HashMap<>();
map.put("password","sai@123");

return restTemplet.getForEntity("http://localhost:8087/users/password/{password}", List.class,map).getBody();

	
}



}
