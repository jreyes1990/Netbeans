package flujocontrol;

import javax.swing.JOptionPane;

public class ForArreglo {

  public static void main(String[] args) {
    String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
    int count = nombres.length;
    
    for (int i = 0; i < count; i++) {
      if (nombres[i].toLowerCase().contains("andres") || nombres[i].toLowerCase().contains("pepa")) {
        continue;
      }
      /*
      if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")) {
        continue;
      }
      */
      System.out.println(i+".- "+nombres[i]);
    }
    
    String buscar = JOptionPane.showInputDialog("Ingrese un nombre \"Pepe\" o \"Maria\"");
    System.out.println("buscar = "+buscar);
    
    boolean encontrado = false;
    for (int i = 0; i < count; i++) {
      if (nombres[i].equalsIgnoreCase(buscar)) {
        encontrado = true;
        break;
      }
    }
    
    if (encontrado) {
      JOptionPane.showConfirmDialog(null, buscar + " fue encontrado");
    } else {
      JOptionPane.showConfirmDialog(null, buscar + " no existen en el sistema");
    }
  }  
}
