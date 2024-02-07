package org.patrones_disenio.decorator.clases;

import org.patrones_disenio.decorator.interfaces.Formateable;

public class Texto implements Formateable{
  private String texto;

  public Texto(String texto) {
    this.texto = texto;
  }

  public String getTexto() {
    return texto;
  }
  
  @Override
  public String darFormato() {
    return getTexto();
  }
  
}
