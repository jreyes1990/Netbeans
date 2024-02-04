package org.hilos.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NombreThread extends Thread {

  public NombreThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Se inicia el metodo run() del hilo "+getName());
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
        //Logger.getLogger(NombreThread.class.getName()).log(Level.SEVERE, null, ex);
      }
      System.out.println(this.getName());
    }
    System.out.println("Finaliza el hilo");
  }
  
}
