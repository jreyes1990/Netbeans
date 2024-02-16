package com.jreyes.jdbc.repositorio;

import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {
  
  private Connection conn;

  public ProductoRepositorioImpl(Connection conn) {
    this.conn = conn;
  }

  @Override
  public List<Producto> listar() throws SQLException {
    List<Producto> productos = new ArrayList<>();
    
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("select p.*, c.nombre as categoria from productos as p left join categorias as c on(p.categoria_id=c.id)");
        ) {
      while (rs.next()) {        
        Producto p = crearProducto(rs);
        productos.add(p);
      }
    }
    
    return productos;
  }

  @Override
  public Producto porId(Long id) throws SQLException {
    Producto producto = null;
    
    try (PreparedStatement stmt = conn.prepareStatement("select p.*, c.nombre as categoria from productos as p left join categorias as c on(p.categoria_id=c.id) where p.id = ?")) {
      stmt.setLong(1, id);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          producto = crearProducto(rs);
        }
      }
    }
    
    return producto;
  }

  @Override
  public Producto guardar(Producto producto) throws SQLException {
    String sql;
    
    if (producto.getId() != null && producto.getId() > 0) {
      sql = "update productos set nombre=?, precio=?, categoria_id=?, sku=? where id=?";
    } else {
      sql = "insert into productos(nombre, precio, categoria_id, sku, fecha_registro) values(?, ?, ?, ?, ?)";
    }
    
    try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      stmt.setString(1, producto.getNombre());
      stmt.setLong(2, producto.getPrecio());
      stmt.setLong(3, producto.getCategoria().getId());
      stmt.setString(4, producto.getSku());
      
      if (producto.getId() != null && producto.getId() > 0) {
        stmt.setLong(5, producto.getId());
      } else {
        stmt.setDate(5, new Date(producto.getFechaRegistro().getTime()));
      }
      
      stmt.executeUpdate();
      
      if (producto.getId() == null) {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
          if (rs.next()) {
            producto.setId(rs.getLong(1));
          }
        }
      }
      
      return producto;
    }
  }

  @Override
  public void eliminar(Long id) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement("delete from productos where id = ?")) {
      stmt.setLong(1, id);
      stmt.executeUpdate();
    }
  }
  
  private Producto crearProducto(final ResultSet rs) throws SQLException {
    Producto p = new Producto();
    Categoria categoria = new Categoria();
    
    p.setId(rs.getLong("id"));
    p.setNombre(rs.getString("nombre"));
    p.setPrecio(rs.getInt("precio"));
    p.setFechaRegistro(rs.getDate("fecha_registro"));
    categoria.setId(rs.getLong("categoria_id"));
    categoria.setNombre(rs.getString("categoria"));
    p.setCategoria(categoria);
    p.setSku(rs.getString("sku"));
    
    return p;
  }
}
