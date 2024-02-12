package com.jreyes.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  private static String url = "jdbc:mysql://localhost:3306/java_curso?useSSL=false&serverTimezone=UTC";
  private static String user = "root";
  private static String password = "root";
  private static Connection connection;

  public static Connection getInstance() throws SQLException {
    //if (connection == null) {
      connection = DriverManager.getConnection(url, user, password);
    //}
    
    return connection;
  }
  
}
