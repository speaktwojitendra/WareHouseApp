package com.spring.warehouse.service;

import java.lang.System.Logger;
import java.util.List;
import java.util.function.Supplier;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.warehouse.exception.DataNotFoundException;
import com.spring.warehouse.model.Uom;
import com.spring.warehouse.repository.Uom_Repository;
@Service
public class Uom_service_Implement implements Uom_service_Interface {
@Autowired
Uom_Repository uom_Repository;


	@Override
	public Uom saveData(Uom uom) {
		return uom_Repository.save(uom);
	
	}


	@Override
	public List<Uom> findUomData() {
		// TODO Auto-generated method stub
		return uom_Repository.findAll();
	}


	@Override
	public void deleteUomData(Integer id) {
		// TODO Auto-generated method stub

 uom_Repository.deleteById(getOneUomData(id).getId());
	}


	@Override
	public Uom getOneUomData(Integer id) {
		// TODO Auto-generated method stub
		return uom_Repository.findById(id).orElseThrow(()->new DataNotFoundException("Data not found"));

	}
	

}
