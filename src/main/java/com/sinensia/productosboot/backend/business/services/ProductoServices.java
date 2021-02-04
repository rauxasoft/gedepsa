package com.sinensia.productosboot.backend.business.services;

import java.util.List;

import com.sinensia.productosboot.backend.business.model.Producto;

public interface ProductoServices {

	public Producto read(int codigo);
	
	public List<Producto> getAll();
	
	public Producto save(Producto producto);
	
}
