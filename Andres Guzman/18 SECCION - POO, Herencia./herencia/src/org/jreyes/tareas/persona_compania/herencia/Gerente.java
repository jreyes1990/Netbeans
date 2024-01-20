package org.jreyes.tareas.persona_compania.herencia;

public class Gerente extends Empleado{
  private double presupuesto;

  // Constructor
  public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
    super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
    this.presupuesto = presupuesto;
  }

  // Getter y Setter de presupuesto
  public double getPresupuesto() {
    return presupuesto;
  }

  public void setPresupuesto(double presupuesto) {
    this.presupuesto = presupuesto;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return "Gerente{" +
            "presupuesto=" + presupuesto +
            "} " + super.toString();
  }
}
