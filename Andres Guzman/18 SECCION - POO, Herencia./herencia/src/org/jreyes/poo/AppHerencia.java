package org.jreyes.poo;

import org.jreyes.poo.herencia.Alumno;
import org.jreyes.poo.herencia.AlumnoInternacional;
import org.jreyes.poo.herencia.Profesor;

public class AppHerencia {

  public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.setNombre("Jolberth");
    alumno.setApellido("Reyes");
    alumno.setInstitucion("Instituto Nacional");
    alumno.setNotaCastellano(5.5);
    alumno.setNotaHistoria(6.3);
    alumno.setNotaMatematica(4.9);
    
    
    AlumnoInternacional alumnoInt = new AlumnoInternacional();
    alumnoInt.setNombre("Peter");
    alumnoInt.setApellido("Gosling");
    alumnoInt.setPais("Australia");
    alumnoInt.setEdad(15);
    alumnoInt.setInstitucion("Instituto Nacional");
    alumnoInt.setNotaIdiomas(6.8);
    alumnoInt.setNotaCastellano(6.2);
    alumnoInt.setNotaHistoria(5.8);
    alumnoInt.setNotaMatematica(6.5);
    
    
    Profesor profesor = new Profesor();
    profesor.setNombre("Roberto");
    profesor.setApellido("Osorio");
    profesor.setAsignatura("Matematicas");
    
    System.out.println("Alumno "+alumno.getNombre()+" "+alumno.getApellido());
    System.out.println("Alumno Internacional"+alumnoInt.getNombre()+" "+alumnoInt.getApellido()+" "+alumnoInt.getInstitucion()+" "+alumnoInt.getPais());
    System.out.println("Profesor "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());
    
    System.out.println();
    Class clase = alumnoInt.getClass();
    while (clase.getSuperclass() != null) {      
      String hija = clase.getName();
      String padre = clase.getSuperclass().getName();
      System.out.println("["+hija+"] es una clase hija de la clase padre ["+padre+"]");
      clase = clase.getSuperclass();
    }
  }  
}
