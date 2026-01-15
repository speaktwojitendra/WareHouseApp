package com.spring.warehouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.warehouse.exception.DataNotFoundException;
import com.spring.warehouse.model.OrderMethod;
import com.spring.warehouse.repository.OrderMethod_Repository;
@Service
public class OrderMethod_Service_Implementetion implements OrderMethod_Service_Interface {
@Autowired
OrderMethod_Repository orderRepository;
	@Override
	public void saveData(OrderMethod order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}
	@Override
	public List<OrderMethod> findAllData() {
		return orderRepository.findAll();
		// TODO Auto-generated method stub
		
	}
	@Override
	public OrderMethod findOneData(Integer id) {
		// TODO Auto-generated method stub
		OrderMethod order=orderRepository.findById(id).orElseThrow(()->new DataNotFoundException("No order id found"));
		return order;
	}
	@Override
	public void deleteData(Integer id) {
	orderRepository.deleteById(findOneData( id).getId());
		// TODO Auto-generated method stub
		
	}

}
