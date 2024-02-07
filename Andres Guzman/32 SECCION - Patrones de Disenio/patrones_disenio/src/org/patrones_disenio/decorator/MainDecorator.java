package org.patrones_disenio.decorator;

import org.patrones_disenio.decorator.clases.Texto;
import org.patrones_disenio.decorator.decorador.MayusculaDecorador;
import org.patrones_disenio.decorator.decorador.ReemplazarEspacioDecorador;
import org.patrones_disenio.decorator.decorador.ReversaDecorador;
import org.patrones_disenio.decorator.decorador.SubrayadoDecorador;
import org.patrones_disenio.decorator.interfaces.Formateable;

public class MainDecorator {

  public static void main(String[] args) {
    Formateable texto = new Texto("Hola que tal Jolberth");
    MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
    ReversaDecorador reversa = new ReversaDecorador(mayuscula);
    SubrayadoDecorador subraya = new SubrayadoDecorador(reversa);
    ReemplazarEspacioDecorador reemplazar = new ReemplazarEspacioDecorador(subraya);
    
    System.out.println("texto = "+texto.darFormato());
    System.out.println("mayuscula = "+mayuscula.darFormato());
    System.out.println("reversa = "+reversa.darFormato());
    System.out.println("subraya = "+subraya.darFormato());
    System.out.println("reemplazar = "+reemplazar.darFormato());
  }  
}
