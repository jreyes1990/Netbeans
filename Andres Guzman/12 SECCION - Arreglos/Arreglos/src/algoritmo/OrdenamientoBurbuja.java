package algoritmo;

public class OrdenamientoBurbuja {

  public static void main(String[] args) {
    String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air", "Chromecast 4ta Generacion", "Bicicleta Oxford"};
    int total = productos.length;
    int contador = 0;
    
    // System.out.println("Compara cada elemento".toUpperCase());
    // Algoritmo Ordenamiento Burbuja
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
    System.out.println("contador = "+contador);
    
    System.out.println("\nRecorre cada elemento".toUpperCase());
    for (int m = 0; m < total; m++) {
      System.out.println("productos["+m+"] = "+productos[m]);
    }
  }  
}
