package com.sinensia.productosboot.backend.business.services;

import java.util.List;

import com.sinensia.productosboot.backend.business.model.Almacen;

public interface AlmacenServices {

	public Almacen read(int codigo);
	
	public List<Almacen> getAll();
	
	public Almacen save(Almacen almacen);
}
