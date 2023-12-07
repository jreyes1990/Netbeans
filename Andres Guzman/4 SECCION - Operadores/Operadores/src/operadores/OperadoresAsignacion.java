package operadores;

public class OperadoresAsignacion {

  public static void main(String[] args) {
    System.out.println("********** OPERADORES - ASIGNACION **********");
    int i = 5;
    int j = i+4;
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("\n********** Asignacion (+) **********");
    i += 2;
    System.out.println("i = "+i);
    i += 5;
    System.out.println("i = "+i);
    
    
    System.out.println("\n********** Asignacion (-) **********");
    j -= 4;
    System.out.println("j = "+j);
    
    System.out.println("\n********** Asignacion (*) **********");
    j *= 3;
    System.out.println("j = "+j);
    
    System.out.println("\n********** Asignacion (prueba consulta) **********");
    String sqlString = "select * from clientes as c ";
    sqlString += "where c.nombre='Andres' ";
    sqlString += "and c.activo =1;";
    System.out.println("sqlString = "+sqlString);
  }  
}
