package tipostring;

public class StringMetodosArreglo {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - METODOS ARREGLO **********");
    String trabalenguas = "trabalenguas";
    
    System.out.println("\n********** metodo toCharArray() **********");
    System.out.println("trabalenguas.toCharArray() = "+ trabalenguas.toCharArray());
    
    char[] arreglo = trabalenguas.toCharArray();
    int largoArreglo = arreglo.length;
    for (int i = 0; i < largoArreglo; i++) {
      System.out.println("arreglo[i] ="+arreglo[i]);
    }
    
    System.out.println("\n********** metodo split() **********");
    System.out.println("trabalenguas.split() = "+ trabalenguas.split("a"));
    String[] arreglo2 =  trabalenguas.split("a");
    int l = arreglo2.length;
    for (int j = 0; j < l; j++) {
      System.out.println("arreglo2[j] = "+arreglo2[j]);
    }
    
    String archivo = "Alguna.imagen.jpg";
    String[] arvhivoArr = archivo.split("\\.");
    l = arvhivoArr.length;
    for (int j = 0; j < l; j++) {
      System.out.println("archivoArr[j] = "+arvhivoArr[j]);
    }
  }  
}
