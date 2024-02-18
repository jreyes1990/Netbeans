package com.jreyes.jdbc.services;

import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import java.sql.SQLException;
import java.util.List;

public interface Servicio {
  public List<Producto> listarProducto() throws SQLException;
  public Producto porIdProducto(Long id) throws SQLException;
  public Producto guardarProducto(Producto producto) throws SQLException;
  public void eliminarProducto(Long id) throws SQLException;
  public List<Categoria> listarCategoria() throws SQLException;
  public Categoria porIdCategoria(Long id) throws SQLException;
  public Categoria guardarCategori(Categoria categoria) throws SQLException;
  public void eliminarCategoria(Long id) throws SQLException;
  public void guardarProductoCategoria(Producto producto, Categoria categoria) throws SQLException;
}
