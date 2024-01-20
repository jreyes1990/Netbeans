package org.jreyes.tareas.almacen_verduleria.herencia;

public class Fruta extends Producto {
  private double peso;
  private String color;

  // Constructor
  public Fruta(String nombre, double precio, double peso, String color) {
    super(nombre, precio);
    this.peso = peso;
    this.color = color;
  }

  // Getters
  public double getPeso() {
    return peso;
  }

  public String getColor() {
    return color;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return super.toString() + ", Peso: " + peso + "kg, Color: " + color;
  }
}
