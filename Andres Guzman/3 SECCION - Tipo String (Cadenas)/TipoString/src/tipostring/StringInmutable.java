package tipostring;

public class StringInmutable {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - INMUTABLE **********");
    String curso = "Programacion Java";
    String profesor = "Andres Guzman";
    
    System.out.println("\n********** concat **********");
    String resultado = curso.concat(profesor);
    System.out.println(resultado);
    System.out.println(curso == resultado);
    
    System.out.println("\n********** replace **********");
    String resultado2 = resultado.replace("a", "A");
    System.out.println(resultado2);
  }  
}
