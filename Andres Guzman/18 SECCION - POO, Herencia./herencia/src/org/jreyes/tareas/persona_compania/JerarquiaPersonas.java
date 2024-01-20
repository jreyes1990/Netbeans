package org.jreyes.tareas.persona_compania;

import org.jreyes.tareas.persona_compania.herencia.Gerente;

public class JerarquiaPersonas {

  public static void main(String[] args) {
    // Crear un ejemplo de Gerente
    Gerente gerente = new Gerente("John", "Doe", "123456789", "123 Main St",
            50000, 101, 100000);

    // Imprimir los datos del Gerente
    System.out.println(gerente.toString());
  }  
}
