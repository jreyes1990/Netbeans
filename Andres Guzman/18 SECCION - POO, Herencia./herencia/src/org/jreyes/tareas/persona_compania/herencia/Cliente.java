package org.jreyes.tareas.persona_compania.herencia;

public class Cliente extends Persona {  
  private int clienteId;

  // Constructor
  public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
    super(nombre, apellido, numeroFiscal, direccion);
    this.clienteId = clienteId;
  }

  // Getter
  public int getClienteId() {
    return clienteId;
  }

  // toString() con sobreescritura
  @Override
  public String toString() {
    return "Cliente{" +
            "clienteId=" + clienteId +
            "} " + super.toString();
  }
}
