package propiedadessystem;

import java.util.Properties;

public class PropiedadesSystem {

  public static void main(String[] args) {
    String username = System.getProperty("user.name");
    System.out.println("user.name = "+username);
    
    String home = System.getProperty("user.home");
    System.out.println("user.home = "+home);
    
    String workspace = System.getProperty("user.dir");
    System.out.println("user.dir = "+workspace);
    
    String java = System.getProperty("java.version");
    System.out.println("java.version = "+java);
    
    String lineSeparator = System.getProperty("line.separator");
    System.out.println("line.separator = "+lineSeparator+"Una nueva linea .....");
    
    String lineSeparator2 = System.lineSeparator();
    System.out.println("lineSeparator() = "+lineSeparator2+"Una nueva linea .....");
    
    System.out.println("\n");
    Properties p = System.getProperties();
    p.list(System.out);
  }  
}
