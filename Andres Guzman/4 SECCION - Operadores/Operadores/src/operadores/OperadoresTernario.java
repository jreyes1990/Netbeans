package operadores;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresTernario {

  public static void main(String[] args) {
    String estado = "";
    double matematicas = 0.0;
    double ciencias = 0.0;
    double historia = 0.0;
    double promedio = 0.0;
    
    Scanner s = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Ingrese la nota de matematicas ente 2.0 - 7.0:");
    matematicas = s.nextDouble();
    System.out.println("Ingrese la nota de ciencias ente 2.0 - 7.0:");
    ciencias = s.nextDouble();
    System.out.println("Ingrese la nota de historia ente 2.0 - 7.0:");
    historia = s.nextDouble();
    
    promedio = (matematicas+ciencias+historia)/3;
    
    estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
    System.out.println("estado: "+estado);
  }  
}
