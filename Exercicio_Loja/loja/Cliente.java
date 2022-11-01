package br.com.usjt.loja;

import java.util.Scanner;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	
	Scanner leia = new Scanner(System.in);
	Pedido pedido = new Pedido();
	
	public void chamaPedido() {
		pedido.setPreco(45.0);
		pedido.setQuantidade(1);
		pedido.setData("14/10/2022");
		System.out.println("Preço : " + pedido.getPreco() + ", quantidade : " + pedido.getQuantidade() + " data: " + pedido.getData());
	}
	
	
	
	
	
	public void realizarLogin() {
		System.out.println("Para realizar o login, digite seu nome: ");
		nome = leia.next();
		System.out.println("Agora, digite seu e-mail:");
		email = leia.next();
		System.out.println (nome + " , você está logado!!");
		
		
	}
	
	public void realizarCadastro() {
		System.out.println("Para realizar o cadastro, siga os passos a seguir ");
		System.out.println("Digite seu nome: ");
		nome= leia.next();
		System.out.println("Digite um e-mail válido: ");
		email= leia.next();
		System.out.println("Digite seu telefone: ");
		telefone = leia.next();
		System.out.println("Digite seu endereço: ");
		endereco = leia.next();
		System.out.println("Cliente " + nome + " cadastrado com sucesso!!");
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
