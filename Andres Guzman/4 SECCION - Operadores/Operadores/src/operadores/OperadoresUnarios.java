package operadores;

public class OperadoresUnarios {

  public static void main(String[] args) {
    System.out.println("********** OPERADORES - UNARIOS **********");
    int i = -5;
    
    System.out.println("\n********** j = (1)*i => -5 **********");
    int j = +i;
    System.out.println("j = "+j);
    
    System.out.println("\n********** k = (-1)*i => 5 **********");
    int k = -i;
    System.out.println("k = "+k);
    
    i = 6;
    j = +i;
    
    System.out.println("\n********** k = (1)*i => -6 **********");
    k = -i;
    System.out.println("k = "+k);
  }  
}
