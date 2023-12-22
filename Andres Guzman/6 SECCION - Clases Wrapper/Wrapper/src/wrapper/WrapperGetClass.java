package wrapper;

import java.lang.reflect.Method;

public class WrapperGetClass {

  public static void main(String[] args) {
    String texto = "Hola que tal!";
    
    Class strClass = texto.getClass();
    
    System.out.println("strClass.getName() = "+strClass.getName());
    System.out.println("strClass.getSimpleName() = "+strClass.getSimpleName());
    System.out.println("strClass.getPackageName() = "+strClass.getPackageName());
    System.out.println("strClass.getSuperclass() = "+strClass.getSuperclass());
    System.out.println("strClass.getSuperclass().getSuperclass() = "+strClass.getSuperclass().getSuperclass());
    
    for (Method metodo : strClass.getMethods()) {
      System.out.println("metodo.getName() = "+metodo.getName());
    }
  }  
}
