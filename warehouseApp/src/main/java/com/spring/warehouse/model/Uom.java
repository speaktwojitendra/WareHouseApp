package com.spring.warehouse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="uom_tab")
public class Uom {
@jakarta.persistence.Id
@GeneratedValue
@Column(name="uom_id_col")
private Integer Id;
@Column(name="uom_type_col")
private String uom_type;
@Column(name="uom_model_col")
private String uom_model;
@Column(name="uom_description_col")
private String uom_description;

}
