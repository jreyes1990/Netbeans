package com.jreyes.jdbc.interfaces;

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
         ResultSet rs = stmt.executeQuery("select * from productos");
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
    
    try (PreparedStatement stmt = getConnection().prepareStatement("select * from productos where id = ?")) {
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
      sql = "update productos set nombre=?, precio=? where id=?";
    } else {
      sql = "insert into productos(nombre, precio, fecha_registro) values(?, ?, ?)";
    }
    
    try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
      stmt.setString(1, producto.getNombre());
      stmt.setLong(2, producto.getPrecio());
      
      if (producto.getId() != null && producto.getId() > 0) {
        stmt.setLong(3, producto.getId());
      } else {
        stmt.setDate(3, new Date(producto.getFechaRegistro().getTime()));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void eliminar(Long id) {
    try (PreparedStatement stmt = getConnection().prepareStatement("delete from productos where id = ?")) {
      stmt.setLong(1, id);
      stmt.executeQuery();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private Producto crearProducto(final ResultSet rs) throws SQLException {
    Producto p = new Producto();
    p.setId(rs.getLong("id"));
    p.setNombre(rs.getString("nombre"));
    p.setPrecio(rs.getInt("precio"));
    p.setFechaRegistro(rs.getDate("fecha_registro"));
    return p;
  }
}
