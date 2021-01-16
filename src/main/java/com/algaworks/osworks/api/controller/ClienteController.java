package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> teste() {
		var cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Jefferson o mano lindo do cabral neto");
		cliente1.setEmail("www@gmail.com");
		cliente1.setTelefone("9 9999-9999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Robson");
		cliente2.setEmail("www2@gmail.com");
		cliente2.setTelefone("9 8999-9999");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
