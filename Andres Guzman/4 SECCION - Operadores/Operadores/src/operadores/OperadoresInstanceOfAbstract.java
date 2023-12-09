package operadores;

public class OperadoresInstanceOfAbstract {

  public static void main(String[] args) {
    Object texto = "Creando un objeto de la clase String ... que tal!";
    Integer num = Integer.valueOf(7);
    Boolean b1 = texto instanceof String;
    
    System.out.println("texto es del tipo String = "+b1);
    b1 = texto instanceof Object;
    System.out.println("texto es del tipo Object = "+b1);
    b1 = num instanceof Integer;
    System.out.println("num es del tipo Integer = "+b1);
    b1 = num instanceof Number;
    System.out.println("num es del tipo Number = "+b1);
    b1 = num instanceof Object;
    System.out.println("num es del tipo Object = "+b1);
    
    Number decimal = 45.54;
    b1 = decimal instanceof Double;
    System.out.println("decimal es del tipo Double = "+b1);
    b1 = decimal instanceof Float;
    System.out.println("decimal es del tipo Float = "+b1);
    b1 = decimal instanceof Number;
    System.out.println("decimal es del tipo Number = "+b1);
    b1 = b1 instanceof Boolean;
    System.out.println("b1 es del tipo Boolean = "+b1);
  }  
}
