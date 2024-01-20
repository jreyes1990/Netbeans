package org.jreyes.tareas.almacen_verduleria.herencia;

public class Producto {
  private String nombre;
  private double precio;

  // Constructor
  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  // Getters
  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Precio: $" + precio;
  }
}
