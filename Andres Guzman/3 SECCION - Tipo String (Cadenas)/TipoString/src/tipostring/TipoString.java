package tipostring;

public class TipoString {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING **********");
    String curso = "Programacion Java";
    String curso2 = new String("ProgramacioN Java");
    
    System.out.println("\n********** Metodo de comparacion (equals) **********");
    boolean esIgual = curso.equals(curso2);
    System.out.println("equals = "+esIgual);
    
    System.out.println("\n********** Metodo de comparacion (equalsIgnoreCase) **********");
    esIgual = curso.equalsIgnoreCase(curso2);
    System.out.println("equalsIgnoreCase = "+esIgual);
  }  
}
