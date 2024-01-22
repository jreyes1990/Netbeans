package org.jreyes.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja {
  private String persona;
  private String carrera;
  private List<String> experiencias;

  public Curriculum(String persona, String carrera, String contenido) {
    super(contenido);
    this.persona = persona;
    this.carrera = carrera;
    this.experiencias = new ArrayList<>();
  }

  @Override
  public String imprimir() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(persona).append("\n")
      .append("Resumen: ").append(this.contenido).append("\n")
      .append("Profesion: ").append(this.carrera).append("\n")
      .append("Experiencias: ").append("\n");
    for (String exp : experiencias) {
      sb.append("- ").append(exp).append("\n");
    }
    
    return sb.toString();
  }
  
}