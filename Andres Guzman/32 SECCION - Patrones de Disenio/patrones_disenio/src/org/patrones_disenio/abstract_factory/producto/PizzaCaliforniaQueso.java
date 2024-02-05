package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto{

  public PizzaCaliforniaQueso() {
    super();
    nombre = "Pizza queso California";
    masa = "Masa a la piedra delgada";
    salsa = "Salsa de tomate rucula";
    ingredientes.add("Extra queso mozzarella");
    ingredientes.add("Cebolla");
    ingredientes.add("Queso azul");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 35 min. a 100°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en pequenios triangulos.");
  }
  
}
