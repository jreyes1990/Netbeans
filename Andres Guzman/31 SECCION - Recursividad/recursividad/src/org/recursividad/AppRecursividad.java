package org.recursividad;

import java.util.stream.Stream;
import org.recursividad.models.Componente;

public class AppRecursividad {

  public static void main(String[] args) {
    Componente pc = new Componente("Gabinete PC ATX");
    Componente poder = new Componente("Fuente Poder 700w");
    Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
    Componente cpu = new Componente("CPU AMD Ryzen 5 2800");
    Componente ventilador = new Componente("Ventilador CPU");
    Componente disipador = new Componente("Disipador");
    Componente tv = new Componente("Nvidia RTX 3080 8GB");
    Componente gpu = new Componente("Nvidia GPU RTX");
    Componente gpuRam = new Componente("4GB RAM");
    Componente gpuRam2 = new Componente("4GB RAM");
    Componente gpuVentiladores = new Componente("Ventiladores");
    Componente ram = new Componente("Memoria RAM 32GB");
    Componente ssd = new Componente("Disco SSD 2T");
    
    cpu.addComponente(ventilador).addComponente(disipador);
    tv.addComponente(gpu).addComponente(gpuRam).addComponente(gpuRam2).addComponente(gpuVentiladores);
    placaMadre.addComponente(cpu).addComponente(tv).addComponente(ram).addComponente(ssd);
    pc.addComponente(poder).addComponente(placaMadre).addComponente(new Componente("Teclado")).addComponente(new Componente("Mouse"));
    
    Recursivo(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel())+c.getNombre()));
    // Recursivo(pc, 0);
  }
  
  public static Stream<Componente> Recursivo(Componente c, int nivel){
    c.setNivel(nivel);
    return Stream.concat(Stream.of(c), c.getHijos().stream().flatMap(hijo -> Recursivo(hijo, nivel+1)));
  }
  
  /*
  public static void Recursivo(Componente c, int nivel){
    System.out.println("\t".repeat(nivel)+c.getNombre());
    if (c.tieneHijos()) {
      for (Componente hijo : c.getHijos()) {
        Recursivo(hijo, nivel+1);
      }
    }
  }
  */
}
