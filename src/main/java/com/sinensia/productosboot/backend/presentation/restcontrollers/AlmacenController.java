package com.sinensia.productosboot.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.productosboot.backend.business.model.Almacen;
import com.sinensia.productosboot.backend.business.services.AlmacenServices;

@RestController
@CrossOrigin
@RequestMapping("/almacenes")
public class AlmacenController {

	@Autowired
	private AlmacenServices almacenServices;
	
	@GetMapping
	public List<Almacen> getAll(){
		return almacenServices.getAll();
	}
}
