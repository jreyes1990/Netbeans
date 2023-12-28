package arreglos;

import java.util.Arrays;

public class Arreglos {

  public static void main(String[] args) {
    int[] numeros = new int[4];
    
    numeros[0] = 10;
    numeros[1] = Integer.valueOf("7");
    numeros[2] = 35;
    numeros[3] = -1;
    
    // Ordena los productos, segun numero
    Arrays.sort(numeros);
    
    int i = numeros[0];
    int j = numeros[1];
    int k = numeros[2];
    int l = numeros[numeros.length-1];
    
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    System.out.println("k = "+k);
    System.out.println("l = "+l);
    
    System.out.println();
    
    String[] productos = new String[7];
    
    productos[0] = "Kingston Pendrive 64GB";
    productos[1] = "Samsung Galaxy";
    productos[2] = "Disco Duro SSD Samsung Externo";
    productos[3] = "Asus Notebook";
    productos[4] = "Macbook Air";
    productos[5] = "Chromecast 4ta Generacion";
    productos[6] = "Bicicleta Oxford";
    
    // Ordena los productos, segun su descripcion
    Arrays.sort(productos);
    
    
    System.out.println("productos[0] = "+productos[0]);
    System.out.println("productos[1] = "+productos[1]);
    System.out.println("productos[2] = "+productos[2]);
    System.out.println("productos[3] = "+productos[3]);
    
    System.out.println();
    
    for (int m = 0; m < productos.length; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
  }  
}
