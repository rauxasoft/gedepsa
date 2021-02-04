package com.sinensia.productosboot.backend.presentation.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.productosboot.backend.business.model.Producto;
import com.sinensia.productosboot.backend.business.services.ProductoServices;

@Controller
@RequestMapping("/gestionproductos")
public class AppController {

	@Autowired
	private ProductoServices productoServices;
	
	private Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@RequestMapping(value = {"/home","/"})
	public String home() {
		return "index";									
	}
	
	@RequestMapping("/listado-productos")
	public String getListadoProductos(Model model) {
		
		logger.info("Entramos en getListadoProductos");
		
		List<Producto> productos = productoServices.getAll();
		
		model.addAttribute("productos", productos);
		
		return "productos";
	}
	
	//TODO devolver página HTML con todos los almacenes
	//TODO devolver página HTML con todos los envíos
	
	
	
	
	
	
	
	
}
