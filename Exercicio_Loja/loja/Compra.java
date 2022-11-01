package br.com.usjt.loja;

import java.util.Scanner;

public class Compra {
	private int opcao;
	private String formaPagamento;
	
	Scanner leia = new Scanner(System.in);
	
	Cliente cliente = new Cliente();
	Pedido pedido = new Pedido();
	
	
	
	public void chamaCliente() {
		cliente.setNome("Rafael");
		formaPagamento = "Débito";
		pedido.setPreco(100.0);
		pedido.setQuantidade(2);
			
		System.out.println("======== Dados da compra ======== ");
		System.out.println("Nome do cliente : " + cliente.getNome());
		System.out.println("Forma de pagamento : " + formaPagamento);
		System.out.println("Valor do produto : " + pedido.getPreco() + " por unidade.");
		System.out.println("Quantidade : " + pedido.getQuantidade());
		
		
		
	}
	
	
	public void realizarPagamento() {
		System.out.println("==== Escolha uma opção de pagamento ==== \nDigite 1 para pagamento em crédito ou 2 para pagamento em débito:");
		opcao = leia.nextInt();
		
		if(opcao == 1) {
			System.out.println("Você escolheu a opção crédito");
		}else if(opcao ==2){
			System.out.println("Você escolheu a opcao débito.");
			
		}else {
			System.out.println("Opção inválida!!!");
		}
	}


	public int getOpcao() {
		return opcao;
	}


	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	
	
	

}
