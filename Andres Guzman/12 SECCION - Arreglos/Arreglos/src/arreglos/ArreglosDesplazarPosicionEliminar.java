package arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicionEliminar {

  public static void main(String[] args) {
    int[] a = new int[10];
    int posicion;
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < a.length; i++) {
      System.out.print("["+i+"] Ingrese el numero: ");
      a[i] = s.nextInt();
    }
    
    System.out.println();
    System.out.print("Ingrese una posicion a eliminar (de 0 - 9): ");
    posicion = s.nextInt();
    
    for (int i = posicion; i < a.length-1; i++) {
      a[i] = a[i+1];
    }
    
    /*
    for (int i = 0; i < a.length-1; i++) {
      System.out.println("a["+i+"] => "+a[i]);
    }
    */
    
    int[] b = new int[a.length-1];
    System.arraycopy(a, 0, b, 0, b.length);
    
    for (int i = 0; i < b.length; i++) {
      System.out.println("a["+i+"] => "+b[i]);
    }
  }  
}
