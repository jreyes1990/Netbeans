package com.jreyes.jdbc.services;

import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.repositorio.CategoriaRepositorioImpl;
import com.jreyes.jdbc.repositorio.ProductoRepositorioImpl;
import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Servicio {
  private Repositorio<Producto> productoRepositorio;
  private Repositorio<Categoria> categoriaRepositorio;

  public CatalogoServicio() {
    this.productoRepositorio = new ProductoRepositorioImpl();
    this.categoriaRepositorio = new CategoriaRepositorioImpl();
  }

  @Override
  public List<Producto> listarProducto() throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
    } 
    return null;
  }

  @Override
  public Producto porIdProducto(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
    }
    return null;
  }

  @Override
  public Producto guardarProducto(Producto producto) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
    }
    return null;
  }

  @Override
  public void eliminarProducto(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
    }
  }

  @Override
  public List<Categoria> listarCategoria() throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
    }
    return null;
  }

  @Override
  public Categoria porIdCategoria(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
    }
    return null;
  }

  @Override
  public Categoria guardarCategori(Categoria categoria) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
    }
    return null;
  }

  @Override
  public void eliminarCategoria(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
    }
  }

  @Override
  public void guardarProductoCategoria(Producto producto, Categoria categoria) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
      categoriaRepositorio.setConn(conn);
    }
  }
  
}
