package br.cesed.si.dto;

import java.io.Serializable;

public class CadastrarVendedor implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String login;
	private String senha;
	
	public CadastrarVendedor(){}
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	
}
