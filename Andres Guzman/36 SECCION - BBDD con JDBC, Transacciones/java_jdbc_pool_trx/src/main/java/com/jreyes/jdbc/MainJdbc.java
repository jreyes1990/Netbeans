package com.jreyes.jdbc;

import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.repositorio.CategoriaRepositorioImpl;
import com.jreyes.jdbc.repositorio.ProductoRepositorioImpl;
import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class MainJdbc {

  public static void main(String[] args) throws SQLException {
    try (Connection conn = ConexionBD.getConnection()) {
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
      }
      
      System.out.println("\n========== Insertar nueva categoria ==========");
      Repositorio<Categoria> repositorioCategoria = new CategoriaRepositorioImpl(conn);
      Categoria categoria = new Categoria();
      categoria.setNombre("Electrohogar");
      Categoria nuevaCategoria = repositorioCategoria.guardar(categoria);
      System.out.println("Categoria ("+nuevaCategoria.getNombre()+") guardado con exito");
      
      System.out.println("\n========== Listar productos ==========");
      Repositorio<Producto> repositorioProducto = new ProductoRepositorioImpl(conn);
      repositorioProducto.listar().forEach(System.out::println);

      System.out.println("\n========== Buscar producto por ID ==========");
      System.out.println(repositorioProducto.porId(1L));

      System.out.println("\n========== Insertar producto ==========");
      Producto producto = new Producto();
      producto.setNombre("Refrigerador Samsung");
      producto.setPrecio(9900);
      producto.setCategoria(nuevaCategoria);
      producto.setSku("abcde23456");
      producto.setFechaRegistro(new Date());
      repositorioProducto.guardar(producto);
      System.out.println("Producto ("+producto.getNombre()+") guardado con exito");
      
      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorioProducto.listar().forEach(p -> System.out.println(p));
      
      conn.commit();

      /*
      System.out.println("\n========== Actualizar producto ==========");
      producto.setId(6L);
      producto.setNombre("Teclado Razer Mecanico");
      producto.setPrecio(700);
      categoria.setId(3L);
      producto.setCategoria(categoria);

      repositorio.guardar(producto);
      System.out.println("Producto ("+producto.getNombre()+") actualizado con exito");

      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorioProducto.listar().forEach(p -> System.out.println(p));

      System.out.println("\n========== Eliminar producto por ID ==========");
      repositorioProducto.eliminar(7L);
      System.out.println("Producto ("+producto.getNombre()+") eliminado con exito");

      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorioProducto.listar().forEach(p -> System.out.println(p));
      */
    }
  }
}
