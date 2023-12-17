/*
   Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, 
   usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) 
   para pedir el numero entero, entonces se requiere:

 * Calcular el menor número e imprimir el valor.
 * Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".

 */
package tarea;

import java.util.Scanner;

public class CalcularNumeroMenor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ingresar la cantidad de números a comparar
    System.out.print("Ingrese la cantidad de números a comparar: ");
    int cantidadNumeros = scanner.nextInt();

    // Verificar que la cantidad de números sea al menos 1
    if (cantidadNumeros < 1) {
      System.out.println("Debe ingresar al menos un número.");
      main(args);
    } else {
      // Inicializar la variable para almacenar el menor número
      int menorNumero = Integer.MAX_VALUE;

      // Iterar para ingresar los números y encontrar el menor
      for (int i = 1; i <= cantidadNumeros; i++) {
        System.out.print("Ingrese el número #" + i + ": ");
        int numero = scanner.nextInt();

        // Actualizar el menor número si es necesario
        if (numero < menorNumero) {
          menorNumero = numero;
        }
      }

      // Imprimir el menor número
      System.out.println("El número menor es: " + menorNumero);

      // Verificar si el menor número es menor que 10
      if (menorNumero < 10) {
        System.out.println("El número menor es menor que 10!");
      } else {
        System.out.println("El número menor es igual o mayor que 10!");
      }
    }

    // Cerrar el scanner
    scanner.close();
  }
}
