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
    
    System.out.println("********** CONVERSION DE TIPOS - OPUESTO **********");
    
    System.out.println("\n********** Int a String **********");
    int otroNumeroInt = 100;
    
    String otroNumeroStr = Integer.toString(numeroInt);
    System.out.println("otroNumeroStr = "+otroNumeroStr);
    
    otroNumeroStr = String.valueOf(otroNumeroInt);
    System.out.println("otroNumeroStr = "+otroNumeroStr);
    
    System.out.println("\n********** Double a String **********");
    double otroNumeroDouble = 1.23456e2;
    
    String otroDoubleStr = Double.toString(otroNumeroDouble);
    System.out.println("otroDoubleStr = "+otroDoubleStr);
    
    otroDoubleStr = String.valueOf(otroNumeroDouble);
    System.out.println("otroDoubleStr = "+otroDoubleStr);
  }  
}
