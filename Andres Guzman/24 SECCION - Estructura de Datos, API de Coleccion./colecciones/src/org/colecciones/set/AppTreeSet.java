package org.colecciones.set;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

  public static void main(String[] args) {
    Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
    ts.add("uno");
    ts.add("dos");
    ts.add("tres");
    ts.add("tres");
    ts.add("cuatro");
    ts.add("cinco");
    
    System.out.println("ts = "+ts);
    
    Set<Integer> numeros = new TreeSet<>((a, b) -> { return a.compareTo(b); });
    numeros.add(1);
    numeros.add(5);
    numeros.add(4);
    numeros.add(2);
    numeros.add(3);
    numeros.add(10);
    System.out.println("numeros = "+numeros);
  }  
}
