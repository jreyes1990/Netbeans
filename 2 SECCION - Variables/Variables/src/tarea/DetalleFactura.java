package tarea;

import java.util.Locale;
import java.util.Scanner;

public class DetalleFactura {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nombreFactura = "";
    double precio1 = 0.00d;
    double precio2 = 0.00d;
    double totalPrecios = 0.00d;
    double impuesto = 0.00d;
    double totalGeneral = 0.00d;
    
    try {
      System.out.println("Ingrese nombre de la factura");
      nombreFactura = scanner.nextLine();
      System.out.println("Ingrese el precio1");
      precio1 = scanner.nextDouble();
      System.out.println("Ingrese el precio2");
      precio2 = scanner.nextDouble();
      
      totalPrecios = precio1 + precio2;  
      impuesto = totalPrecios * 0.19;
      totalGeneral = totalPrecios + impuesto;
    } catch (Exception e) {
      e.printStackTrace();  // Imprime la traza de la excepción para ayudar en la depuración
    }
    
    
    System.out.println("Total Bruto: "+ totalPrecios);
    System.out.println("Impuesto: "+ impuesto);
    System.out.println("Total General: "+ totalGeneral);
  }  
}
