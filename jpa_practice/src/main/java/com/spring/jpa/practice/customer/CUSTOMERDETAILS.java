package com.spring.jpa.practice.customer;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class CUSTOMERDETAILS {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_seq")
@SequenceGenerator(name = "cust_seq", sequenceName = "customer_seq", allocationSize = 1)
private long id;


private String name;

private int age;

private String address;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="pcId")
Product product;

}
