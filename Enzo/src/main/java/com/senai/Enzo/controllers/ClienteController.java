package com.senai.Enzo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Enzo.entities.Cliente;
import com.senai.Enzo.services.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final ClienteService clienteService;
	 
	 @Autowired
	 public ClienteController (ClienteService clienteService) {
		 this.clienteService = clienteService;
	 }
	 
	 @PostMapping
	 public Cliente createProduct(@RequestBody Cliente cliente ) {
		 return clienteService.saveCliente(cliente);
	 }
	 @GetMapping
	 public List<Cliente> getAllCliente(){
		 return clienteService.getAllCliente();
	 }
	 @GetMapping("/{id}")
	 public Cliente getCliente(@PathVariable Long idcCliente) {
		 return clienteService.getClienteById(idcCliente);
	 }
	 @DeleteMapping("/{id}")
	 public void deleteProduto(@PathVariable Long idcCliente) {
		 clienteService.deleteCliente(idcCliente);
	 }
}
