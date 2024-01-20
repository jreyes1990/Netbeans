package org.jreyes.tareas.almacen_verduleria;

import org.jreyes.tareas.almacen_verduleria.herencia.Fruta;
import org.jreyes.tareas.almacen_verduleria.herencia.Lacteo;
import org.jreyes.tareas.almacen_verduleria.herencia.Limpieza;
import org.jreyes.tareas.almacen_verduleria.herencia.NoPerecible;
import org.jreyes.tareas.almacen_verduleria.herencia.Producto;

public class Almacen {

  public static void main(String[] args) {
    // Crear productos de cada tipo
    Producto[] productos = new Producto[8];
    productos[0] = new Lacteo("Leche", 2.5, 1, 5);
    productos[1] = new Lacteo("Yogurt", 1.8, 2, 3);

    productos[2] = new Fruta("Manzana", 0.8, 0.2, "Roja");
    productos[3] = new Fruta("Banana", 0.5, 0.15, "Amarilla");

    productos[4] = new Limpieza("Detergente", 3.0, "Químicos de limpieza", 1.5);
    productos[5] = new Limpieza("Jabón", 1.2, "Componentes suavizantes", 1.0);

    productos[6] = new NoPerecible("Arroz", 2.0, 5, 200);
    productos[7] = new NoPerecible("Lentejas", 1.5, 3, 150);

    // Imprimir detalles de los productos
    for (Producto producto : productos) {
      System.out.println(producto.toString());
    }
  }  
}
