package org.patrones_disenio.singleton;

public class MainSingleton {

  public static void main(String[] args) {
    ConexionBD con = null;
    
    for (int i = 0; i < 10; i++) {
      con = ConexionBD.getInstancia();
      System.out.println("con = "+con);
    }
  }  
}
