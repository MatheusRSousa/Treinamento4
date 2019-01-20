package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VENDEDORES")
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_VENDEDOR", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "VENDEDOR_NOME")
	private String nome;
	private Long matricula;
	
	public Vendedor(Long id, String nome, Long matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
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
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
}
