package com.spring.warehouse.service;

import java.util.List;

import com.spring.warehouse.model.Uom;

public interface Uom_service_Interface {
public Uom saveData(Uom uom);

public List<Uom> findUomData();
public void deleteUomData(Integer id);
public Uom getOneUomData(Integer id);
}
