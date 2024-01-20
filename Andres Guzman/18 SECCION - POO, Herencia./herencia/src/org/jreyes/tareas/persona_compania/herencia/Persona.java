package org.jreyes.tareas.persona_compania.herencia;

public class Persona {
  private String nombre;
  private String apellido;
  private String numeroFiscal;
  private String direccion;

  // Constructor
  public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroFiscal = numeroFiscal;
    this.direccion = direccion;
  }

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNumeroFiscal() {
    return numeroFiscal;
  }

  public String getDireccion() {
    return direccion;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", numeroFiscal='" + numeroFiscal + '\'' +
            ", direccion='" + direccion + '\'' +
            '}';
  }  
}
