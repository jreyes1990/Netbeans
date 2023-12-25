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
    
    double exponente = Math.exp(1);
    System.out.println("exp = "+exponente);
    
    double logaritmoNatural = Math.log(10);
    System.out.println("log = "+logaritmoNatural);
    
    double potencia = Math.pow(10, 3);
    System.out.println("pow = "+potencia);
    
    double raizCuadrada = Math.sqrt(5);
    System.out.println("sqrt = "+raizCuadrada);
    
    double convertirRadianesToGrados = Math.toDegrees(1.57);
    convertirRadianesToGrados = Math.round(convertirRadianesToGrados);
    System.out.println("toDegrees = "+convertirRadianesToGrados);
    
    double convertirGradosToRadianes = Math.toRadians(90.00);
    convertirGradosToRadianes = Math.round(convertirGradosToRadianes);
    System.out.println("toRadians = "+convertirGradosToRadianes);
  }  
}
