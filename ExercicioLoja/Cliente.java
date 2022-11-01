package ExercicioLoja;

import javax.swing.JOptionPane;

public class Cliente {
	String usr, pswd, tipo;
	int qtd;
	private String nome;
	private String email;
	private int telefone;
	private String senha;
	private String endereco;
	private String realizarLogin; 
	private String realizarCadastro;
	private String buscarProduto;
	private String selecionarProduto;
	private String realizarPagamento;
	
	
	Produto produto = new Produto();
	Pedido pedido = new Pedido();
	
	
	
	
	public Cliente() {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.endereco = endereco;
		this.realizarLogin = realizarLogin;
		this.realizarCadastro = realizarCadastro;
		this.buscarProduto = buscarProduto;
		this.selecionarProduto = selecionarProduto;
		this.realizarPagamento = realizarPagamento;
		this.pedido = pedido;
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



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getRealizarLogin() {
		return realizarLogin;
	}



	public void setRealizarLogin(String realizarLogin) {
		this.realizarLogin = realizarLogin;
	}



	public String getRealizarCadastro() {
		return realizarCadastro;
	}



	public void setRealizarCadastro(String realizarCadastro) {
		this.realizarCadastro = realizarCadastro;
	}



	public String getBuscarProduto() {
		return buscarProduto;
	}



	public void setBuscarProduto(String buscarProduto) {
		this.buscarProduto = buscarProduto;
	}



	public String getSelecionarProduto() {
		return selecionarProduto;
	}



	public void setSelecionarProduto(String selecionarProduto) {
		this.selecionarProduto = selecionarProduto;
	}



	public void getRealizarPagamento() { 
		//o usuário rafael não precisa escolher uma opção
		if(nome.equals("Rafael")){ 
			JOptionPane.showMessageDialog(null, "Operação selecionada: Débito");
			JOptionPane.showMessageDialog(null, "Pagamento concluído! Muito obrigado " + nome + ", volte sempre!");
			System.exit(0);
		}
		
		Object[] opcao = { "Crédito", "Débito", "Cancelar" };
		int pgto = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento", "Pagamento", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcao, opcao[0]);
		
		 
		if (pgto == 0) {
			JOptionPane.showMessageDialog(null, "Operação selecionada: Crédito");
				
		}
		
		else if(pgto == 1){
			JOptionPane.showMessageDialog(null, "Operação selecionada: Débito");
			
		}
		
		else if(pgto == 2){
			JOptionPane.showMessageDialog(null, "Operação cancelada");
			buscarProduto();
		}
		
		JOptionPane.showMessageDialog(null, "Pagamento concluído! Muito obrigado " + nome + ", volte sempre!");
		System.exit(0);
		
		
	}



	public void setRealizarPagamento(String realizarPagamento) {
		this.realizarPagamento = realizarPagamento;
	}



	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
	public void painelInicio() {
		//Usar opção "Fazer Login" apenas para os métodos já cadastrados: (ex: Rafael, produto, etc)
		Object[] opcao = { "Fazer Login", "Criar conta",};
		int pgto = JOptionPane.showOptionDialog(null, "Já possui cadastro no nosso sistema?", "Bem-Vindo!", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, opcao, opcao[0]);
		
		 
		if (pgto == 0) {
			System.out.println("Login");
			realizarLogin();
		}
		
		else if(pgto == 1){
			System.out.println("Criar cadastro");	
			realizarCadastro();
		}
		
		
		
	}
	

	
	public void realizarCadastro() {
		nome = JOptionPane.showInputDialog("Digite seu nome", getNome());
		email = JOptionPane.showInputDialog("Digite seu e-mail", getEmail());
		JOptionPane.showInputDialog("Digite seu endereço", getEndereco());
		JOptionPane.showInputDialog("Digite seu telefone", getTelefone());
		senha = JOptionPane.showInputDialog("Digite sua senha", getSenha());
		
		JOptionPane.showMessageDialog(null, "Cadastro concluído!");
		
		realizarLogin();
		
		
	}
	
	public void realizarLogin() {
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		
		//métodos já pré-cadastrados inserem apenas o nome em Login(Ex: Rafael ou produto), sem necessidade de senha
		usr = JOptionPane.showInputDialog(null, "Digite seu email");
		pswd = JOptionPane.showInputDialog(null, "Digite sua senha");
		
		
		if ((usr.equals(email)) && (pswd.equals(senha))) {
			JOptionPane.showMessageDialog(null, " bem-vindo " + nome + "!" );
			buscarProduto();
		} else if (usr.equals("Rafael")) {
			JOptionPane.showMessageDialog(null,"Bem-vindo " + usr + "!");	
			
		}
		
		else if (usr.equals("produto")) {
			JOptionPane.showMessageDialog(null,"Bem-vindo " + usr + "!");	
			produto();
		}
		
		else { 
			JOptionPane.showMessageDialog(null, usr + " Usuário ou senha inválida");
			System.exit(0);
		}
		
	}
	
	public void buscarProduto() {
		tipo = JOptionPane.showInputDialog(null, "Digite o tipo do produto que deseja buscar", getBuscarProduto());
		qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade desejada", pedido.getQuantidade()));
		
		int selec = JOptionPane.showConfirmDialog(null,"Você selecionou:\n" + "Produto: " + tipo + "\nQuantidade: " + qtd);
		
		
		if (selec == 0) {
			System.out.println("Indo para pagamento");	
			revisao();
		}
		
		else if(selec == 1){
			buscarProduto();
		}
		
		else if(selec == 2){
			realizarLogin();	
		}
	}
	
	public void revisao() {
		setBuscarProduto(tipo);
		pedido.setQuatidade(qtd);
		produto.setQuantidadeP(100);
		pedido.setPreco((float)75.0 * qtd);
		
		JOptionPane.showMessageDialog(null,"Você selecionou:\n" + "Produto: " + tipo + "\nQuantidade: " + qtd 
				+ "\nPreço " + "R$:"+ pedido.getPreco());
		getRealizarPagamento();
			
	}
	
	public void produto () {
		setNome("Produto");
		pedido.setPreco((float) 45.00);
		pedido.setQuatidade(1);
		pedido.setData("14/10/2022");
		JOptionPane.showMessageDialog(null,"Você selecionou:\n" + "Produto: " + produto.getTipo() + "\nQuantidade: " 
		+ pedido.getQuantidade() + "\nPreço " + "R$:"+ pedido.getPreco() + "\nData: " + pedido.getData());
		getRealizarPagamento();
		
	}
	
	
}
