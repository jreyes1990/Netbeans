package org.jreyes.poo.tarea.catalogo;

import org.jreyes.poo.tarea.interfaces.IProducto;

abstract class Producto implements IProducto {
  private int precio;

  public Producto(int precio) {
    this.precio = precio;
  }

  @Override
  public int getPrecio() {
    return precio;
  }
}
