/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula1db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hiago
 */
public class ConnectionFactory {
   private String usuario = "root";
   private String senha = "@Hiagosilva3110";
   private String host = "localhost";
   private String porta = "3306";
   private String bd = "Pessoa";
   
   public Connection obtemConexao() throws SQLException{
       try{
       
           Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + 
                                porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
           return con;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
       
       
       
   }
           
}
