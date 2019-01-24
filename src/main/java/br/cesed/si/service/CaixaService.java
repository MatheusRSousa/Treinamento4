package br.cesed.si.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.models.Caixa;
import br.cesed.si.repositories.CaixaRepository;

@Service
public class CaixaService {

	@Autowired
	private CaixaRepository caixaRepository;
	
	public void creatCaixa(Caixa caixa) 
	{	caixaRepository.save(caixa);
	}
	
	public Caixa readId(Long id) 
	{	if(caixaRepository.existsById(id))
		{	 return caixaRepository.findById(id).get();
		}
		return null;
	}
	
	public List<Caixa> readAll()
	{
		return caixaRepository.findAll();
	}
	
	public void updateCaixa(Caixa caixa) {
		if (caixaRepository.existsById(caixa.getId())) {
			caixaRepository.save(caixa);
		}
	}
	
	public void deleteCaixa(Long id) 
	{
		if (caixaRepository.existsById(id)) {
			caixaRepository.deleteById(id);
		}
	}
	
}
