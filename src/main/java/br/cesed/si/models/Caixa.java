package br.cesed.si.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Caixa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "caixa_id")
	private Long id;
	
	@Column(name = "valor_compra", nullable = false)
	private Double valorCompra;
	
	@Column(name = "valor_recebido",nullable = false)
	private Double valorRecebido;
	
	@Column(name = "troco", nullable = false)
	private Double troco;
	
	@OneToOne
	@JoinColumn(name = "caixa_id")
	private Vendedor vendedor;
	
	public Caixa() {
		
	}
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Double getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public Double getTroco() {
		return troco;
	}
	public void setTroco(Double troco) {
		this.troco = troco;
	}
	
	
}
