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
    return productoRepositorio.listar();
  }

  @Override
  public Producto porIdProducto(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
      return productoRepositorio.porId(id);
    }
  }

  @Override
  public Producto guardarProducto(Producto producto) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
      
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      Producto nuevoProducto = null;
      
      try {
        nuevoProducto = productoRepositorio.guardar(producto);
        conn.commit();
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
      }
      
      return nuevoProducto;
    }
  }

  @Override
  public void eliminarProducto(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
      
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      try {
        productoRepositorio.eliminar(id);
        conn.commit();
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
      }
    }
  }

  @Override
  public List<Categoria> listarCategoria() throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
      return categoriaRepositorio.listar();
    }
  }

  @Override
  public Categoria porIdCategoria(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
      
      return categoriaRepositorio.porId(id);
    }
  }

  @Override
  public Categoria guardarCategoria(Categoria categoria) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
      
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      Categoria nuevaCategoria = null;
      
      try {
        nuevaCategoria = categoriaRepositorio.guardar(categoria);
        conn.commit();
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
      }
      
      return nuevaCategoria;
    }
  }

  @Override
  public void eliminarCategoria(Long id) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      categoriaRepositorio.setConn(conn);
      
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      try {
        categoriaRepositorio.eliminar(id);
        conn.commit();
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
      }
    }
  }

  @Override
  public void guardarProductoCategoria(Producto producto, Categoria categoria) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      productoRepositorio.setConn(conn);
      categoriaRepositorio.setConn(conn);
      
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      try {
        Categoria nuevaCategoria = categoriaRepositorio.guardar(categoria);
        producto.setCategoria(nuevaCategoria);
        productoRepositorio.guardar(producto);
        conn.commit();
      } catch (SQLException e) {
        conn.rollback();
        e.printStackTrace();
      }
    }
  }
  
}
