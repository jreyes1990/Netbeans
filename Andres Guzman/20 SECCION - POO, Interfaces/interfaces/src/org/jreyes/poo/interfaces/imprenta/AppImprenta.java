package org.jreyes.poo.interfaces.imprenta;

import org.jreyes.poo.interfaces.imprenta.modelo.Curriculum;
import org.jreyes.poo.interfaces.imprenta.modelo.Hoja;
import org.jreyes.poo.interfaces.imprenta.modelo.Informe;

public class AppImprenta {

  public static void main(String[] args) {
    Curriculum cv = new Curriculum("Jolberth Reyes", "Ingeniero en Sistemas", "Resumen laboral.....");
    cv.addExperiencia("Java");
    cv.addExperiencia("Oracle DBA");
    cv.addExperiencia("Spring Framework");
    cv.addExperiencia("Desarrollador FullStack");
    cv.addExperiencia("Angular");
    
    Informe informe = new Informe("James", "Martin Fowler", "Estudio sobre microservicios");
    imprimir(cv);
    imprimir(informe);
  } 
  
  public static void imprimir(Hoja imprimible){
    System.out.println(imprimible.imprimir());
  }
}
