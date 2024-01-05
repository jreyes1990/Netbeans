package tareas;

import java.util.Scanner;

public class ArreglosSistemaEstadistico {
  /* Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, 
     el promedio de los negativos y contar el número de ceros. */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declarar un arreglo de 7 elementos
    double[] numeros = new double[7];

    // Leer 7 números desde el teclado y almacenarlos en el arreglo
    for (int i = 0; i < 7; i++) {
      System.out.print("Ingrese el número #" + (i + 1) + ": ");

      // Validar que se ingrese un número
      while (!scanner.hasNextDouble()) {
        System.out.println("Por favor, ingrese un número válido.");
        System.out.print("Ingrese el número #" + (i + 1) + ": ");
        scanner.next(); // Limpiar el buffer
      }

      numeros[i] = scanner.nextDouble();
    }

    // Calcular el promedio de los números positivos, promedio de los negativos y contar ceros
    double sumaPositivos = 0;
    double sumaNegativos = 0;
    int contadorCeros = 0;
    int cantidadPositivos = 0;
    int cantidadNegativos = 0;

    for (int i = 0; i < 7; i++) {
      if (numeros[i] > 0) {
        sumaPositivos += numeros[i];
        cantidadPositivos++;
      } else if (numeros[i] < 0) {
        sumaNegativos += numeros[i];
        cantidadNegativos++;
      } else {
        contadorCeros++;
      }
    }

    // Calcular los promedios
    double promedioPositivos = (cantidadPositivos > 0) ? sumaPositivos / cantidadPositivos : 0;
    double promedioNegativos = (cantidadNegativos > 0) ? sumaNegativos / cantidadNegativos : 0;

    // Mostrar los resultados
    System.out.println("\nResultados del sistema estadístico:");
    System.out.println("Promedio de números positivos: " + promedioPositivos);
    System.out.println("Promedio de números negativos: " + promedioNegativos);
    System.out.println("Cantidad de ceros: " + contadorCeros);

    // Cerrar el scanner
    scanner.close();
  }  
}
