package flujocontrol;

public class ForEach {

  public static void main(String[] args) {
    int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
    String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
    
    System.out.println("ARREGLO NUMEROS");
    for (int num : numeros) {
      System.out.println("num = "+num);
    }
    
    System.out.println("\nARREGLO NOMBRE");
    for (String nom : nombres) {
      System.out.println("nombre = "+nom);
    }
  }  
}
