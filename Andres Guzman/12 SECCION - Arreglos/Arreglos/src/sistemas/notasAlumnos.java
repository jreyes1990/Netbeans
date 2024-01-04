package sistemas;

import java.util.Locale;
import java.util.Scanner;

public class notasAlumnos {

  public static void main(String[] args) {
    double[] claseMatematicas, claseHistoria, claseLenguaje;
    double sumNotasMatematicas=0, sumNotasHistorias=0, sumNotasLenguaje=0;
    claseMatematicas = new double[7];
    claseHistoria = new double[7];
    claseLenguaje = new double[7];
    
    Scanner s = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Ingrese 7 notas de estudiantes para matematicas: ");
    for (int i = 0; i < claseMatematicas.length; i++) {
      System.out.print("Alumno Nro. "+i+": ");
      claseMatematicas[i] = s.nextDouble();
    }
    
    System.out.println("Ingrese 7 notas de estudiante para historia: ");
    for (int i = 0; i < claseHistoria.length; i++) {
      System.out.print("Alumno Nro. "+i+": ");
      claseHistoria[i] = s.nextDouble();
    }
    
    System.out.println("Ingrese 7 notas de estudiante para lenguaje: ");
    for (int i = 0; i < claseLenguaje.length; i++) {
      System.out.print("Alumno Nro. "+i+": ");
      claseLenguaje[i] = s.nextDouble();
    }
    
    // Preparando la sumatoria de las clases
    for (int i = 0; i < 7; i++) {
      sumNotasMatematicas += claseMatematicas[i];
      sumNotasHistorias += claseHistoria[i];
      sumNotasLenguaje += claseLenguaje[i];
    }
    
    // Calculando el promedio (notas) de las clases
    double promedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
    double promedioHistorias = (sumNotasHistorias/claseHistoria.length);
    double promedioLenguajes = (sumNotasLenguaje/claseLenguaje.length);
    double promedioClases = ((promedioMatematicas+promedioHistorias+promedioLenguajes)/3);
    
    // Visualizando el promedio (notas) de las clases
    System.out.println();
    
    System.out.println("Promedio Matematicas: "+promedioMatematicas);
    System.out.println("Promedio Historia: "+promedioHistorias);
    System.out.println("Promedio Lenguaje: "+promedioLenguajes);
    System.out.println("Promedio total de cursos: "+promedioClases);
    
    // Identificar el promedio de N alumno
    System.out.println();
    System.out.print("Ingrese el identificador del alumno (0 - 6): ");
    int id = s.nextInt();
    double promedioAlumno = ((claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3);
    System.out.println("Promedio alumno Nro. "+id+" : "+promedioAlumno);
  }  
}
