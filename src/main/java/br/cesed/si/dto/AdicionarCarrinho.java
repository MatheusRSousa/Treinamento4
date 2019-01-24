package br.cesed.si.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdicionarCarrinho implements Serializable{

	private static final long serialVersionUID = 1L;

	List<Long> idsProdutos = new ArrayList<>();

	public List<Long> getIdsProdutos() {
		return idsProdutos;
	}

	public void setIdsProdutos(List<Long> idsProdutos) {
		this.idsProdutos = idsProdutos;
	}
	
	
}
