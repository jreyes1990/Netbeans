package org.archivos;

import org.archivos.service.ArchivoServicio;

public class MainArchivo {

  public static void main(String[] args) {
    String nombreArhivo = "/home/jreyes/Documentos/Netbeans/Andres Guzman/33 SECCION - Manejo de Archivos/archivo/java.txt";
    
    ArchivoServicio service = new ArchivoServicio();
    service.crearArchivo(nombreArhivo);
  }  
}
