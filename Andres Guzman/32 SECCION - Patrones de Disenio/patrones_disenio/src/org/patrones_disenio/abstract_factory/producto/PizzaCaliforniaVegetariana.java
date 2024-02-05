package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

  public PizzaCaliforniaVegetariana() {
    super();
    nombre = "Pizza vegetariana California";
    masa = "Masa delgada light";
    salsa = "Salsa BBQ light";
    ingredientes.add("Queso mozzarella");
    ingredientes.add("Aceitunas");
    ingredientes.add("Espinacas");
    ingredientes.add("Berenjenas");
    ingredientes.add("Cebolla");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 20 min. a 180°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en rebanadas rectangulares.");
  }
  
}
