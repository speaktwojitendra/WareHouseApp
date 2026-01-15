package com.spring.warehouse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="shipmate_tab")
public class ShipmentType {
	@Id
	@Column(name="shp_id_col")
	@GeneratedValue
private Integer id;
	
	@Column(name="shp_mode_col")
private String shipmentMode;
	@Column(name="shp_code_col")
	private String shipmentCode;
	@Column(name="shp_enable_col")
	private String enableShipment;
	
	@Column(name="shp_grade_col")
	private String shipmentGrade;
	@Column(name="shp_description_col")
	private String description;
}
