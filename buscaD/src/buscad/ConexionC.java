/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ConexionC {
       
   public String db ="inventario";
   public String url ="jdbc:mysql://192.168.5.23/"+db;
   public String user ="remota";
   public String pass = "";
   
    Connection conn=null;
    Statement st=null;
    ResultSet r=null;
   
  public Connection conec() throws SQLException{
        Connection link = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");

            link = DriverManager.getConnection(this.url,this.user,this.pass);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
}
       return link;
    }
 
} 
    
    
    

