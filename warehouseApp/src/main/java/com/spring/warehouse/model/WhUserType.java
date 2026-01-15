package com.spring.warehouse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="WhUserType_tab")
public class WhUserType {
@Id
@Column(name="whuser_id_col")
@GeneratedValue
private Integer id;
@Column(name="whuser_type_col")
private String userType;
@Column(name="whuser_code_col")
private String usercode;
@Column(name="whuser_for_col")
private String userFor;
@Column(name="whuser_email_col")
private String userEmail;
@Column(name="whuser_contact_col")
private String userContact;

}
