package com.spring.jpa.entity;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Users")
@Data
public class Users {
@Id
private int u_id;
private  String uname;
@OneToOne(cascade = CascadeType.ALL)

private Address address1 ;
}
