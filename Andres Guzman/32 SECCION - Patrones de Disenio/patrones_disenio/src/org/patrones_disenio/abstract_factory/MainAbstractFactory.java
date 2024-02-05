package org.patrones_disenio.abstract_factory;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;
import org.patrones_disenio.abstract_factory.abstracto.PizzeriaCalifornia;
import org.patrones_disenio.abstract_factory.abstracto.PizzeriaNewYork;
import org.patrones_disenio.abstract_factory.abstracto.PizzeriaZona;

public class MainAbstractFactory {

  public static void main(String[] args) {
    PizzeriaZona ny = new PizzeriaNewYork();
    PizzeriaZona california = new PizzeriaCalifornia();
    
    PizzaProducto pizza = california.ordenarPizza("queso");
    System.out.println("Bruce ordena la "+pizza.getNombre());
    
    pizza = ny.ordenarPizza("pepperoni");
    System.out.println("Andres ordena la "+pizza.getNombre());
    
    pizza = california.ordenarPizza("vegetariana");
    System.out.println("James ordena la "+pizza.getNombre());
    
    pizza = ny.ordenarPizza("vegetariana");
    System.out.println("Linus ordena la "+pizza.getNombre());
    
    pizza = california.ordenarPizza("pepperoni");
    System.out.println("Jhon ordena la "+pizza.getNombre());
    
    System.out.println("pizza = "+pizza);
  }  
}
