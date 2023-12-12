package flujocontrol;

public class For {

  public static void main(String[] args) {
    
    System.out.println("INCREMENTO");
    for (int i = 0; i <= 10; i++) {
      System.out.println("i = "+ i);
    }
    
    System.out.println("DECREMENTO");
    for (int i = 10; i >= 0; i--) {
      System.out.println("i = "+ i);
    }
    
    System.out.println("INCREMENTO Y DECREMENTO");
    for (int i = 1, j = 10; i < j; i++, j--) {
      System.out.println(i+" - "+j);
    }
    
    System.out.println("NUMEROS PARES");
    for (int i = 0; i <= 10; i++) {
      if (!(i%2 == 0)) {
        continue;
      }
      System.out.println("i = "+i);
    }
  }  
}
