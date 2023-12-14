package flujocontrol;

public class While_DoWhile {

  public static void main(String[] args) {
    System.out.println("PRIMER CODIGO WHILE");
    int i = 0;
    while (i < 5) {      
      System.out.println("i = "+i);
      i++;
    }
    
    System.out.println("SEGUNDO CODIGO WHILE");
    i = 0;
    boolean prueba = true;
    while (prueba) {      
      if (i == 7) {
        prueba = false;
      }
      System.out.println("i = "+i);
      i++;
    }
    
    System.out.println("\nPRIMER CODIGO DO WHILE");
    prueba = false;
    do {      
      System.out.println("Se ejecuta al menos una vez");
    } while (prueba);
    
    System.out.println("SEGUNDO CODIGO DO WHILE");
    prueba = true;
    i = 0;
    do {      
      if (i == 10) {
        prueba = false;
      }
      System.out.println("i = "+i);
      i++;
    } while (prueba);
  }  
}
