package date_y_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploDatePase {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    System.out.println("Ingrese fecha con formato 'yyyy-MM-dd'");
    try {
      Date fecha = format.parse(s.next());
      System.out.println("fecha ="+fecha);
      System.out.println("format = "+format.format(fecha));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }  
}
