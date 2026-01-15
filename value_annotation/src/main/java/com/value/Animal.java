package com.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {
private String AnimalName;

public Animal(@Value("${animal.name}") String animalName,@Value("${animal.id}") int animalId) {
	
	AnimalName = animalName;
	AnimalId = animalId;

	System.out.println("Animal Object created");
}
private int AnimalId;

public String getAnimalName() {
	return AnimalName;
}
public int getAnimalId() {
	return AnimalId;
}
public void setAnimalName(String animalName) {
	AnimalName = animalName;
}
public void setAnimalId(int animalId) {
	AnimalId = animalId;
}
	

}
