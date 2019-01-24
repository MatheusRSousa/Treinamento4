package br.cesed.si.models;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CarrinhoCompras {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "carrinho_id")
	private Long id;
	
	@OneToMany
	@JoinColumn(name = "carrinho_id")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public CarrinhoCompras() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
