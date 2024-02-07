package org.patrones_disenio.decorator.decorador;

import org.patrones_disenio.decorator.interfaces.Formateable;

public class ReversaDecorador extends TextoDecorador {

  public ReversaDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    StringBuilder sb = new StringBuilder(texto.darFormato());
    return sb.reverse().toString();
  }
  
}
