package com.sinensia.productosboot.backend.business.services;

import java.util.List;

import com.sinensia.productosboot.backend.business.model.Envio;

public interface EnvioServices {

	public Envio read(int codigo);
	
	public List<Envio> getAll();
	
	public Envio save(Envio envio);
	
}
