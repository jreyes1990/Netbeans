package arreglos;

import java.util.Scanner;

public class ArreglosDesplazarPosicion3 {

  public static void main(String[] args) {
    int[] a = new int[7];
    int numero, posicion;
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < a.length-1; i++) {
      System.out.print("["+i+"] Ingrese el numero: ");
      a[i] = s.nextInt();
    }
    
    System.out.println();
    System.out.print("Ingrese un numero a insertar: ");
    numero = s.nextInt();
    
    posicion = 0;
    while (posicion < 6 && numero > a[posicion]) {      
      posicion++;
    }
    
    for (int i = a.length-2; i >= posicion; i--) {
      a[i+1] = a[i];
    }
    a[posicion] = numero;
    
    System.out.println("Nuevo arreglo ordenado: ");
    for (int i = 0; i < a.length; i++) {
      System.out.println("a["+i+"] = "+a[i]);
    }
  }  
}
