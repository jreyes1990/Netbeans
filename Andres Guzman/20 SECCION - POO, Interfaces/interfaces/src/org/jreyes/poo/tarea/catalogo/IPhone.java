package org.jreyes.poo.tarea.catalogo;

public class IPhone extends Electronico {
  private String modelo;
  private String color;

  public IPhone(int precio, String fabricante, String modelo, String color) {
    super(precio, fabricante);
    this.modelo = modelo;
    this.color = color;
  }

  public String getModelo() {
    return modelo;
  }

  public String getColor() {
    return color;
  }

  @Override
  public double getPrecioVenta() {
    // Lógica para calcular el precio de venta específico para IPhone
    return getPrecio() * 1.2;
  }
}
