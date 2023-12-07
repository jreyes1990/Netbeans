package operadores;

public class OperadoresIncrementales {

  public static void main(String[] args) {
    System.out.println("********** OPERADORES - INCREMENTALES **********");
    
    System.out.println("\n********** Pre Incremento **********");
    int i = 1;
    int j = ++i;
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("\n********** Post Incremento **********");
    i = 2;
    j = i++;
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("\n********** Pre Decremento **********");
    i = 3;
    j = --i;
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("\n********** Post Decremento **********");
    i = 4;
    j = i--;
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("++j = "+(++j));
    System.out.println("j++ = "+(j++));
  }  
}
