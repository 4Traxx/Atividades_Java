package ExercicioLoja;

import javax.swing.JOptionPane;

public class Compra {
	
	Cliente rafael = new Cliente();
	Produto produto = new Produto();
	Pedido pedido = new Pedido();
	
	public void rafael() {
		rafael.setNome("Rafael");
		produto.setTipo("Tênis");
		pedido.setQuatidade(2); 
		pedido.setPreco((float)100 * 2);
		JOptionPane.showMessageDialog(null,"Você selecionou:\n" + "Produto: " + produto.getTipo() + "\nQuantidade: " 
		+ pedido.getQuantidade() + "\nPreço " + "R$:"+ pedido.getPreco());
		rafael.getRealizarPagamento();
	}

	public static void main(String[] args) {
		
		
		
		
		Cliente usuario = new Cliente();
		Compra compra = new Compra();
		
		
		usuario.painelInicio();
		compra.rafael();
		
		
		
	}

}
