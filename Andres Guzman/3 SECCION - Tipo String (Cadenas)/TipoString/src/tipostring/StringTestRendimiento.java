package tipostring;

public class StringTestRendimiento {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - TEST RENDIMIENTO **********");
    String a = "a";
    String b = "b";
    String c = a;
    
    System.out.println("\n********** currentTimeMillis **********");
    long inicio = System.currentTimeMillis();
    long fin = System.currentTimeMillis();
    
    System.out.println(fin-inicio);
  }  
}
