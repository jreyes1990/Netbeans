package operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {

  public static void main(String[] args) {
    /*
    String[] usernames = new String[3];
    String[] passwords = new String[3];
    usernames[0] = "jreyes";
    passwords[0] = "123456";
    usernames[1] = "admin";
    passwords[1] = "123456";
    usernames[2] = "pepe";
    passwords[2] = "123456";
    */
    String[] usernames = {"jreyes", "admin", "pepe"};
    String[] passwords = {"123456", "123456", "123456"};
    
    boolean esAutenticado = false;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el username");
    String u = scanner.next();
    
    System.out.println("Ingrese el password");
    String p = scanner.next();
    
    for (int i = 0; i < usernames.length; i++) {
      if (usernames[i].equals(u) && passwords[i].equals(p)) {
        esAutenticado = true;
        break;
      }
    }
    
    if (esAutenticado) {
      System.out.println("Bienvenido usuario ".concat(u).concat("!"));
    }else {
      System.out.println("Username o Password incorrectos!");
      System.out.println("Lo siento,requiere autenticacion");
    }
  }  
}
