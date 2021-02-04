package com.sinensia.productosboot.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.productosboot.backend.business.model.Producto;
import com.sinensia.productosboot.backend.business.services.ProductoServices;

@RestController
@CrossOrigin
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoServices productoServices;
	
	@GetMapping
	public List<Producto> getAll(){
		return productoServices.getAll();
	}
	
	@GetMapping("/{codigo}")
	public Producto getById(@PathVariable("codigo") Integer codigo) {
		return productoServices.read(codigo);
	}
	
	@PostMapping
	public Producto create(@RequestBody Producto producto) {
		return productoServices.save(producto);
	}
	
}
