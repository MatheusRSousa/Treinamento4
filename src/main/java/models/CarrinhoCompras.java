package models;

public class CarrinhoCompras {

	private Produto produto;
	private int qtd_produto;
	
	public CarrinhoCompras(Produto produto, int qtd_produto) {
		super();
		this.produto = produto;
		this.qtd_produto = qtd_produto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtd_produto() {
		return qtd_produto;
	}
	public void setQtd_produto(int qtd_produto) {
		this.qtd_produto = qtd_produto;
	}
	
	
	
}
