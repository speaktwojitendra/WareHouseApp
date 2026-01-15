package com.spring.warehouse.service;

import java.util.List;

import com.spring.warehouse.model.ShipmentType;

public interface ShipmentType_Interface {
Integer saveShipmentType(ShipmentType s);
void updateShipmentType(ShipmentType s);
void deleteShipmentType(Integer id);
ShipmentType getOneShipmentType(Integer id);
List<ShipmentType> getAllShipmentType();

}
