package tipostring;

public class StringExtenArchivo {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - EXTENSION ARCHIVO **********");
    String archivo = "alguna.imagen.jpeg";
    int i = archivo.indexOf(".");
    int j = archivo.lastIndexOf(".");
    
    System.out.println("archivo.length() = "+archivo.length());
    System.out.println("archivo.substring(archivo.length()-4) = "+archivo.substring(archivo.length()-4));
    System.out.println("archivo.substring(i+1) = "+archivo.substring(i+1));
    System.out.println("archivo.substring(j+1) = "+archivo.substring(j+1));
  }  
}
