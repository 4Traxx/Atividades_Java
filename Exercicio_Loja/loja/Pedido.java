package br.com.usjt.loja;

public class Pedido {
	
	private int quantidade;
	private double preco;
	private String data;
	
	Produto prod = new Produto();
	
	
	
	public void chamaProduto() {
		prod.setTipo("Tênis");
		prod.setQuantidade(4);
		System.out.println("Produto " + prod.getTipo() + " quantidade " + prod.getQuantidade());
		
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}
