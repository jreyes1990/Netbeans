package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

  public PizzaNewYorkItaliana() {
    super();
    nombre = "Pizza italiana New York";
    masa = "Masa gruesa";
    salsa = "Salsa de tomate italiano carne";
    ingredientes.add("Queso mozzarella");
    ingredientes.add("Aceitunas");
    ingredientes.add("Jamon");
    ingredientes.add("Choricillo");
    ingredientes.add("Champiniones");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 30 min. a 120°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en triangulos grandes.");
  }
  
}
