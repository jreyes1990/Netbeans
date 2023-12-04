package tipostring;

public class StringValidar {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - VALIDACION **********");
    String curso = null;
    boolean esNulo = curso == null;
    System.out.println("esNulo = "+esNulo);
    
    System.out.println("\n********** Validacion con if **********");
    if (esNulo) {
      curso = "";
    }
    
    System.out.println("\n********** Validacion con length **********");
    boolean esVacio = curso.length() == 0;
    System.out.println("esVacio = "+esVacio);
    
    System.out.println("\n********** Validacion con isEmpty **********");
    boolean esVacio2 = curso.isEmpty();
    System.out.println("esVacio2 = "+esVacio2);
    
    if (!esVacio2) {
      System.out.println(curso.toUpperCase());
      System.out.println("Bienvenido al curso ".concat(curso));
    }
  }  
}
