package com.sinensia.productosboot.backend.presentation.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.productosboot.backend.business.model.Envio;
import com.sinensia.productosboot.backend.business.services.EnvioServices;

@RestController
@CrossOrigin
@RequestMapping("/envios")
public class EnvioController {

	@Autowired
	private EnvioServices envioServices;
	
	@GetMapping
	public List<Envio> getAll(){
		return envioServices.getAll();
	}

}
