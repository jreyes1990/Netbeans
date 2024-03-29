package org.jreyes.poo.herencia;

// Clase hija: Profesor, Clase Padre: Persona
public class Profesor extends Persona {
  private String asignatura;

  public Profesor() {
    System.out.println("Profesor: Inicializando contructor");
  }

  public Profesor(String nombre, String apellido) {
    super(nombre, apellido);
  }

  public Profesor(String asignatura, String nombre, String apellido) {
    super(nombre, apellido);
    this.asignatura = asignatura;
  }
  
  public String getAsignatura() {
    return asignatura;
  }

  public void setAsignatura(String asignatura) {
    this.asignatura = asignatura;
  }

  @Override
  public String saludar() {
    return "Buenos dias soy el profesor de "+getAsignatura()+", mi nombre es "+getNombre();
  }

  @Override
  public String toString() {
    return super.toString()+", asignatura=" + asignatura;
  }
  
}
