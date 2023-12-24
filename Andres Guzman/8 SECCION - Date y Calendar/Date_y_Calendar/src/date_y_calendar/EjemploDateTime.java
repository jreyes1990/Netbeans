package date_y_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploDateTime {

  public static void main(String[] args) {
    Date fecha = new Date();
    System.out.println("Date = "+fecha);
    SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
    String fechaStr = df.format(fecha);
    
    Date fecha2 = new Date();
    long tiempoFinal = fecha2.getTime()-fecha.getTime();
    System.out.println("tiempo transcurrido = "+tiempoFinal);
    System.out.println("fechaStr = "+fechaStr);
  }  
}
