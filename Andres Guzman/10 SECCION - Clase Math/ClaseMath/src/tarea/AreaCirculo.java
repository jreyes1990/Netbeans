package tarea;

import java.util.Scanner;

/*
 * Pedir el radio de un círculo y calcular su área. Utilizar la formula:
 * area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
*/

public class AreaCirculo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Pedir al usuario que ingrese el radio del círculo
    System.out.print("Ingrese el radio del círculo: ");
    
    // Verificar si la entrada es un número
    if (scanner.hasNextDouble()) {
      double radio = scanner.nextDouble();

      // Verificar que el radio sea positivo
      if (radio >= 0) {
        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
      } else {
        System.out.println("El radio debe ser un número positivo.");
      }
    } else {
      System.out.println("Ingrese un número válido para el radio.");
    }
    
    // Cerrar el scanner
    scanner.close();
  }  
}
