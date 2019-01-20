package models;

import java.util.List;

public class Caixa {
	
	private Double entrada;
	private Double saida;
	private List<CarrinhoCompras> carrinho;
	private Double valorvenda;
	private Vendedor vendedor;
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Double getValorvenda() {
		return valorvenda;
	}
	public void setValorvenda(Double valorvenda) {
		this.valorvenda = valorvenda;
	}
	public Double getEntrada() {
		return entrada;
	}
	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}
	public Double getSaida() {
		return saida;
	}
	public void setSaida(Double saida) {
		this.saida = saida;
	}
	public List<CarrinhoCompras> getVenda() {
		return carrinho;
	}
	public void setVenda(List<CarrinhoCompras> carrinho) {
		this.carrinho = carrinho;
	}

	
}
