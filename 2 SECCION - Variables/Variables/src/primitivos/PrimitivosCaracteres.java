package primitivos;

public class PrimitivosCaracteres {

  public static void main(String[] args) {
    System.out.println("********** PRIMITIVOS CHAR O CARACTER **********");
    System.out.println("********** ENLACE1: https://symbl.cc/es/ **********\n********** ENLACE2: https://www.rapidtables.com/code/ **********");
    System.out.println("\n********** CHAR **********");
    char caracter = '\u0040';
    char decimal = 64;
    char simbolo = '@';
    
    System.out.println("caracter = "+caracter);
    System.out.println("decimal = "+decimal);
    System.out.println("decimal=caracter: "+(decimal==caracter));
    System.out.println("decimal=simbolo: "+(decimal==simbolo));
    System.out.println("tipo char corresponde en byte a "+Character.BYTES);
    System.out.println("tipo char corresponde en bites a "+Character.SIZE);
    System.out.println("Valor minimo de un char "+Character.MIN_VALUE);
    System.out.println("Valor maximo de un char "+Character.MAX_VALUE);
    
    System.out.println("\n********** CARACTERES ESPECIALES **********");
    char espacio = '\u0020';
    char retroceso = '\b';
    char tabulador = '\t';
    char nuevaLinea = '\n';
    char retornoCarro = '\r';
    
    System.out.println("char corresponde en byte:"+espacio+Character.BYTES);
    System.out.println("char corresponde en byte: "+retroceso+Character.BYTES);
    System.out.println("char corresponde en byte: "+tabulador+Character.BYTES);
    System.out.println("char corresponde en byte: "+nuevaLinea+Character.BYTES);
    System.out.println("char corresponde en byte: "+retornoCarro+Character.BYTES);
    System.out.println("char corresponde en byte: "+System.getProperty("line.separator")+Character.BYTES);
    System.out.println("char corresponde en byte: "+System.lineSeparator()+Character.BYTES);
  }  
}
