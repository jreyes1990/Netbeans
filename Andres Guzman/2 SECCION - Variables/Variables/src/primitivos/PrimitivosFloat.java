package primitivos;

public class PrimitivosFloat {
  static float varFlotante=45.45F;

  public static void main(String[] args) {
    System.out.println("********** PRIMITIVOS NUMERICOS DE PUNTO FLOAT **********");
    System.out.println("\n********** FLOAT **********");
    float numeroFloat = 2120.25F;
    System.out.println("numero float: "+numeroFloat);
    System.out.println("tipo float corresponde en byte a "+Float.BYTES);
    System.out.println("tipo float corresponde en bites a "+Float.SIZE);
    System.out.println("Valor minimo de un float "+Float.MIN_VALUE);
    System.out.println("Valor maximo de un float "+Float.MAX_VALUE);
    
    System.out.println("\n********** DOUBLE **********");
    double numeroDouble = 2120.252566255;
    System.out.println("numero double: "+numeroDouble);
    System.out.println("tipo double corresponde en byte a "+Double.BYTES);
    System.out.println("tipo double corresponde en bites a "+Double.SIZE);
    System.out.println("Valor minimo de un double "+Double.MIN_VALUE);
    System.out.println("Valor maximo de un double "+Double.MAX_VALUE);
    
    System.out.println("\n********** VAR FLOTANTE **********");
    System.out.println("numero var flotante: "+varFlotante);
  }  
}
