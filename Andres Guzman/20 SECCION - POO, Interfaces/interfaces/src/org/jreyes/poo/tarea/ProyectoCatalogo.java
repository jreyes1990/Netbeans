package org.jreyes.poo.tarea;

import java.util.Date;
import org.jreyes.poo.tarea.catalogo.Libro;
import org.jreyes.poo.tarea.catalogo.Comics;
import org.jreyes.poo.tarea.catalogo.IPhone;
import org.jreyes.poo.tarea.catalogo.TvLcd;
import org.jreyes.poo.tarea.interfaces.IElectronico;
import org.jreyes.poo.tarea.interfaces.ILibro;
import org.jreyes.poo.tarea.interfaces.IProducto;

public class ProyectoCatalogo {

  public static void main(String[] args) {
    IProducto[] productos = new IProducto[7];

    productos[0] = new IPhone(800, "Apple", "iPhone 12", "Negro");
    productos[1] = new TvLcd(1000, "Sony", 55);
    productos[2] = new Libro(20, new Date(), "Autor1", "Libro1", "Editorial0");
    productos[3] = new Libro(15, new Date(), "Autor2", "Libro2", "Editorial1");
    productos[4] = new Comics(30, new Date(), "Autor3", "Comic1", "Editorial3", "Superhéroe1");
    productos[5] = new IPhone(900, "Samsung", "Galaxy S21", "Azul");
    productos[6] = new TvLcd(800, "LG", 42);

    for (IProducto producto : productos) {
      System.out.print("Tipo de: " + producto.getClass().getName());
      System.out.print(" - ");
      System.out.print("Precio: " + producto.getPrecio());
      System.out.print(" - ");
      System.out.print("Precio final: " + producto.getPrecioVenta());

      // Para los Electronicos  ============
      if (producto instanceof IElectronico) {
        System.out.print(" - ");
        System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

        // Para los IPhone ============
        if (producto instanceof IPhone) {
          System.out.print(" - ");
          System.out.print("Modelo: " + ((IPhone) producto).getModelo());
          System.out.print(" - ");
          System.out.print("Color: " + ((IPhone) producto).getColor());
        }

        // Para los LCD  ============
        if (producto instanceof TvLcd) {
          System.out.print(" - ");
          System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
        }
      }

      // Para los Libros  ============
      if (producto instanceof ILibro) {
        System.out.print(" - ");
        System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
        System.out.print(" - ");
        System.out.print("Autor: " + ((ILibro) producto).getAutor());

        // Para los Comics  ============
        if (producto instanceof Comics) {
          System.out.print(" - ");
          System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
        }
      }

      System.out.println();
    }
  }
}
