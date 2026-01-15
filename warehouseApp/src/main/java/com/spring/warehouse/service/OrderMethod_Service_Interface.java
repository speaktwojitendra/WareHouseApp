package com.spring.warehouse.service;

import java.util.List;

import com.spring.warehouse.model.OrderMethod;

public interface OrderMethod_Service_Interface {
void saveData(OrderMethod order);
List<OrderMethod> findAllData();
OrderMethod findOneData(Integer id);
void deleteData(Integer id);

}
