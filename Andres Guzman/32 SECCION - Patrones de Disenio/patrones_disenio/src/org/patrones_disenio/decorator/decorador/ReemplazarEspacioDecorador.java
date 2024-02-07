package org.patrones_disenio.decorator.decorador;

import org.patrones_disenio.decorator.interfaces.Formateable;

public class ReemplazarEspacioDecorador extends TextoDecorador {

  public ReemplazarEspacioDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    return texto.darFormato().replace(" ", "_");
  }
  
}
