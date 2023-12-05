package tipostring;

public class StringMetodos {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - METODOS **********");
    String nombre = "Jolberth";
    
    System.out.println("\n********** metodo length() **********");
    System.out.println("nombre.length() = "+nombre.length());
    
    System.out.println("\n********** metodo toUpperCase() **********");
    System.out.println("nombre.toUpperCase() = "+nombre.toUpperCase());
    
    System.out.println("\n********** metodo toLowerCase() **********");
    System.out.println("nombre.toLowerCase() = "+nombre.toLowerCase());
    
    System.out.println("\n********** metodo equals() **********");
    System.out.println("nombre.equals(\"Jolberth\") = "+nombre.equals("Jolberth"));
    
    System.out.println("\n********** metodo equalsIgnoreCase() **********");
    System.out.println("nombre.equalsIgnoreCase(\"Jolberth\") = "+nombre.equalsIgnoreCase("jolberth"));
    
    System.out.println("\n********** metodo compareTo() **********");
    System.out.println("nombre.compareTo(\"Jolberth\") = "+nombre.compareTo("Jolberth"));
    
    System.out.println("\n********** metodo charAt() **********");
    System.out.println("nombre.charAt(0) = "+nombre.charAt(0));
    System.out.println("nombre.charAt(1) = "+nombre.charAt(1));
    System.out.println("nombre.charAt(nombre.length()-1) = "+nombre.charAt(nombre.length()-1));
    
    System.out.println("\n********** metodo substring() **********");
    System.out.println("nombre.substring(1) = "+nombre.substring(1));
    System.out.println("nombre.substring(1, 4) = "+nombre.substring(1, 4));
    System.out.println("nombre.substring(nombre.length()-1) = "+nombre.substring(nombre.length()-1));
  }  
}
