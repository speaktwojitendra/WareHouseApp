package com.spring.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.spring.warehouse.model.Uom;
import com.spring.warehouse.service.Uom_service_Interface;

@Controller
public class Uom_Controller {
	@Autowired
	Uom_service_Interface uom_service_Interface;
	@GetMapping("/register")
	  public String showForm(Model model) {
        // Provide a form-backing object named "uom"
        model.addAttribute("uom", new Uom());

        // Provide dynamic options for the select (optional)
        model.addAttribute("types", List.of("packing", "noPacking", "Na"));

        // Optional message placeholder
        model.addAttribute("msg", "registered successful");

        return "UomRegister";
    }

@PostMapping("/save")

public String saveDetails(@ModelAttribute Uom uom,Model model) {
	
	uom_service_Interface.saveData(uom);
	model.addAttribute("message","Successfully added");
	model.addAttribute("uom", uom_service_Interface.findUomData());
	return "UomData";
}
@GetMapping("uom_data")
public String findUomData(Model model) {
List<Uom>uom=	uom_service_Interface.findUomData();
	model.addAttribute("uom",uom);
	return "UomData";
	
}
@GetMapping("/delete")
public String deleteUom(@RequestParam Integer id,Model model) {
	uom_service_Interface.deleteUomData(id);
	model.addAttribute("uom",uom_service_Interface.findUomData());
	return "UomData";
	
}
@GetMapping("/edit")
public String editUomData(@RequestParam Integer id,Model model) {
	model.addAttribute("uom",uom_service_Interface.getOneUomData(id) );
	
	return "UomEdit";
	
}
@PostMapping("/update")
public String updateUomData(@ModelAttribute Uom uom, Model model) {
	uom_service_Interface.saveData(uom);
	model.addAttribute("uom",uom_service_Interface.findUomData());
	return "UomData";
}



}
