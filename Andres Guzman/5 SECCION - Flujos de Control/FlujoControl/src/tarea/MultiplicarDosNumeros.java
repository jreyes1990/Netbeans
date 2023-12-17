/*
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */
package tarea;

import java.util.Scanner;

public class MultiplicarDosNumeros {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir dos números enteros
    System.out.print("Ingrese el primer número entero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingrese el segundo número entero: ");
    int num2 = scanner.nextInt();

    // Inicializar la variable que almacenará el resultado de la multiplicación
    int resultado = 0;

    // Determinar el signo del resultado
    int signo = (num1 < 0) ^ (num2 < 0) ? -1 : 1;

    // Tomar el valor absoluto de los números para simplificar la multiplicación
    num1 = Math.abs(num1);
    num2 = Math.abs(num2);

    // Realizar la multiplicación sin usar el operador de multiplicación
    for (int i = 0; i < num1; i++) {
      resultado += num2;
    }

    // Aplicar el signo al resultado
    resultado *= signo;

    // Mostrar el resultado
    System.out.println("El resultado de la multiplicación es: " + resultado);

    // Cerrar el scanner
    scanner.close();
  }
}
