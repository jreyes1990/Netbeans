package com.jreyes.jdbc.interfaces;

import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {
  
  private Connection getConnection() throws SQLException{
    return ConexionBD.getInstance();
  }

  @Override
  public List<Producto> listar() {
    List<Producto> productos = new ArrayList<>();
    
    try (Statement stmt = getConnection().createStatement();
         ResultSet rs = stmt.executeQuery("select p.*, c.nombre as categoria from productos as p left join categorias as c on(p.categoria_id=c.id)");
        ) {
      while (rs.next()) {        
        Producto p = crearProducto(rs);
        productos.add(p);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return productos;
  }

  @Override
  public Producto porId(Long id) {
    Producto producto = null;
    
    try (PreparedStatement stmt = getConnection().prepareStatement("select p.*, c.nombre as categoria from productos as p left join categorias as c on(p.categoria_id=c.id) where p.id = ?")) {
      stmt.setLong(1, id);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          producto = crearProducto(rs);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return producto;
  }

  @Override
  public void guardar(Producto producto) {
    String sql;
    
    if (producto.getId() != null && producto.getId() > 0) {
      sql = "update productos set nombre=?, precio=?, categoria_id=? where id=?";
    } else {
      sql = "insert into productos(nombre, precio, categoria_id, fecha_registro) values(?, ?, ?, ?)";
    }
    
    try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
      stmt.setString(1, producto.getNombre());
      stmt.setLong(2, producto.getPrecio());
      stmt.setLong(3, producto.getCategoria().getId());
      
      if (producto.getId() != null && producto.getId() > 0) {
        stmt.setLong(4, producto.getId());
      } else {
        stmt.setDate(4, new Date(producto.getFechaRegistro().getTime()));
      }
      
      stmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void eliminar(Long id) {
    try (PreparedStatement stmt = getConnection().prepareStatement("delete from productos where id = ?")) {
      stmt.setLong(1, id);
      stmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
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
    
    return p;
  }
}
