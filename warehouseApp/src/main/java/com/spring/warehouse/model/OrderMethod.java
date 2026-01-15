package com.spring.warehouse.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="orderMethod_tab")
public class OrderMethod {
	@Id
	@GeneratedValue
private Integer id;
	@Column(name="orderMode_col")
private String orderMode;
	@Column(name="orderCode_col")
private String orderCode;
	@Column(name="orderType")
private String orderType;

	@ElementCollection
	@CollectionTable(name="orderAcpt_tab",joinColumns = @JoinColumn(name="order_id_col"))
private List<String>orderAcpt;
	@Column(name="description_col")
private String description;

}
