package com.sinensia.productosboot.backend.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.productosboot.backend.business.model.Producto;
import com.sinensia.productosboot.backend.business.services.ProductoServices;
import com.sinensia.productosboot.backend.integration.model.ProductoPL;
import com.sinensia.productosboot.backend.integration.repositories.ProductoPLRepository;

@Service
public class ProductoServicesImpl implements ProductoServices {

	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private ProductoPLRepository productoPLRepository;
	
	@Override
	public Producto read(int codigo) {
		
		Optional<ProductoPL> optionalProductoPL = productoPLRepository.findById(codigo);
		
		ProductoPL productoPL = optionalProductoPL.isPresent()? optionalProductoPL.get(): null;
		
		// Tenemos que convertir un ProductoPL => Producto
		
		Producto producto = dozerBeanMapper.map(productoPL, Producto.class);
		
		return producto;
	}

	@Override
	public List<Producto> getAll() {

		List<ProductoPL> productosPL = productoPLRepository.findAll();
		
		List<Producto> productos = new ArrayList<>();

		for(ProductoPL productoPL: productosPL) {
			productos.add(dozerBeanMapper.map(productoPL, Producto.class));
		}
		
		return productos;
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		
		ProductoPL productoPL = dozerBeanMapper.map(producto, ProductoPL.class);
		
		ProductoPL createdProductoPL = productoPLRepository.save(productoPL);
		
		Producto createdProducto = dozerBeanMapper.map(createdProductoPL, Producto.class);
		
		return createdProducto;
	}

}
