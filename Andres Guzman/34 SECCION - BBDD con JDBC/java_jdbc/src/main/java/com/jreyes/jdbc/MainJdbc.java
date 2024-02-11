package com.jreyes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJdbc {
  
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/java_curso?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String password = "root";
    
    try {
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
      ResultSet resultado = stmt.executeQuery("select * from productos");
      while (resultado.next()) {        
        System.out.println(resultado.getString("nombre"));
      }
      resultado.close();
      stmt.close();
      conn.close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }  
}
