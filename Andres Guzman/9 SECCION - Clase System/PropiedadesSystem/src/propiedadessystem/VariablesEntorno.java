package propiedadessystem;

import java.util.Map;

public class VariablesEntorno {

  public static void main(String[] args) {
    Map<String, String> varEnv = System.getenv();
    System.out.println("Variables de ambiente|entorno del sistema = "+varEnv);
    
    String username = System.getenv("USERNAME");
    System.out.println("USERNAME = "+username);
    
    String javaHome = System.getenv("JAVA_HOME");
    System.out.println("JAVA_HOME = "+javaHome+" revisar variable de entorno");
    
    String temDir = System.getenv("TEMP");
    System.out.println("TEMP = "+temDir);
    
    String path = System.getenv("PATH");
    System.out.println("PATH = "+path);
  }  
}
