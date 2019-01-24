package br.cesed.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.dto.AdicionarCarrinho;
import br.cesed.si.models.CarrinhoCompras;
import br.cesed.si.repositories.CarrinhoComprasRepository;

@Service
public class CarrinhoComprasService {

	@Autowired
	private CarrinhoComprasRepository repository;
	
	
	@Autowired
	private ProdutoService produtoService;
	
	public void creatCarrinho(AdicionarCarrinho adicionarCarrinho) 
	{	CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.getProdutos().addAll(produtoService.findByProdutos(adicionarCarrinho.getIdsProdutos()));
		repository.save(carrinho);
	}
	
	public CarrinhoCompras readId(Long id) 
	{	if(repository.existsById(id))
		{	 return repository.findById(id).get();
		}
		return null;
	}
	
	public List<CarrinhoCompras> readAll()
	{
		return repository.findAll();
	}
	
	public void updateCarrinho(CarrinhoCompras carrinhocompras) {
		if (repository.existsById(carrinhocompras.getId())) {
			repository.save(carrinhocompras);
		}
	}
	
	public void deleteCarrinho(Long id) 
	{
		if (repository.existsById(id)) {
			repository.deleteById(id);
		}
	}
	
}
