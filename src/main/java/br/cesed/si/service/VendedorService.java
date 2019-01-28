package br.cesed.si.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.dto.CadastrarVendedor;
import br.cesed.si.dto.RetornarVendedor;
import br.cesed.si.models.Vendedor;
import br.cesed.si.repositories.VendedorRepository;


@Service
public class VendedorService {

	@Autowired
	private VendedorRepository repository;
	
	public void creatVendedor(CadastrarVendedor cadastrarVendedor) throws Exception
	{	if(cadastrarVendedor.getCpf().length()!=11) 
			{	throw new Exception("CPF inválido!");
			}
		if(cadastrarVendedor.getSenha().length()<8) 
			{	throw new Exception("Senha inválida! A senha deve conter mais de oito caracteres");
			}
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(cadastrarVendedor.getNome());
		vendedor.setLogin(cadastrarVendedor.getLogin());
		vendedor.setSenha(cadastrarVendedor.getSenha());
		vendedor.setCpf(cadastrarVendedor.getCpf());
		repository.save(vendedor);
	}
	
	public RetornarVendedor readId(Long id) 
	{	if(repository.existsById(id))
		{	RetornarVendedor retornar = new RetornarVendedor();
			retornar.setNome(repository.findById(id).get().getNome());
			retornar.setCpf(repository.findById(id).get().getCpf());
			return retornar;
		}
		return null;
	}
	
	public List<RetornarVendedor> readAll()
	{	
		List<Vendedor> vendedores = repository.findAll();
		List<RetornarVendedor> retornos = new ArrayList<>();
		for (Vendedor vendedor : vendedores) {
			RetornarVendedor retornar = new RetornarVendedor();
			retornar.setCpf(vendedor.getCpf());
			retornar.setNome(vendedor.getNome());
			retornos.add(retornar);
		}
		return retornos;
	}
	
	public void updateVendedor(Vendedor vendedor) {
		if (repository.existsById(vendedor.getId())) {
			repository.save(vendedor);
		}
	}
	
	public void deleteVendedor(Long id) 
	{
		if (repository.existsById(id)) {
			repository.deleteById(id);
		}
	}
	
	
	public List<RetornarVendedor> readByName(String nome) 
	{	List<Vendedor> vendedores = new ArrayList<>(); 
		vendedores.addAll(repository.buscaPorNome(nome));
		List<RetornarVendedor> retornarVendedores = new ArrayList<>();
		for (Vendedor vendedor : vendedores) {
				RetornarVendedor retornarVendedor = new RetornarVendedor();
				retornarVendedor.setCpf(vendedor.getCpf());
				retornarVendedor.setNome(vendedor.getNome());
				retornarVendedores.add(retornarVendedor);
		}
		return retornarVendedores;
	}
	
	public List<RetornarVendedor> readByCpf(String cpf)
	{	List<Vendedor> vendedores = new ArrayList<>(); 
		vendedores.addAll(repository.buscaPorCpf(cpf));
		List<RetornarVendedor> retornarVendedores = new ArrayList<>();
		for (Vendedor vendedor : vendedores) {
				RetornarVendedor retornarVendedor = new RetornarVendedor();
				retornarVendedor.setCpf(vendedor.getCpf());
				retornarVendedor.setNome(vendedor.getNome());
				retornarVendedores.add(retornarVendedor);
	}
	return retornarVendedores;
	}
	
	
	
}

