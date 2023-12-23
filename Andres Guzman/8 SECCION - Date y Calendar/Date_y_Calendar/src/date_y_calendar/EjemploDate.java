package date_y_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EjemploDate {

  public static void main(String[] args) {
    Date fecha = new Date();
    
    System.out.println("Date = "+fecha);
    
    SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy", Locale.getDefault());
    String fechaStr = df.format(fecha);
    System.out.println("SimpleDateFormat = "+fechaStr);
  }  
}
