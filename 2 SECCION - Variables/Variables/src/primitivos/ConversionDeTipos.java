package primitivos;

public class ConversionDeTipos {

  public static void main(String[] args) {
    System.out.println("********** CONVERSION DE TIPOS **********");
    
    System.out.println("\n********** String a Int **********");
    String numeroStr = "50";
    int numeroInt = Integer.parseInt(numeroStr);
    System.out.println("numeroInt = "+ numeroInt);
    
    System.out.println("\n********** String a Double **********");
    String realStr = "98765.43e-3";
    double numeroDouble = Double.parseDouble(realStr);
    System.out.println("numeroDouble = "+ numeroDouble);
    
    System.out.println("\n********** String a Boolean **********");
    String logicoStr = "true";
    boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
    System.out.println("logicoBoolean = "+ logicoBoolean);
  }  
}
