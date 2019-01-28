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

import br.cesed.si.dto.AdicionarCarrinho;
import br.cesed.si.models.CarrinhoCompras;

import br.cesed.si.service.CarrinhoComprasService;


@Controller
@RequestMapping("/carrinhos")
public class CarrinhoComprasController {

	@Autowired
	private CarrinhoComprasService service;
	
	@GetMapping(path ="/{id}")
	public ResponseEntity<CarrinhoCompras> readId(@PathVariable Long id)
	{
		return new ResponseEntity<CarrinhoCompras>(service.readId(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<CarrinhoCompras>> readAll()
	{
		return new ResponseEntity<List<CarrinhoCompras>>(service.readAll(), HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<AdicionarCarrinho> create(@RequestBody AdicionarCarrinho carrinhocompras)
	{
		service.creatCarrinho(carrinhocompras);
		return new ResponseEntity<AdicionarCarrinho>(HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<CarrinhoCompras> update(@RequestBody CarrinhoCompras carrinhocompras) 
	{	
		service.updateCarrinho(carrinhocompras);
		return new ResponseEntity<CarrinhoCompras>(HttpStatus.OK);
	} 
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<CarrinhoCompras> delete(@PathVariable Long id) 
	{
		service.deleteCarrinho(id);
		return new ResponseEntity<CarrinhoCompras>(HttpStatus.OK);
	}
}
