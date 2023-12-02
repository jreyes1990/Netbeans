package primitivos;

import javax.swing.JOptionPane;

public class SistemasNumericos {

  public static void main(String[] args) {
    System.out.println("********** SISTEMAS NUMERICOS **********");
    System.out.println("\n********** NUMERO DECIMAL **********");
    int numeroDecimal = 500;
    System.out.println("numeroDecimal = "+numeroDecimal);
    
    System.out.println("\n********** NUMERO BINARIO **********");
    System.out.println("numero binario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));
    
    System.out.println("\n********** NUMERO OCTAL **********");
    int numeroBinario = 0b111110100;
    System.out.println("numeroBinario = "+numeroBinario);
    System.out.println("numero octal de "+numeroBinario+" = "+Integer.toOctalString(numeroBinario));
    int numeroOctal = 0764;
    System.out.println("numeroOctal = "+numeroOctal);
    
    System.out.println("\n********** NUMERO HEXADECIMAL **********");
    System.out.println("numero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal));
    int numeroHex = 0X1F4;
    System.out.println("numeroHexadecimal = "+numeroHex);
    
    System.out.println("\n\n********** SISTEMAS NUMERICOS - ENTRADA DE DATOS **********");
    String inputNumeroDecimal = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
    
    try {
      int parseNumeroDecimal = Integer.parseInt(inputNumeroDecimal);
      String mensaje = "";
      mensaje += "numero binario de "+parseNumeroDecimal+" = "+Integer.toBinaryString(parseNumeroDecimal);
      mensaje += "\nnumero octal de "+parseNumeroDecimal+" = "+Integer.toOctalString(parseNumeroDecimal);
      mensaje += "\nnumero hexadecimal de "+parseNumeroDecimal+" = "+Integer.toHexString(parseNumeroDecimal);
      JOptionPane.showMessageDialog(null, mensaje);
      System.out.println(mensaje);
    } catch (NumberFormatException e) {
      System.out.println("ERROR: "+e);
      JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
      main(args);
      System.exit(0);
    }
  }  
}
