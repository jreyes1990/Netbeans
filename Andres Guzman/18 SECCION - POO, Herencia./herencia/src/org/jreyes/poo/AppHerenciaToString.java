package org.jreyes.poo;

import org.jreyes.poo.herencia.Alumno;
import org.jreyes.poo.herencia.AlumnoInternacional;
import org.jreyes.poo.herencia.Persona;
import org.jreyes.poo.herencia.Profesor;

public class AppHerenciaToString {

  public static void main(String[] args) {
    Alumno alumno = new Alumno("Jolberth", "Jolberth", 33, "Instituto Nacional");
    alumno.setNotaCastellano(5.5);
    alumno.setNotaHistoria(6.3);
    alumno.setNotaMatematica(4.9);
    alumno.setEmail("jreyes@gmail.com");
    
    AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
    alumnoInt.setEdad(15);
    alumnoInt.setInstitucion("Instituto Nacional");
    alumnoInt.setNotaIdiomas(6.8);
    alumnoInt.setNotaCastellano(6.2);
    alumnoInt.setNotaHistoria(5.8);
    alumnoInt.setNotaMatematica(6.5);
    alumnoInt.setEmail("peter@hotmail.com");
    
    Profesor profesor = new Profesor("Roberto", "Osorio", "Matematicas");
    profesor.setEdad(37);
    profesor.setEmail("rosorio@yahoo.com");
    
    System.out.println("\n************************************************************");
    System.out.println("Alumno: "+alumno.getNombre()+" "+alumno.getApellido());
    System.out.println("Alumno Internacional: "+alumnoInt.getNombre()+" "+alumnoInt.getApellido()+" "+alumnoInt.getInstitucion()+" "+alumnoInt.getPais());
    System.out.println("Profesor "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());
    
    System.out.println("\n************************************************************");
    System.out.println("***** VISUALIZANDO LA INSTANCIA DE LA CLASE ALUMNO *****");
    imprimir(alumno);
    System.out.println("\n***** VISUALIZANDO LA INSTANCIA DE LA CLASE ALUMNO INTERNACIONAL *****");
    imprimir(alumnoInt);
    System.out.println("\n***** VISUALIZANDO LA INSTANCIA DE LA CLASE ALUMNO INTERNACIONAL *****");
    imprimir(profesor);
  }  
  
  public static void imprimir(Persona persona){
    System.out.println();
    System.out.println(persona);
  }
}
