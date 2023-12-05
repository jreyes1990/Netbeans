package tipostring;

public class StringMetodos {

  public static void main(String[] args) {
    System.out.println("********** TIPO STRING - METODOS PARTE 1 **********");
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
    
    System.out.println("********** TIPO STRING - METODOS PARTE 2 **********");
    String trabalenguas = "trabalenguas";
    
    System.out.println("\n********** metodo replace() **********");
    System.out.println("trabalenguas.replace(\"a\", \".\") = "+trabalenguas.replace("a", "."));
    
    System.out.println("\n********** metodo indexOf() **********");
    System.out.println("trabalenguas.indexOf(\"a\") = "+trabalenguas.indexOf("a"));
    System.out.println("trabalenguas.indexOf(\"e\") = "+trabalenguas.indexOf("e"));
    System.out.println("trabalenguas.indexOf(\"z\") = "+trabalenguas.indexOf("z"));
    
    System.out.println("\n********** metodo lastIndexOf() **********");
    System.out.println("trabalenguas.lastIndexOf(\"a\") = "+trabalenguas.lastIndexOf("a"));
    
    System.out.println("\n********** metodo contains() **********");
    System.out.println("trabalenguas.contains(\"t\") = "+trabalenguas.contains("t"));
    System.out.println("trabalenguas.contains(\"o\") = "+trabalenguas.contains("o"));
    
    System.out.println("\n********** metodo startsWith() **********");
    System.out.println("trabalenguas.startsWith(\"lenguas\") = "+trabalenguas.startsWith("lenguas"));
    System.out.println("trabalenguas.startsWith(\"trab\") = "+trabalenguas.startsWith("trab"));
    
    System.out.println("\n********** metodo endsWith() **********");
    System.out.println("trabalenguas.endsWith(\"lenguas\") = "+trabalenguas.endsWith("lenguas"));
    System.out.println("trabalenguas.endsWith(\"trab\") = "+trabalenguas.endsWith("trab"));
    
    System.out.println("\n********** metodo trim() **********");
    System.out.println("   trabalenguas   ");
    System.out.println("\"   trabalenguas   \".trim()".trim());
  }  
}
