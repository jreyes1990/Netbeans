package operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

  public static void main(String[] args) {
    System.out.println("********** OPERADORES ARITMETICOS **********");
    int i=5;
    int j=4; 
    
    System.out.println("\n********** SUMA **********");
    int suma=i+j;
    System.out.println(i+" + "+j+" = "+suma);
    
    System.out.println("\n********** RESTA **********");
    int resta=i-j;
    System.out.println(i+" - "+j+" = "+resta);
    
    System.out.println("\n********** MULTIPLICACION **********");
    int multiplicacion=i*j;
    System.out.println(i+" * "+j+" = "+multiplicacion);
    
    System.out.println("\n********** DIVISION **********");
    float division=(float) i/ (float) j;
    System.out.println(i+" / "+j+" = "+division);
    
    System.out.println("\n********** MOD **********");
    float modulo=(float) i% (float) j;
    System.out.println(i+" % "+j+" = "+modulo);
    
    System.out.println("\n********** INGRESANDO VALORES **********");
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    
    if (numero % 2 == 0) {
      System.out.println("numero par "+numero);
    }else {
      System.out.println("numero impar "+numero);
    }
  }  
}
