package br.cesed.si.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.cesed.si.dto.CadastrarVendedor;
import br.cesed.si.dto.RetornarVendedor;
import br.cesed.si.models.Vendedor;
import br.cesed.si.service.VendedorService;


@Controller
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	private VendedorService service;
	
	@GetMapping(path ="/{id}")
	public ResponseEntity<RetornarVendedor> readId(@PathVariable Long id)
	{
		return new ResponseEntity<RetornarVendedor>(service.readId(id), HttpStatus.OK);
	}
	
	@GetMapping("/todos")
	public ResponseEntity<List<RetornarVendedor>> readAll()
	{
		return new ResponseEntity<List<RetornarVendedor>>(service.readAll(), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<CadastrarVendedor> create(@RequestBody CadastrarVendedor cadastrarVendedor)
	{
		try {
			service.creatVendedor(cadastrarVendedor);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<CadastrarVendedor>(HttpStatus.OK);
	}
	
	@PutMapping("/atualiza")
	public ResponseEntity<Vendedor> update(@RequestBody Vendedor vendedor) 
	{	
		service.updateVendedor(vendedor);
		return new ResponseEntity<Vendedor>(HttpStatus.OK);
	} 
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Vendedor> delete(@PathVariable Long id) 
	{
		service.deleteVendedor(id);
		return new ResponseEntity<Vendedor>(HttpStatus.OK);
	}
}
