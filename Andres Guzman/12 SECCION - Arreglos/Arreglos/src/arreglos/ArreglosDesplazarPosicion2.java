package arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicion2 {

  public static void main(String[] args) {
    int[] a = new int[10];
    int elemento, posicion;
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < a.length; i++) {
      System.out.print("["+i+"] Ingrese el numero: ");
      a[i] = s.nextInt();
    }
    
    System.out.println();
    System.out.print("Nuevo elemento: ");
    elemento = s.nextInt();
    
    System.out.print("Posicion donde agregar (de 0 a 9): ");
    posicion = s.nextInt();
    
    for (int i = a.length-2; i >= posicion; i--) {
      a[i+1] = a[i];
    }
    a[posicion] = elemento;
    
    System.out.println("El arreglo: ");
    for (int i = 0; i < a.length; i++) {
      System.out.println("a["+i+"] = "+a[i]);
    }
  }  
}
