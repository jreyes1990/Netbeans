package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class ArreglosIterandoInversoMutable {

  public static void arregloInverso(String[] arreglo){
    int total = arreglo.length;
    int total2 = arreglo.length;
    
    for (int i = 0; i < total2; i++) {
      String actual = arreglo[i];
      String inverso = arreglo[total-1-i];
      
      arreglo[i] = inverso;
      arreglo[total-1-i] = actual;
      total2--;
    }
  }
  
  public static void main(String[] args) {
    String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", "Chromecast 4ta Generacion", "Bicicleta Oxford"};
    int total = productos.length;
    
    // Ordena los productos, segun su descripcion
    Arrays.sort(productos);
    
    System.out.println("\n***** FOR INCREMENTO *****");
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
    
    System.out.println("\n***** MODIFICANDO ARREGLO REVERSO *****");
    for (int i = 0; i < total/2; i++) {
      String actual = productos[i];
      String inverso = productos[total-1-i];
      
      productos[i] = inverso;
      productos[total-1-i] = actual;
    }
    
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
    
    System.out.println();
    arregloInverso(productos);
    // Collections.reverse(Arrays.asList(productos));
    
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
  }  
}
