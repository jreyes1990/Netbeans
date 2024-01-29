package org.poo.excepciones.ejemplo;

import javax.swing.JOptionPane;

public class AppMain {

  public static void main(String[] args) {
    Calculadora cal = new Calculadora();
    String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
    int divisor;
    double division;
    
    try {
      divisor = Integer.parseInt(valor);
      division = cal.dividir(10, divisor);
      
      System.out.println("resultado = "+division);
    } catch (NumberFormatException nfe) {
      System.out.println("Se detecto una excepcion: ingrese un valor numerico: "+nfe.getMessage());
      main(args);
    } catch (DivisionPorZeroException ae) {
      System.out.println(ae.getMessage());
      main(args);
    } finally {
      System.out.println("Es opcional, pero se ejecuta siempre con excepcion o sin!");
    }
    System.out.println("Continuamos con el flujo de nuestra aplicacion");
  }  
}
