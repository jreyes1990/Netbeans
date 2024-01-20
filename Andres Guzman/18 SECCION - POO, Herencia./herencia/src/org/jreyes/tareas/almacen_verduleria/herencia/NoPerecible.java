package org.jreyes.tareas.almacen_verduleria.herencia;

public class NoPerecible extends Producto {
  private int contenido;
  private int calorias;

  // Constructor
  public NoPerecible(String nombre, double precio, int contenido, int calorias) {
    super(nombre, precio);
    this.contenido = contenido;
    this.calorias = calorias;
  }

  // Getters
  public int getContenido() {
    return contenido;
  }

  public int getCalorias() {
    return calorias;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return super.toString() + ", Contenido: " + contenido + " unidades, Calorías: " + calorias;
  }
}
