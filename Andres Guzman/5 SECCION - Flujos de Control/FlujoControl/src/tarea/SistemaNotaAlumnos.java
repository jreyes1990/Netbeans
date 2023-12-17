package tarea;

import java.util.Scanner;

/*
 * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, 
   promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
 * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */
public class SistemaNotaAlumnos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int totalNotas = 20;
    int contadorNotas1 = 0;
    double sumaNotasMayor5 = 0;
    double sumaNotasMenor4 = 0;
    double sumaTotal = 0;

    for (int i = 1; i <= totalNotas; i++) {
      System.out.print("Ingrese la nota #" + i + " (entre 1 y 7): ");
      double nota = scanner.nextDouble();

      // Verificar si la nota es 0 para salir del ciclo
      if (nota == 0) {
        System.out.println("Error: Se ingresó una nota de 0. Programa finalizado.");
        break;
      }

      // Validar que la nota esté en el rango permitido
      if (nota < 1 || nota > 7) {
        System.out.println("Error: La nota debe estar entre 1 y 7. Ingrese nuevamente.");
        i--; // Decrementar el índice para volver a pedir la misma nota
        continue;
      }

      // Realizar cálculos
      sumaTotal += nota;

      if (nota == 1) {
        contadorNotas1++;
      } else if (nota > 5) {
        sumaNotasMayor5 += nota;
      } else if (nota < 4) {
        sumaNotasMenor4 += nota;
      }
    }

    // Calcular promedios
    double promedioMayor5 = (contadorNotas1 > 0) ? sumaNotasMayor5 / contadorNotas1 : 0;
    double promedioMenor4 = (contadorNotas1 > 0) ? sumaNotasMenor4 / contadorNotas1 : 0;
    double promedioTotal = (totalNotas > 0) ? sumaTotal / totalNotas : 0;

    // Mostrar resultados
    System.out.println("Promedio de notas mayores a 5: " + promedioMayor5);
    System.out.println("Promedio de notas menores a 4: " + promedioMenor4);
    System.out.println("Cantidad de notas 1: " + contadorNotas1);
    System.out.println("Promedio total: " + promedioTotal);

    // Cerrar el scanner
    scanner.close();
  }
}
