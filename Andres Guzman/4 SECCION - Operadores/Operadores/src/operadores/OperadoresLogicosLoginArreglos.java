package operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

  public static void main(String[] args) {
    String username = "jreyes";
    String password = "123456";
    String username2 = "admin";
    String password2 = "123456";
    boolean esAutenticado = false;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el username");
    String u = scanner.next();
    
    System.out.println("Ingrese el password");
    String p = scanner.next();
    
    if ((username.equals(u) && password.equals(p)) || (username2.equals(u) && password2.equals(p))) {
      esAutenticado = true;
    } else if ((!username.equals(u) && password.equals(p)) || (!username2.equals(u) && password2.equals(p))) {
      System.out.println("Username incorrecto!");
    } else if ((username.equals(u) && !password.equals(p)) || (username2.equals(u) && !password2.equals(p))) {
      System.out.println("Password incorrecto!");
    } else {
      System.out.println("Username o Password incorrectos!");
    }
    
    if (esAutenticado) {
      System.out.println("Bienvenido usuario ".concat(u).concat("!"));
    }else {
      System.out.println("Lo siento,requiere autenticacion");
    }
  }  
}
