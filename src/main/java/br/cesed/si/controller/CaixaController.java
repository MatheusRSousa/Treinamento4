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

import br.cesed.si.models.Caixa;
import br.cesed.si.service.CaixaService;

@Controller
@RequestMapping("/caixa")
public class CaixaController {

	@Autowired
	private CaixaService caixaservice;
	
	@GetMapping(path ="/{id}")
	public ResponseEntity<Caixa> readId(@PathVariable Long id)
	{
		return new ResponseEntity<Caixa>(caixaservice.readId(id), HttpStatus.OK);
	}
	
	@GetMapping("/todos")
	public ResponseEntity<List<Caixa>> readAll()
	{
		return new ResponseEntity<List<Caixa>>(caixaservice.readAll(), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Caixa> create(@RequestBody Caixa caixa)
	{
		caixaservice.creatCaixa(caixa);
		return new ResponseEntity<Caixa>(HttpStatus.OK);
	}
	
	@PutMapping("/atualiza")
	public ResponseEntity<Caixa> update(@RequestBody Caixa caixa) 
	{	
		caixaservice.updateCaixa(caixa);
		return new ResponseEntity<Caixa>(HttpStatus.OK);
	} 
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Caixa> delete(@PathVariable Long id) 
	{
		caixaservice.deleteCaixa(id);
		return new ResponseEntity<Caixa>(HttpStatus.OK);
	}
	
}
