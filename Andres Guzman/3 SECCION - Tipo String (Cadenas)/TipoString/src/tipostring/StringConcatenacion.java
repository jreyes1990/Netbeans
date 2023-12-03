package tipostring;

public class StringConcatenacion {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - CONCATENACION **********");
    String curso = "Programacion Java";
    String profesor = "Andres Guzman";
    
    System.out.println("\n********** + (Concatenacion) **********");
    String detalle = curso + " con el instructor "+profesor;
    System.out.println(detalle);
    
    int numeroA = 10;
    int numeroB = 5;
    System.out.println(detalle+ " " +(numeroA+numeroB));
    
    System.out.println("\n********** concat **********");
    String detalle2 = curso.concat(" ").concat(profesor);
    System.out.println(detalle2);
  }  
}
