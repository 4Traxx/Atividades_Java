/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula1db;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hiago
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        String menu = "1- Cadastrar\n2- Atualizar\n3- Apagar\n4- Listar\n0- Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
                    String telefone = JOptionPane.showInputDialog("Qual é o seu telefone?");
                    String email = JOptionPane.showInputDialog("Qual é o seu email?");
                    
                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome(nome);
                    pessoa.setTelefone(telefone);
                    pessoa.setEmail(email);
                    pessoa.inserir();
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opção inválida");
                }
                }while(op!=0);
        
    }
    
            
        
}
