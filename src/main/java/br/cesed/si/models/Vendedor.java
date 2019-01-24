package br.cesed.si.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Vendedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "vendedor_id")
	private Long id;
	
	@Column(name = "vendedor_nome",unique = true, nullable = false)
	private String nome;
	
	@Column(name = "vendedor_cpf",unique = true, nullable = false, length = 11)
	private String cpf;
	
	@Column(name = "vendedor_login",unique = true, nullable = false)
	private String login;
	
	@Column(name = "vendedor_senha",nullable = false)
	private String senha;
	


	public Vendedor() {
		
	}
	
	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
