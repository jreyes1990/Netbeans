package org.archivos.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
  public void crearArchivo(String nombre){
    File archivo =  new File(nombre);
    
    try {
      FileWriter escritor = new FileWriter(archivo, true);
      escritor.append("Hola que tal amigos!").append("\n")
              .append("Todo bien? yo aca escribiendo un archivo.....").append("\n")
              .append("Hasta luego Lucas").append("\n");
      escritor.close();
      System.out.println("El archivo se ha creado con exito");
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
