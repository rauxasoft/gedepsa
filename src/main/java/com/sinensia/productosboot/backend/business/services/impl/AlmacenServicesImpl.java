package com.sinensia.productosboot.backend.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.productosboot.backend.business.model.Almacen;
import com.sinensia.productosboot.backend.business.services.AlmacenServices;
import com.sinensia.productosboot.backend.integration.model.AlmacenPL;
import com.sinensia.productosboot.backend.integration.repositories.AlmacenPLRepository;

@Service
public class AlmacenServicesImpl implements AlmacenServices {

	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private AlmacenPLRepository almacenPLRepository;
	
	@Override
	public Almacen read(int codigo) {
		
		Optional<AlmacenPL> optionalAlmacenPL = almacenPLRepository.findById(codigo);
		AlmacenPL almacenPL = optionalAlmacenPL.isPresent()? optionalAlmacenPL.get(): null;
		Almacen almacen = dozerBeanMapper.map(almacenPL, Almacen.class);
		
		return almacen;
	}

	@Override
	public List<Almacen> getAll() {
		
		List<AlmacenPL> almacenesPL = almacenPLRepository.findAll();
		List<Almacen> almacenenes = new ArrayList<>();

		for(AlmacenPL almacenPL: almacenesPL) {
			almacenenes.add(dozerBeanMapper.map(almacenPL, Almacen.class));
		}
		
		return almacenenes;
	}

	@Override
	@Transactional
	public Almacen save(Almacen almacen) {
		
		AlmacenPL almacenPL = dozerBeanMapper.map(almacen, AlmacenPL.class);
		
		AlmacenPL createdAlmacenPL = almacenPLRepository.save(almacenPL);
		
		Almacen createdAlmacen = dozerBeanMapper.map(createdAlmacenPL, Almacen.class);
		
		return createdAlmacen;
	}

}
