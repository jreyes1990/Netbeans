package org.jreyes.poo.tarea.catalogo;

public class TvLcd extends Electronico {
  private int pulgada;

  public TvLcd(int precio, String fabricante, int pulgada) {
    super(precio, fabricante);
    this.pulgada = pulgada;
  }

  public int getPulgada() {
    return pulgada;
  }

  @Override
  public double getPrecioVenta() {
    // Lógica para calcular el precio de venta específico para TvLcd
    return getPrecio() * 1.15;
  }
}
