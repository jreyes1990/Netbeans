package org.poo.excepciones.ejemplo;

import javax.swing.JOptionPane;

public class AppMain {

  public static void main(String[] args) {
    Calculadora cal = new Calculadora();
    String numerador = JOptionPane.showInputDialog("Ingrese un numerador: ");
    String denominador = JOptionPane.showInputDialog("Ingrese un denominador: ");
    
    try {
      double division = cal.dividir(numerador, denominador);
      
      System.out.println("resultado = "+division);
    } catch (FormatoNumeroException nfe) {
      System.out.println("Se detecto una excepcion: ingrese un valor numerico: "+nfe.getMessage());
      nfe.printStackTrace(System.out);
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
