package org.jreyes.tareas.almacen_verduleria.herencia;

public class Limpieza extends Producto {
  private String componentes;
  private double litros;

  // Constructor
  public Limpieza(String nombre, double precio, String componentes, double litros) {
    super(nombre, precio);
    this.componentes = componentes;
    this.litros = litros;
  }

  // Getters
  public String getComponentes() {
    return componentes;
  }

  public double getLitros() {
    return litros;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return super.toString() + ", Componentes: " + componentes + ", Litros: " + litros + "L";
  }
}
