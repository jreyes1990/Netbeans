package appmatrices;

public class MatricesBuscarElemento {

  public static void main(String[] args) {
    int[][] matrizEnteros = {
      {35, 90, 3, 1978},
      {15, 2020, 10, 5},
      {677, 127, 32767, 1999}
    };
    
    int elementoBuscar = 15;
    boolean encontrado = false;
    int i;
    int j = 0;
    
    buscar: // Etiqueta buscar
    for (i = 0; i < matrizEnteros.length; i++) {
      for (j = 0; j < matrizEnteros[i].length; j++) {
        if (matrizEnteros[i][j] == elementoBuscar) {
          encontrado = true;
          break buscar;
        }
      }
    }
    
    if (encontrado) {
      System.out.println("Encontrado "+elementoBuscar+" en las coordenadas "+i+", "+j);
    } else {
      System.out.println(elementoBuscar+" no se encontro en la matriz");
    }
  }  
}
