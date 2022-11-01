package ExercicioLoja;

public class Pedido {
	private int quantidade;
	private float preco;
	private String data;
	
	Produto produto = new Produto();
	
	
	public Pedido() {
		this.quantidade = quantidade;
		this.preco = preco;
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuatidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	

	public void estoque() {
		
		produto.setTipo("Tênis");
		produto.setQuantidadeP(4);
			
	}
	
	
	
}
