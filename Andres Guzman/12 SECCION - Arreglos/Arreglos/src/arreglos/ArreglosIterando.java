package arreglos;

import java.util.Arrays;

public class ArreglosIterando {

  public static void main(String[] args) {
    String[] productos = new String[7];
    int total = productos.length;
    
    productos[0] = "Kingston Pendrive 64GB";
    productos[1] = "Samsung Galaxy";
    productos[2] = "Disco Duro SSD Samsung Externo";
    productos[3] = "Asus Notebook";
    productos[4] = "Macbook Air";
    productos[5] = "Chromecast 4ta Generacion";
    productos[6] = "Bicicleta Oxford";
    
    // Ordena los productos, segun su descripcion
    Arrays.sort(productos);
    
    System.out.println("\n***** FOR *****");
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
    
    System.out.println("\n***** FOR EACH *****");
    for (String prod : productos) {
      System.out.println("productos = "+prod);
    }
    
    System.out.println("\n***** WHILE *****");
    int i = 0;
    while (i < total) {
      System.out.println("productos["+i+"] = "+productos[i]);     
      i++;
    }
    
    System.out.println("\n***** DO WHILE *****");
    int j = 0;
    do {
      System.out.println("productos["+j+"] = "+productos[j]);     
      j++;
    } while (j < total);
  }  
}
