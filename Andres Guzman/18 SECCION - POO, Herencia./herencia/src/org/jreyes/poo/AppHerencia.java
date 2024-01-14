package org.jreyes.poo;

import org.jreyes.poo.herencia.Alumno;
import org.jreyes.poo.herencia.Profesor;

public class AppHerencia {

  public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.setNombre("Jolberth");
    alumno.setApellido("Reyes");
    
    Profesor profesor = new Profesor();
    profesor.setNombre("Roberto");
    profesor.setApellido("Osorio");
    profesor.setAsignatura("Matematicas");
    
    System.out.println("Alumno "+alumno.getNombre()+" "+alumno.getApellido());
    System.out.println("Profesor "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());
  }  
}
