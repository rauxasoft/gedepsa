package com.sinensia.productosboot.backend.business.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.productosboot.backend.business.model.Envio;
import com.sinensia.productosboot.backend.business.services.EnvioServices;
import com.sinensia.productosboot.backend.integration.repositories.EnvioPLRepository;

@Service
public class EnvioServicesImpl implements EnvioServices {

	@SuppressWarnings("unused")
	@Autowired
	private EnvioPLRepository envioPLRepository;
	
	@Override
	public Envio read(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Envio> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Envio save(Envio envio) {
		// TODO Auto-generated method stub
		return null;
	}

}
