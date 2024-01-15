package org.jreyes.poo.herencia;

// Clase hija: Alumno, Clase Padre: Persona
public class Alumno extends Persona {
  private String institucion;
  private double notaMatematica;
  private double notaCastellano;
  private double notaHistoria;
  
  public Alumno() {
    System.out.println("Alumno: Inicializando contructor");
  }

  public String getInstitucion() {
    return institucion;
  }

  public void setInstitucion(String institucion) {
    this.institucion = institucion;
  }

  public double getNotaMatematica() {
    return notaMatematica;
  }

  public void setNotaMatematica(double notaMatematica) {
    this.notaMatematica = notaMatematica;
  }

  public double getNotaCastellano() {
    return notaCastellano;
  }

  public void setNotaCastellano(double notaCastellano) {
    this.notaCastellano = notaCastellano;
  }

  public double getNotaHistoria() {
    return notaHistoria;
  }

  public void setNotaHistoria(double notaHistoria) {
    this.notaHistoria = notaHistoria;
  }
  
}
