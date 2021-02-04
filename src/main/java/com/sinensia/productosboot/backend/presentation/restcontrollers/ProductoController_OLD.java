package com.sinensia.productosboot.backend.presentation.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

import com.sinensia.productosboot.backend.integration.model.FamiliaPL;
import com.sinensia.productosboot.backend.integration.model.ProductoPL;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto1DTO;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto2DTO;
import com.sinensia.productosboot.backend.integration.model.dtos.Producto3DTO;
import com.sinensia.productosboot.backend.integration.repositories.ProductoPLRepository;

public class ProductoController_OLD {

	private ProductoPLRepository productoRepository;
	
	@GetMapping("/productos1")
	private List<Object[]> getAll(){
		return productoRepository.findDatosTabla();
	}
	
	@GetMapping("/nombres-productos")
	private List<String> getNombresProductos(){
		return productoRepository.findNombres();
	}
	
	@GetMapping("/precios-modificados")
	private List<Object[]> getPreciosModificados(){
		return productoRepository.findPreciosIva();
	}
	
	@GetMapping("/familias")
	private List<FamiliaPL> getFamilias(){
		return productoRepository.getFamilias();
	}
	
	@GetMapping("/estadisticas1")
	private List<Object[]> getEstadisticas1(){
		return productoRepository.getEstadisticaFamilias1();
	}
	
	@GetMapping("/productos1dto")
	private List<Producto1DTO> getProductos1DTO(){
		return productoRepository.getDTO1();
	}
	
	@GetMapping("/productos2dto")
	private List<Producto2DTO> getProductos2DTO(){
		return productoRepository.getDTO2();
	}
	
	@GetMapping("/productos3dto")
	private List<Producto3DTO> getProductos3DTO(){
		return productoRepository.getDTO3();
	}
	
	@GetMapping("/productos")
	private List<ProductoPL> getProductosPorFamilia(@RequestParam ("familia") FamiliaPL familia){
		return productoRepository.findDescatalogadosByFamilia(familia);
	}
	
	@GetMapping("/productos-precios")
	private List<ProductoPL> getProductosDentroListaPrecios(){
		
		List<Double> precios = Arrays.asList(10.0,15.0,20.0);

		return productoRepository.findWithPriceIn(precios);
	}
	
}
