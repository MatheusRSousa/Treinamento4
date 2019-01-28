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

import br.cesed.si.models.Produto;
import br.cesed.si.service.ProdutoService;


@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping(path ="/{id}")
	public ResponseEntity<Produto> readId(@PathVariable Long id)
	{
		return new ResponseEntity<Produto>(service.readId(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Produto>> readAll()
	{
		return new ResponseEntity<List<Produto>>(service.readAll(), HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Produto> create(@RequestBody Produto produto)
	{
		try {
			service.creatProduto(produto);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<Produto> update(@RequestBody Produto produto) 
	{	
		service.updateProduto(produto);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	} 
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Produto> delete(@PathVariable Long id) 
	{
		service.deleteProduto(id);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}
}
