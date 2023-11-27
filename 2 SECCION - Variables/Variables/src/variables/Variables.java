package variables;

public class Variables {

  public static void main(String[] args) {
    System.out.println("********** VARIABLES **********");
    String saludar = "Hola mundo desde Java"; 
    System.out.println(saludar.toUpperCase());
    
    System.out.println("\n********** PRIMITIVO **********");
    int numero = 10;
    System.out.println("numero = " + numero);
    
    boolean valor = true;
    int numero2 = 5;
    if(valor){
      System.out.println("numero = " + numero);
    }
    System.out.println("numero2 = "+numero2);
  }
}
