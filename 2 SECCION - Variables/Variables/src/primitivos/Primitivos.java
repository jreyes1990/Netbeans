package primitivos;

public class Primitivos {

  public static void main(String[] args) {
    System.out.println("********** PRIMITIVOS NUMERICOS ENTEROS **********");
    System.out.println("********** BYTE **********");
    byte numeroByte = 7;
    System.out.println("numero byte: "+numeroByte);
    System.out.println("tipo byte corresponde en byte a "+Byte.BYTES);
    System.out.println("tipo byte corresponde en bites a "+Byte.SIZE);
    System.out.println("Valor minimo de un byte "+Byte.MIN_VALUE);
    System.out.println("Valor maximo de un byte "+Byte.MAX_VALUE);
    
    System.out.println("\n********** SHORT **********");
    short numeroShort = 30000;
    System.out.println("numero short: "+numeroShort);
    System.out.println("tipo short corresponde en byte a "+Short.BYTES);
    System.out.println("tipo short corresponde en bites a "+Short.SIZE);
    System.out.println("Valor minimo de un short "+Short.MIN_VALUE);
    System.out.println("Valor maximo de un short "+Short.MAX_VALUE);
    
    System.out.println("\n********** INT **********");
    int numeroInt = 2147483647;
    System.out.println("numero int: "+numeroInt);
    System.out.println("tipo int corresponde en byte a "+Integer.BYTES);
    System.out.println("tipo int corresponde en bites a "+Integer.SIZE);
    System.out.println("Valor minimo de un int "+Integer.MIN_VALUE);
    System.out.println("Valor maximo de un int "+Integer.MAX_VALUE);
    
    System.out.println("\n********** LONG **********");
    long numeroLong = 21474836489L;
    System.out.println("numero long: "+numeroLong);
    System.out.println("tipo long corresponde en byte a "+Long.BYTES);
    System.out.println("tipo long corresponde en bites a "+Long.SIZE);
    System.out.println("Valor minimo de un long "+Long.MIN_VALUE);
    System.out.println("Valor maximo de un long "+Long.MAX_VALUE);
  }  
}
