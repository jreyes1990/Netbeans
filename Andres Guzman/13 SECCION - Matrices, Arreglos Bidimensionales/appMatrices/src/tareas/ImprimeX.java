package tareas;

import java.util.Scanner;

public class ImprimeX {
  /* Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo 
     como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.

     El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

     Por ejemplo para n=5 se obtiene:

     X___X
     _X_X_
     __X__
     _X_X_
     X___X
  
     Por ejemplo para n=6 se obtiene:

     X____X
     _X__X_
     __XX__
     __XX__
     _X__X_
     X____X
     Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa. */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir al usuario el tamaño de la X
    System.out.print("Ingrese el tamaño de la X (n): ");
    int n = scanner.nextInt();

    // Validar que n no sea cero
    if (n == 0) {
      System.out.println("ERROR: El tamaño de la X no puede ser cero.");
      return;
    }

    // Imprimir la X
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j || i + j == n - 1) {
          System.out.print("X");
        } else {
          System.out.print("_");
        }

        // Agregar un espacio después del carácter (excepto en la última columna)
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
