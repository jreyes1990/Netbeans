package org.jreyes.poo.tarea.catalogo;

import java.util.Date;
import org.jreyes.poo.tarea.interfaces.ILibro;

public class Libro extends Producto implements ILibro {
  private Date fechaPublicacion;
  private String autor;
  private String titulo;
  private String editorial;

  public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
    super(precio);
    this.fechaPublicacion = fechaPublicacion;
    this.autor = autor;
    this.titulo = titulo;
    this.editorial = editorial;
  }

  @Override
  public Date getFechaPublicacion() {
    return fechaPublicacion;
  }

  @Override
  public String getAutor() {
    return autor;
  }

  @Override
  public String getTitulo() {
    return titulo;
  }

  @Override
  public String getEditorial() {
    return editorial;
  }

  @Override
  public double getPrecioVenta() {
    // Lógica para calcular el precio de venta específico para Libro
    return getPrecio() * 1.1;
  }
}