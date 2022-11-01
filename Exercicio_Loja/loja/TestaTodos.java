package br.com.usjt.loja;

public class TestaTodos {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Pedido pedido = new Pedido();
		Compra compra = new Compra();
		Cliente cliente = new Cliente();
		
		compra.chamaCliente();
		System.out.println("=================================");
		
		pedido.chamaProduto();
		System.out.println("================================");
		
		cliente.chamaPedido();
		System.out.println("================================");
	
		
		compra.realizarPagamento();
		System.out.println("================================");
		
		produto.selecionarProduto();
		System.out.println("================================");
		
		produto.buscarProduto();
		System.out.println("================================");
		
		cliente.realizarLogin();
		System.out.println("================================");
		
		cliente.realizarCadastro();
		System.out.println("================================");
		
		
		

	}

}
