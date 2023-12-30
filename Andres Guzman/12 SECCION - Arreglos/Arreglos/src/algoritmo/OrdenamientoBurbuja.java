package algoritmo;

public class OrdenamientoBurbuja {

  public static void main(String[] args) {
    String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", "Chromecast 4ta Generacion", "Bicicleta Oxford"};
    int total = productos.length;
    int contador = 0;
    
    // System.out.println("Compara cada elemento".toUpperCase());
    // Algoritmo Ordenamiento Burbuja
    /*
    for (int i = 0; i < total; i++) {
      for (int j = 0; j < total; j++) {
        if (productos[i].compareTo(productos[j]) < 0) {
          String auxiliar = productos[i];
          productos[i] = productos[j];
          productos[j] = auxiliar;
        }
        contador++;
      }
    }
    */
    
    for (int i = 0; i < total-1; i++) {
      for (int j = 0; j < total-1-i; j++) {
        if (productos[j+1].compareTo(productos[j]) < 0) {
          String auxiliar = productos[j];
          productos[j] = productos[j+1];
          productos[j+1] = auxiliar;
        }
        contador++;
      }
    }
    System.out.println("contador = ".toUpperCase()+contador);
    
    System.out.println("\nRecorre cada elemento".toUpperCase());
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
  }  
}
