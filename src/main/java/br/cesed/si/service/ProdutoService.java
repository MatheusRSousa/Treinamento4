package br.cesed.si.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.models.Produto;
import br.cesed.si.repositories.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public void creatProduto(Produto produto) throws Exception
	{	if(repository.existsByNome(produto.getNome())) 
		{	throw new Exception("Este produto já existe");
		}
		repository.save(produto);
	}
	
	public Produto readId(Long id) 
	{	if(repository.existsById(id))
		{	 return repository.findById(id).get();
		}
		return null;
	}
	
	public List<Produto> readAll()
	{
		return repository.findAll();
	}
	
	public void updateProduto(Produto produto) {
		if (repository.existsById(produto.getId())) {
			repository.save(produto);
		}
	}
	
	public void deleteProduto(Long id) 
	{
		if (repository.existsById(id)) {
			repository.deleteById(id);
		}
	}
	
	public List<Produto> findByProdutos(List<Long> idsProdutos){
		List<Produto> produtos = new ArrayList<>();
		for (Long idProduto : idsProdutos) {
			Produto produto = repository.findById(idProduto).get();
			produtos.add(produto);
		}
		return produtos;
	}
	
	public List<Produto> findByAllName(String nome)
	{	return repository.buscaPorNome(nome);
	}
}
