package tareas;

public class ArreglosNumeroMasAlto {
  /* Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), 
     por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo. */
  
  public static void main(String[] args) {
    // Declarar un arreglo de 7 elementos
    int[] numeros = {14, 33, 15, 36, 78, 21, 43};

    // Encontrar el número más alto y manejar repeticiones
    int numeroMasAlto = encontrarNumeroMasAlto(numeros);

    // Mostrar el resultado
    System.out.println("El número más alto es: " + numeroMasAlto);
  } 
  
  // Función para encontrar el número más alto sin contar repeticiones
  private static int encontrarNumeroMasAlto(int[] arreglo) {
    int numeroMasAlto = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible

    for (int i = 0; i < arreglo.length; i++) {
      boolean repetido = false;

      // Verificar si el número ya ha aparecido antes
      for (int j = 0; j < i; j++) {
        if (arreglo[i] == arreglo[j]) {
          repetido = true;
          break;
        }
      }

      // Si no es repetido y es mayor que el actual número más alto, actualizar
      if (!repetido && arreglo[i] > numeroMasAlto) {
        numeroMasAlto = arreglo[i];
      }
    }

    return numeroMasAlto;
  }
}
