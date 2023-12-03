package primitivos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

  public static void main(String[] args) {
    System.out.println("********** SISTEMAS NUMERICOS - ENTRADA SCANNER **********");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    // String numeroStr = scanner.nextLine();
    int numeroDecimal = 0;
    
    try {
      // numeroDecimal = Integer.parseInt(numeroStr);
      numeroDecimal = scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Error: Debe ingresar un numero entero");
      main(args);
      System.exit(0);
    }
    
    String mensaje = "";
    mensaje += "numero binario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
    mensaje += "\nnumero octal de "+numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);
    mensaje += "\nnumero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal);
    System.out.println(mensaje);
  }  
}
