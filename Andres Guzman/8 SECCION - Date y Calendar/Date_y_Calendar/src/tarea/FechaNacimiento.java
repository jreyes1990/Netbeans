package tarea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FechaNacimiento {

  public static void main(String[] args) {
    int edad = 0;
    Scanner s = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy)");
    try {
      Date fechaNacimiento = format.parse(s.next());
      Date fechaActual = new Date();
      
      // Crear objetos Calendar para manipular las fechas
      Calendar calendarNacimiento = Calendar.getInstance();
      Calendar calendarActual = Calendar.getInstance();
      
      // Establecer las fechas en los objetos Calendar
      calendarNacimiento.setTime(fechaNacimiento);
      calendarActual.setTime(fechaActual);

      // Calcular la edad
      edad = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
      
      // Ajustar la edad si aún no ha pasado el cumpleaños de la persona este año
      if (calendarActual.get(Calendar.DAY_OF_YEAR) < calendarNacimiento.get(Calendar.DAY_OF_YEAR)) {
        edad--;
      }
            
      // Mostrar la edad
      System.out.println("La edad de la persona es: " + edad + " años.");
    } catch (ParseException e) {
      System.out.println("Error al parsear la fecha. Asegúrate de usar el formato dd/MM/yyyy.");
      e.printStackTrace();
    }
    // Cerrar el scanner
    s.close();
  }  
}
