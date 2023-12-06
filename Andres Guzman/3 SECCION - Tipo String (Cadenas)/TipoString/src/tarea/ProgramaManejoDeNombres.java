package tarea;

/*
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

1. Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
2. Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
3. Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser: N.es_A.ia_E.pe 
*/
public class ProgramaManejoDeNombres {

  public static void main(String[] args) {
    String primerNombre = "Andres";
    String segundoNombre = "Maria";
    String tercerNombre = "Pepe";
    
    String resultado1 = primerNombre.toUpperCase().charAt(1)+"."+primerNombre.substring(primerNombre.length()-2); 
    String resultado2 = "_"+segundoNombre.toUpperCase().charAt(1)+"."+segundoNombre.substring(segundoNombre.length()-2); 
    String resultado3 = "_"+tercerNombre.toUpperCase().charAt(1)+"."+tercerNombre.substring(tercerNombre.length()-2); 
    
    System.out.println(resultado1+resultado2+resultado3);
  }  
}
