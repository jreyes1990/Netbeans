package tareas;

public class ArreglosMayorOcurrencia {
  /* Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). 
     Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces 
     que aparece en el arreglo.

     Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

     Como resultado debería imprimir lo siguiente:

     La mayor ocurrencias es: 3 
     El elemento que mas se repite es: 5
     En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces. */

  public static void main(String[] args) {
    // Declarar un arreglo de 10 elementos
    int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

    // Contar las ocurrencias de cada número
    int[] contadorOcurrencias = new int[10];

    for (int i = 0; i < numeros.length; i++) {
      int numeroActual = numeros[i];
      contadorOcurrencias[numeroActual]++;
    }

    // Encontrar el número con mayor ocurrencia
    int mayorOcurrencia = 0;
    int elementoMasRepetido = 0;

    for (int i = 1; i < contadorOcurrencias.length; i++) {
      if (contadorOcurrencias[i] > mayorOcurrencia) {
        mayorOcurrencia = contadorOcurrencias[i];
        elementoMasRepetido = i;
      }
    }

    // Mostrar los resultados
    System.out.println("La mayor ocurrencia es: " + mayorOcurrencia);
    System.out.println("El elemento que más se repite es: " + elementoMasRepetido);
  }  
}
