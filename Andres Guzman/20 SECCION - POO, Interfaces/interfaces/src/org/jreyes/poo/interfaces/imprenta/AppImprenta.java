package org.jreyes.poo.interfaces.imprenta;

import org.jreyes.poo.interfaces.imprenta.modelo.Curriculum;
import org.jreyes.poo.interfaces.imprenta.modelo.Genero;
import org.jreyes.poo.interfaces.imprenta.modelo.Hoja;
import org.jreyes.poo.interfaces.imprenta.modelo.Imprimible;
import org.jreyes.poo.interfaces.imprenta.modelo.Informe;
import org.jreyes.poo.interfaces.imprenta.modelo.Libro;
import org.jreyes.poo.interfaces.imprenta.modelo.Pagina;

public class AppImprenta {

  public static void main(String[] args) {
    Curriculum cv = new Curriculum("Jolberth Reyes", "Ingeniero en Sistemas", "Resumen laboral.....");
    cv.addExperiencia("Java");
    cv.addExperiencia("Oracle DBA");
    cv.addExperiencia("Spring Framework");
    cv.addExperiencia("Desarrollador FullStack");
    cv.addExperiencia("Angular");
    
    Libro libro = new Libro("Erick Gamma", "Patrones de disenio: Elem. Reusables POO", Genero.PROGRAMACION);
    libro.addPagina(new Pagina("Patron Singleton"))
         .addPagina(new Pagina("Patron Observador"))
         .addPagina(new Pagina("Patron Factory"))
         .addPagina(new Pagina("Patron Compisite"))
         .addPagina(new Pagina("Patron Facade"));
    
    Informe informe = new Informe("James", "Martin Fowler", "Estudio sobre microservicios");
    
    imprimir(cv);
    imprimir(informe);
  } 
  
  public static void imprimir(Imprimible imprimible){
    System.out.println(imprimible.imprimir());
  }
}
