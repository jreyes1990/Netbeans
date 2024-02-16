package com.jreyes.jdbc;

import com.jreyes.jdbc.interfaces.ProductoRepositorioImpl;
import com.jreyes.jdbc.interfaces.Repositorio;
import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import java.sql.SQLException;
import java.util.Date;

public class MainJdbc {

  public static void main(String[] args) throws SQLException {
    System.out.println("\n========== Listar productos ==========");
    Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
    repositorio.listar().forEach(System.out::println);

    System.out.println("\n========== Buscar producto por ID ==========");
    System.out.println(repositorio.porId(6L));

    System.out.println("\n========== Insertar producto ==========");
    Producto producto = new Producto();
    Categoria categoria = new Categoria();

    producto.setNombre("Teclado Mecanico");
    producto.setPrecio(500);
    producto.setFechaRegistro(new Date());
    categoria.setId(3L);
    producto.setCategoria(categoria);
    repositorio.guardar(producto);
    System.out.println("Producto ("+producto.getNombre()+") guardado con exito");

    System.out.println("\n========== Listar nuevamente productos ==========");
    repositorio.listar().forEach(p -> System.out.println(p));

    System.out.println("\n========== Actualizar producto ==========");
    producto.setId(6L);
    producto.setNombre("Teclado Razer Mecanico");
    producto.setPrecio(700);
    categoria.setId(3L);
    producto.setCategoria(categoria);

    repositorio.guardar(producto);
    System.out.println("Producto ("+producto.getNombre()+") actualizado con exito");

    System.out.println("\n========== Listar nuevamente productos ==========");
    repositorio.listar().forEach(p -> System.out.println(p));

    System.out.println("\n========== Eliminar producto por ID ==========");
    repositorio.eliminar(7L);
    System.out.println("Producto ("+producto.getNombre()+") eliminado con exito");

    System.out.println("\n========== Listar nuevamente productos ==========");
    repositorio.listar().forEach(p -> System.out.println(p));
  }
}
