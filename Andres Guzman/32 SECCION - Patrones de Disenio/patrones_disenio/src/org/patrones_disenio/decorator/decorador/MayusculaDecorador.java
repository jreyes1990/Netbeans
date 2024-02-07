package org.patrones_disenio.decorator.decorador;

import org.patrones_disenio.decorator.interfaces.Formateable;

public class MayusculaDecorador extends TextoDecorador {

  public MayusculaDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    return texto.darFormato().toUpperCase();
  }
  
}
