package org.jreyes.poo.tarea.catalogo;

import java.util.Date;

public class Comics extends Libro {
  private String personaje;

  public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
    super(precio, fechaPublicacion, autor, titulo, editorial);
    this.personaje = personaje;
  }

  public String getPersonaje() {
    return personaje;
  }

  @Override
  public double getPrecioVenta() {
    // Lógica para calcular el precio de venta específico para Comics
    return getPrecio() * 1.3;
  }
}
