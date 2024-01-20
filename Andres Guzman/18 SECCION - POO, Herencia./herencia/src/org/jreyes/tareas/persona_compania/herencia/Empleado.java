package org.jreyes.tareas.persona_compania.herencia;

public class Empleado extends Persona {
  private double remuneracion;
  private int empleadoId;

  // Constructor
  public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
    super(nombre, apellido, numeroFiscal, direccion);
    this.remuneracion = remuneracion;
    this.empleadoId = empleadoId;
  }

  // Getter
  public double getRemuneracion() {
    return remuneracion;
  }

  // Método para aumentar la remuneración
  public void aumentarRemuneracion(int porcentaje) {
    remuneracion += remuneracion * porcentaje / 100;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return "Empleado{" +
            "remuneracion=" + remuneracion +
            ", empleadoId=" + empleadoId +
            "} " + super.toString();
  }  
}
