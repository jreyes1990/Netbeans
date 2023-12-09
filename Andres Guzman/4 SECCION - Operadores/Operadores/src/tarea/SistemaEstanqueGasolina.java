package tarea;

import java.util.Locale;
import java.util.Scanner;

/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y 
mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

1. Si la capacidad actual es 70 litros: imprimir Estanque lleno
2. Si está entre 60 y menor a 70: imprimir Estanque casi lleno
3. Si está entre 40 y menor a 60: imprimir Estanque  3/4
4. Si está entre 35 y menor a 40: imprimir Medio Estanque 
5. Si está entre 20 y menor a 35: imprimir Suficiente
6. Si está entre 1 y menor a 20: imprimir Insuficiente
*/
public class SistemaEstanqueGasolina {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Ingrese su medida (litros)");
    double medida = scanner.nextDouble();
    String mensaje ="";
    
    if (medida >= 70) {
      mensaje = "Estanque lleno";
    } else if (medida >= 60){
      mensaje = "Estanque casi lleno";
    } else if (medida >= 40){
      mensaje = "Estanque  3/4";
    } else if (medida >= 35){
      mensaje = "Medio Estanque";
    } else if (medida >= 20){
      mensaje = "Suficiente";
    } else if (medida >= 1){
      mensaje = "Insuficiente";
    } else {
      mensaje = "No esta definido";
    }
    
    System.out.println(mensaje);
  }  
}
