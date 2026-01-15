package com.spring.warehouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.warehouse.exception.DataNotFoundException;
import com.spring.warehouse.model.ShipmentType;
import com.spring.warehouse.repository.ShpmentTypeRepo;
@Component
public class ShipmentType_Implement_service implements ShipmentType_Interface {
@Autowired
ShpmentTypeRepo shipmentTypeRepo;
	@Override
	public Integer saveShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub

		ShipmentType s1 =shipmentTypeRepo.save(s);
		
		return s1.getId();
	}

	@Override
	public void updateShipmentType(ShipmentType s) {
		// TODO Auto-generated method stub
		
		shipmentTypeRepo.save(s);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		// TODO Auto-generated method stub
	//ShipmentType type=	getOneShipmentType(id);
	shipmentTypeRepo.deleteById(id);
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		// TODO Auto-generated method stub
		ShipmentType type=	shipmentTypeRepo.findById(id).orElseThrow(()->new DataNotFoundException("Data is not found"));
	return 	type;
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
		// TODO Auto-generated method stub
		return shipmentTypeRepo.findAll();
	}

}
