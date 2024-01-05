package tareas;

import java.util.Scanner;

public class ArreglosOrden {
  /* Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. 
     Luego debemos mostrarlos en el siguiente orden: 
     el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente. */
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declarar un arreglo de 10 elementos
    int[] numeros = new int[10];

    // Leer 10 números enteros desde el teclado y almacenarlos en el arreglo
    for (int i = 0; i < 10; i++) {
      System.out.print("Ingrese el número #" + (i + 1) + ": ");

      // Validar que se ingrese un número entero
      while (!scanner.hasNextInt()) {
        System.out.println("Por favor, ingrese un número entero.");
        System.out.print("Ingrese el número #" + (i + 1) + ": ");
        scanner.next(); // Limpiar el buffer
      }

      numeros[i] = scanner.nextInt();
    }

    // Mostrar los elementos en el orden especificado
    System.out.println("\nMostrando en el orden especificado:");
    int longitud = numeros.length;

    for (int i = longitud - 1; i >= 0; i--) {
      System.out.println(numeros[i]);
    }

    // Cerrar el scanner
    scanner.close();
  }  
}
