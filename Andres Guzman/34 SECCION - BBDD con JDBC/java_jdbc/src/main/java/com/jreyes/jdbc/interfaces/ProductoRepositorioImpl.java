package com.jreyes.jdbc.interfaces;

import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
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
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setFechaRegistro(rs.getDate("fecha_registro"));
        productos.add(p);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return productos;
  }

  @Override
  public Producto porId(Long id) {
    return null;
  }

  @Override
  public void guardar(Producto t) {
  }

  @Override
  public void eliminar(Long id) {
  }
  
}
