package org.jreyes.tareas.almacen_verduleria.herencia;

public class Lacteo extends Producto {
  private int cantidad;
  private int proteinas;

  // Constructor
  public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
    super(nombre, precio);
    this.cantidad = cantidad;
    this.proteinas = proteinas;
  }

  // Getters
  public int getCantidad() {
    return cantidad;
  }

  public int getProteinas() {
    return proteinas;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return super.toString() + ", Cantidad: " + cantidad + ", Proteínas: " + proteinas + "g";
  }
}
