package org.jreyes.poo.herencia;

public class AlumnoInternacional extends Alumno{
  private String pais;
  private double notaIdiomas;

  public AlumnoInternacional() {
    System.out.println("AlumnoInternacional: Inicializando contructor");
  }
  
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public double getNotaIdiomas() {
    return notaIdiomas;
  }

  public void setNotaIdiomas(double notaIdiomas) {
    this.notaIdiomas = notaIdiomas;
  }
  
}
