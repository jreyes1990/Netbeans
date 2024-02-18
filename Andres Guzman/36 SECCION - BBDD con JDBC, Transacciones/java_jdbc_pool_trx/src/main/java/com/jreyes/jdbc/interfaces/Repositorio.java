package com.jreyes.jdbc.interfaces;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T> {
  public void setConn(Connection conn);
  public List<T> listar() throws SQLException;
  public T porId(Long id) throws SQLException;
  public T guardar(T t) throws SQLException;
  public void eliminar(Long id) throws SQLException;
}
