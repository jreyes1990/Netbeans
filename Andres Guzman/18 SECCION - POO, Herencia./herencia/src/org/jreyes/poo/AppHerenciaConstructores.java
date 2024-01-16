package org.jreyes.poo;

import org.jreyes.poo.herencia.Alumno;
import org.jreyes.poo.herencia.AlumnoInternacional;
import org.jreyes.poo.herencia.Persona;
import org.jreyes.poo.herencia.Profesor;

public class AppHerenciaConstructores {

  public static void main(String[] args) {
    System.out.println("***** CREANDO LA INSTANCIA DE LA CLASE ALUMNO *****");
    Alumno alumno = new Alumno("Jolberth", "Jolberth", 33, "Instituto Nacional");
    alumno.setNotaCastellano(5.5);
    alumno.setNotaHistoria(6.3);
    alumno.setNotaMatematica(4.9);
    alumno.setEmail("jreyes@gmail.com");
    
    System.out.println("\n***** CREANDO LA INSTANCIA DE LA CLASE ALUMNO INTERNACIONAL *****");
    AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
    alumnoInt.setEdad(15);
    alumnoInt.setInstitucion("Instituto Nacional");
    alumnoInt.setNotaIdiomas(6.8);
    alumnoInt.setNotaCastellano(6.2);
    alumnoInt.setNotaHistoria(5.8);
    alumnoInt.setNotaMatematica(6.5);
    alumnoInt.setEmail("peter@hotmail.com");
    
    System.out.println("\n***** CREANDO LA INSTANCIA DE LA CLASE PROFESOR *****");
    Profesor profesor = new Profesor("Roberto", "Osorio", "Matematicas");
    profesor.setEdad(37);
    profesor.setEmail("rosorio@yahoo.com");
    
    System.out.println("\n************************************************************");
    System.out.println("Alumno: "+alumno.getNombre()+" "+alumno.getApellido());
    System.out.println("Alumno Internacional: "+alumnoInt.getNombre()+" "+alumnoInt.getApellido()+" "+alumnoInt.getInstitucion()+" "+alumnoInt.getPais());
    System.out.println("Profesor "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());
    
    imprimir(alumno);
    imprimir(alumnoInt);
    imprimir(profesor);
  }  
  
  public static void imprimir(Persona persona){
    System.out.println();
    System.out.println("Imprimiendo los datos del tipo Persona:");
    System.out.println("nombre: "+persona.getNombre()+" apellido: "+persona.getApellido()+", edad: "+persona.getEdad()+", email: "+persona.getEmail());
    
    if (persona instanceof Alumno) {
      System.out.println();
      System.out.println("Imprimiendo los datos del tipo Alumno:");
      System.out.println("Institucion: "+((Alumno) persona).getInstitucion());
      System.out.println("Nota matematicas: "+((Alumno) persona).getNotaMatematica());
      System.out.println("Nota historia: "+((Alumno) persona).getNotaHistoria());
      System.out.println("Nota Castellano: "+((Alumno) persona).getNotaCastellano());
      
      if (persona instanceof AlumnoInternacional) {
        System.out.println();
        System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
        System.out.println("Nota idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
        System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
      }
    }
    
    if (persona instanceof Profesor) {
      System.out.println();
      System.out.println("Imprimiendo los datos del tipo Profesor:");
      System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
    }
  }
}
