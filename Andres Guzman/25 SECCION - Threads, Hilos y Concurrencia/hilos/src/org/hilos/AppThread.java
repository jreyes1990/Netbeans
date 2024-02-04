package org.hilos;

import org.hilos.threads.NombreThread;

public class AppThread {

  public static void main(String[] args) throws InterruptedException {
    Thread hilo = new NombreThread("Jhon Doe");
    hilo.start();
    
    Thread hilo2 = new NombreThread("Maria Magdalena");
    hilo2.start();
    
    Thread hilo3 = new NombreThread("Pepe Aguilar");
    hilo3.start();
    
    System.out.println(hilo.getState());
  }  
}
