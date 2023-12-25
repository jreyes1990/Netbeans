package clasemath;

public class ClaseMath {

  public static void main(String[] args) {
    int absoluto = Math.abs(-30);
    System.out.println("abs = "+absoluto);
    
    double maximo = Math.max(3.5, 1.2);
    System.out.println("max = "+maximo);
    
    double minimo = Math.min(3.5, 1.2);
    System.out.println("min = "+minimo);
    
    double techo = Math.ceil(3.5);
    System.out.println("ceil = "+techo);
    
    double piso = Math.floor(3.5);
    System.out.println("floor = "+piso);
    
    double entero = Math.round(3.5);
    System.out.println("round = "+entero);
  }  
}
