package com.jreyes.jdbc;

import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJdbc {
  
  public static void main(String[] args) { 
    try (Connection conn = ConexionBD.getInstance();
         Statement stmt = conn.createStatement();
         ResultSet resultado = stmt.executeQuery("select * from productos");
        ) {
      while (resultado.next()) {   
        System.out.print(resultado.getInt("id"));
        System.out.print(" | ");
        System.out.print(resultado.getString("nombre"));
        System.out.print("\t | ");
        System.out.print(resultado.getInt("precio"));
        System.out.print("\t | ");
        System.out.println(resultado.getDate("fecha_registro"));
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }  
}
