package br.cesed.si.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "produto_id")
	private Long id;
	
	@Column(name = "produto_nome", nullable = false)
	private String nome;
	
	@Column(name = "produto_qtd", nullable = false)
	private Integer qtd;
	
	
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getQtd() {
		return qtd;
	}


	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
