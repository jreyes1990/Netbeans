package com.jreyes.jdbc;

import com.jreyes.jdbc.interfaces.ProductoRepositorioImpl;
import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.util.ConexionBD;
import java.sql.Connection;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
// import java.sql.Statement;

public class MainJdbc {

  public static void main(String[] args) {
    /*
     * try (Connection conn = ConexionBD.getInstance();
     * Statement stmt = conn.createStatement();
     * ResultSet resultado = stmt.executeQuery("select * from productos");
     * ) {
     * while (resultado.next()) {
     * System.out.print(resultado.getInt("id"));
     * System.out.print(" | ");
     * System.out.print(resultado.getString("nombre"));
     * System.out.print("\t | ");
     * System.out.print(resultado.getInt("precio"));
     * System.out.print("\t | ");
     * System.out.println(resultado.getDate("fecha_registro"));
     * }
     * } catch (SQLException ex) {
     * ex.printStackTrace();
     * }
     */

    try (Connection conn = ConexionBD.getInstance()) {
      System.out.println("\n========== Listar productos ==========");
      Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
      repositorio.listar().forEach(System.out::println);

      System.out.println("\n========== Buscar producto por ID ==========");
      System.out.println(repositorio.porId(1L));
      
      System.out.println("\n========== Insertar producto ==========");
      Producto producto = new Producto();
      producto.setNombre("Teclado Mecanico");
      producto.setPrecio(500);
      producto.setFechaRegistro(new Date());
      repositorio.guardar(producto);
      System.out.println("Producto ("+producto.getNombre()+") guardado con exito");
      
      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorio.listar().forEach(p -> System.out.println(p));
      
      System.out.println("\n========== Actualizar producto ==========");
      producto.setId(4L);
      producto.setNombre("Teclado Razer Mecanico");
      producto.setPrecio(700);
      repositorio.guardar(producto);
      System.out.println("Producto ("+producto.getNombre()+") actualizado con exito");
      
      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorio.listar().forEach(p -> System.out.println(p));
      
      System.out.println("\n========== Eliminar producto por ID ==========");
      repositorio.eliminar(4L);
      System.out.println("Producto ("+producto.getNombre()+") eliminado con exito");
      
      System.out.println("\n========== Listar nuevamente productos ==========");
      repositorio.listar().forEach(p -> System.out.println(p));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
