package appmatrices;

public class MatricesSumarFilasColumnas {

  public static void main(String[] args) {
    int[][] a = {
      {1,2,3}, 
      {4,5,6}, 
      {7,8,9}
    };
    
    System.out.println("MATRIZ ORIGINAL");
    for (int i = 0; i < a.length; i++) {  
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
    
    System.out.println("\nSUMA MATRIZ 'FILAS'y'COLUMNAS'");
    int sumaFila, sumaColumna;
    
    for (int i = 0; i < a.length; i++) {
      sumaFila = 0;
      sumaColumna = 0;
      for (int j = 0; j < a[i].length; j++) {
        sumaFila += a[i][j];
        sumaColumna += a[j][i];
      }
      System.out.println("Total fila ["+i+"]: "+sumaFila);
      System.out.println("Total columna ["+i+"]: "+sumaColumna);
      System.out.println();
    }
  }  
}
