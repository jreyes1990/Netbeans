package com.jreyes.jdbc;

import com.jreyes.jdbc.modelo.Categoria;
import com.jreyes.jdbc.modelo.Producto;
import com.jreyes.jdbc.services.CatalogoServicio;
import com.jreyes.jdbc.services.Servicio;
import java.sql.SQLException;
import java.util.Date;

public class MainJdbcTrx {

  public static void main(String[] args) throws SQLException {
    Servicio servicio = new CatalogoServicio();
    
    System.out.println("\n========== Listar productos ==========");
    servicio.listarProducto().forEach(System.out::println);
    
    System.out.println("\n========== Insertar nueva categoria ==========");
    Categoria categoria = new Categoria();
    categoria.setNombre("Iluminacion");
    System.out.println("Categoria ("+categoria.getNombre()+") guardado con exito");

    System.out.println("\n========== Buscar producto por ID ==========");
    System.out.println(servicio.porIdProducto(1L));

    System.out.println("\n========== Insertar producto ==========");
    Producto producto = new Producto();
    producto.setNombre("Lampara LED escritorio");
    producto.setPrecio(990);
    producto.setSku("bcdef34567");
    producto.setFechaRegistro(new Date());
    servicio.guardarProductoCategoria(producto, categoria);
    System.out.println("Producto ("+producto.getNombre()+") guardado con exito");

    System.out.println("\n========== Listar nuevamente productos ==========");
    servicio.listarProducto().forEach(p -> System.out.println(p));
      
  }
}
