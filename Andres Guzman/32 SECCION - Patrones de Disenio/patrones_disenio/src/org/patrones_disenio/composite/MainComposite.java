package org.patrones_disenio.composite;

import org.patrones_disenio.composite.clases.Archivo;
import org.patrones_disenio.composite.clases.Directorio;

public class MainComposite {

  public static void main(String[] args) {
    Directorio doc = new Directorio("Documentos");
    Directorio java = new Directorio("Java");
    
    java.addComponente(new Archivo("patron-composite.docx"));
    
    Directorio stream = new Directorio("API Stream");
    stream.addComponente(new Archivo("stream-map.docx"));
    
    java.addComponente(stream);
    
    doc.addComponente(java);
    doc.addComponente(new Archivo("cv.docx"));
    doc.addComponente(new Archivo("logo.jpeg"));
    
    System.out.println(doc.mostrar(0));
  }  
}
