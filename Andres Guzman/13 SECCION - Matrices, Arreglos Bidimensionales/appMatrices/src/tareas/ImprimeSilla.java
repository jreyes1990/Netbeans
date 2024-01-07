package tareas;

import java.util.Scanner;

public class ImprimeSilla {
  /* Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del numero 1 y 
     utilizar el numero 0 como espacio. El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir 
     en una matriz de n x n.

     Por ejemplo para n=5 se obtiene:

     10000
     10000
     11111
     10001
     10001
  
     Por ejemplo para n=6 se obtiene:

     100000
     100000
     100000
     111111
     100001
     100001
  
     Por ejemplo para n=10 se obtiene:

     1000000000
     1000000000
     1000000000
     1000000000
     1000000000
     1111111111
     1000000001
     1000000001
     1000000001
     1000000001
  
     Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa. */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir al usuario el tamaño de la silla
    System.out.print("Ingrese el tamaño de la silla (n): ");
    int n = scanner.nextInt();

    // Validar que n no sea cero
    if (n == 0) {
      System.out.println("ERROR: El tamaño de la silla no puede ser cero.");
      return;
    }

    // Imprimir la silla
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        
        if ((i == n / 2) || (j == 0) || (i > n / 2 && j == n - 1)) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }

        // Agregar un espacio después del número (excepto en la última columna)
        if (j < n - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();  // Nueva línea para la siguiente fila
    }

    // Cerrar el scanner
    scanner.close();
  }  
}
