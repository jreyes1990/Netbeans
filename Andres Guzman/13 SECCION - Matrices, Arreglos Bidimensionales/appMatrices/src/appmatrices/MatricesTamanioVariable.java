package appmatrices;

public class MatricesTamanioVariable {

  public static void main(String[] args) {
    int[][] matriz = new int[3][];
    
    matriz[0] = new int[2];
    matriz[1] = new int[3];
    matriz[2] = new int[4];
    
    System.out.println("tamanio matriz: "+matriz.length);
    System.out.println("tamanio fila 0: "+matriz[0].length);
    System.out.println("tamanio fila 1: "+matriz[1].length);
    System.out.println("tamanio fila 2: "+matriz[2].length);
    
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = i*j;
      }
    }
    
    System.out.println("\nMATRIZ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]+"\t");
      }
      System.out.println();
    }
  }  
}
