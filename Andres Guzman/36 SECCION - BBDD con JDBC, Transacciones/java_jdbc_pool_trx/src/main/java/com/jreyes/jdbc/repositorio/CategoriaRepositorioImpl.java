package com.jreyes.jdbc.repositorio;

import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositorioImpl implements Repositorio<Categoria>{
  private Connection conn;

  public CategoriaRepositorioImpl() {
  }

  public CategoriaRepositorioImpl(Connection conn) {
    this.conn = conn;
  }

  public void setConn(Connection conn) {
    this.conn = conn;
  }
  
  @Override
  public List<Categoria> listar() throws SQLException {
    List<Categoria> categorias = new ArrayList<>();
    
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("select * from categorias");
        ) {
      while (rs.next()) {        
        Categoria c = crearCategoria(rs);
        categorias.add(c);
      }
    }
    
    return categorias;
  }

  @Override
  public Categoria porId(Long id) throws SQLException {
    Categoria categoria = null;
    
    try (PreparedStatement stmt = conn.prepareStatement("select * from categorias as c where c.id = ?")) {
      stmt.setLong(1, id);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          categoria = crearCategoria(rs);
        }
      }
    }
    
    return categoria;
  }

  @Override
  public Categoria guardar(Categoria categoria) throws SQLException {
    String sql = null;
    
    if (categoria.getId() != null && categoria.getId() > 0) {
      sql = "update categorias set nombre=? where id=?";
    } else {
      sql = "insert into categorias(nombre) values(?)";
    }
    
    try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      stmt.setString(1, categoria.getNombre());
      
      if (categoria.getId() != null && categoria.getId() > 0) {
        stmt.setLong(1, categoria.getId());
      }
      
      stmt.executeUpdate();
      
      if (categoria.getId() == null) {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
          if (rs.next()) {
            categoria.setId(rs.getLong(1));
          }
        }
      }
    }
    
    return categoria;
  }

  @Override
  public void eliminar(Long id) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement("delete from categorias where id = ?")) {
      stmt.setLong(1, id);
      stmt.executeUpdate();
    }
  }
  
  private Categoria crearCategoria(final ResultSet rs) throws SQLException {
    Categoria c = new Categoria();
    c.setId(rs.getLong("id"));
    c.setNombre(rs.getString("nombre"));
    return c;
  }
}
