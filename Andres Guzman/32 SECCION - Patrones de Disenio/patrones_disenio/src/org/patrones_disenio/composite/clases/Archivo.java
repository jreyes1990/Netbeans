package org.patrones_disenio.composite.clases;

import org.patrones_disenio.composite.abstracto.Componente;

public class Archivo extends Componente {

  public Archivo(String nombre) {
    super(nombre);
  }
  
  @Override
  public String mostrar(int nivel) {
    return "\t".repeat(nivel)+nombre;
  }
  
}
