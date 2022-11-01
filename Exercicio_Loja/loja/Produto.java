package br.com.usjt.loja;

import java.util.Scanner;

public class Produto {

	
	private String tipo;
	private int quantidade1;
	
	Scanner leia = new Scanner(System.in);
	
	public void selecionarProduto() {
		System.out.println("Entre com o tipo do produto: ");
		tipo = leia.next();
		System.out.println("Entre com a quantidade:");
		quantidade1 = leia.nextInt();
		System.out.println("Você optou por " + tipo + "\nquantidade: " + quantidade1);
		
		
		
		
	}
	
	public void buscarProduto() {
		System.out.println("Qual produto deseja encontrar ?");
		tipo = leia.next();
		System.out.println("Você buscou por " + tipo );
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQuantidade() {
		return quantidade1;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade1 = quantidade;
	}
	
	
	
	
	
	
	
}
