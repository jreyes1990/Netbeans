package arreglos;

import java.util.Arrays;

public class ArreglosIterandoInverso {

  public static void main(String[] args) {
    String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", "Chromecast 4ta Generacion", "Bicicleta Oxford"};
    int total = productos.length;
    
    // Ordena los productos, segun su descripcion
    Arrays.sort(productos);
    
    System.out.println("\n***** FOR INCREMENTO - INVERSO *****");
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+(total-1-m)+"] = "+productos[total-1-m]);
    }
    
    System.out.println("\n***** FOR DECREMENTO - INVERSO *****");
    for (int m = total-1; m >= 0; m--) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
    
    System.out.println("\n***** WHILE INCREMENTO - INVERSO *****");
    int i = 0;
    while (i < total) {
      System.out.println("productos["+(total-1-i)+"] = "+productos[total-1-i]);     
      i++;
    }
    
    System.out.println("\n***** WHILE DECREMENTO - INVERSO *****");
    int ii = total-1;
    while (ii >= 0) {
      System.out.println("productos["+ii+"] = "+productos[ii]);     
      ii--;
    }
    
    System.out.println("\n***** DO WHILE INCREMENTO - INVERSO *****");
    int j = 0;
    do {
      System.out.println("productos["+(total-1-j)+"] = "+productos[total-1-j]);     
      j++;
    } while (j < total);
    
    System.out.println("\n***** DO WHILE DECREMENTO - INVERSO *****");
    int jj = total-1;
    do {
      System.out.println("productos["+jj+"] = "+productos[jj]);     
      jj--;
    } while (jj >= 0);
  }  
}
