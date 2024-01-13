package org.jreyes.poo;

import org.jreyes.poo.sobrecarga.Calculadora;

public class app {

  public static void main(String[] args) {
    Calculadora cal = new Calculadora();
    
    System.out.println("suma int: "+cal.sumar(10, 5));
    System.out.println("suma float: "+cal.sumar(10F, 5F));
    System.out.println("suma float-int: "+cal.sumar(10F, 5));
    System.out.println("suma int-float: "+cal.sumar(10, 5F));
    System.out.println("suma double: "+cal.sumar(10L, 5L));
    System.out.println("suma String: "+cal.sumar("10", "5"));
  }  
}
