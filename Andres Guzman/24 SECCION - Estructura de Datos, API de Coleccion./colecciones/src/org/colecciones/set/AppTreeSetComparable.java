package org.colecciones.set;

import java.util.Set;
import java.util.TreeSet;
import org.colecciones.modelo.Alumno;

public class AppTreeSetComparable {

  public static void main(String[] args) {
    Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
    sa.add(new Alumno("Pato", 5));
    sa.add(new Alumno("Cata", 6));
    sa.add(new Alumno("Luci", 4));
    sa.add(new Alumno("Jano", 7));
    sa.add(new Alumno("Andres", 3));
    sa.add(new Alumno("Zeus", 2));
    
    System.out.println(sa);
  }  
}
