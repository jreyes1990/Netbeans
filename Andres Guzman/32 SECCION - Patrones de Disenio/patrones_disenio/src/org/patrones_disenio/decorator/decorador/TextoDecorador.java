package org.patrones_disenio.decorator.decorador;

import org.patrones_disenio.decorator.interfaces.Formateable;

abstract public class TextoDecorador implements Formateable {
  protected Formateable texto;

  public TextoDecorador(Formateable texto) {
    this.texto = texto;
  }
  
}
