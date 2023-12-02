package primitivos;

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
  }  
}
