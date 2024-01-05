package tareas;

public class ArreglosHistograma {
  /* Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

     El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

     Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, 
     es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

     Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

     1: ***
     2: 
     3: *
     4: *****
     5: *
     6: **
     Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma. */

  public static void main(String[] args) {
    // Declarar un arreglo de 12 elementos
    int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

    // Declarar un arreglo para contar la frecuencia de cada número (del 1 al 6)
    int[] frecuencia = new int[7]; // índices del 1 al 6

    // Contar la frecuencia de cada número en el arreglo
    for (int i = 0; i < numeros.length; i++) {
      int numeroActual = numeros[i];
      frecuencia[numeroActual]++;
    }

    // Mostrar el histograma
    System.out.println("Histograma:");

    for (int i = 1; i <= 6; i++) {
      System.out.print(i + ": ");
      for (int j = 0; j < frecuencia[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }  
}
