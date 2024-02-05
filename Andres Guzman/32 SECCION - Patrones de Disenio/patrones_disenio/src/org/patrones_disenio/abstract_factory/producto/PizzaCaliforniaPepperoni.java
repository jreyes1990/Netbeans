package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

  public PizzaCaliforniaPepperoni() {
    super();
    nombre = "Pizza pepperoni California";
    masa = "Masa a la piedra gruesa";
    salsa = "Pepperoni";
    ingredientes.add("Extra queso mozzarella");
    ingredientes.add("Aceitunas");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 50 min. a 55°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en pequnios rectangulos.");
  }
  
}
