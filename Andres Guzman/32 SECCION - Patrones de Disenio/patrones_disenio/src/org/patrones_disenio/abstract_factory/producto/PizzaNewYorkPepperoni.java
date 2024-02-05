package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto{

  public PizzaNewYorkPepperoni() {
    super();
    nombre = "Pizza pepperoni New York";
    masa = "Masa delgada a la piedra";
    salsa = "Salsa de tomate";
    ingredientes.add("Queso mozzarella");
    ingredientes.add("Extra pepperoni");
    ingredientes.add("Aceitunas");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 40 min. a 90°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en triangulos.");
  }
  
}
