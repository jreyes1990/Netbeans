package com.jreyes.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionBD {
  private static String url = "jdbc:mysql://localhost:3306/java_curso?useSSL=false&serverTimezone=UTC";
  private static String user = "root";
  private static String password = "root";
  private static BasicDataSource pool;

  public static BasicDataSource getInstance() {
    if (pool == null) {
      pool = new BasicDataSource();
      pool.setUrl(url);
      pool.setUsername(user);
      pool.setPassword(password);
      pool.setInitialSize(3);
      pool.setMinIdle(3);
      pool.setMaxIdle(8);
      pool.setMaxTotal(8);
    }
    
    return pool;
  }
  
  public static Connection getConnection() throws SQLException{
    return getInstance().getConnection();
  }
}
