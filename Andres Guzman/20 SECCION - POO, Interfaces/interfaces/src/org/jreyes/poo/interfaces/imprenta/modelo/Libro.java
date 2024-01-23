package org.jreyes.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
  private List<Imprimible> paginas;
  private String autor;
  private String titutlo;
  private Genero genero;

  public Libro(String autor, String titutlo, Genero genero) {
    this.autor = autor;
    this.titutlo = titutlo;
    this.genero = genero;
    this.paginas = new ArrayList<>();
  }
  
  public Libro addPagina(Imprimible pagina){
    paginas.add(pagina);
    return this;
  }
  
  public String imprimir(){
    StringBuilder sb = new StringBuilder();
    sb.append("Titulo: ").append(this.titutlo).append("\n")
      .append("Autor: ").append(this.autor).append("\n")
      .append("Genero: ").append(genero).append("\n");
    for (Imprimible pag : this.paginas) {
      sb.append(pag.imprimir()).append("\n");
    }
    
    return sb.toString();
  }
}
