package org.patrones_disenio.abstract_factory.producto;

import org.patrones_disenio.abstract_factory.abstracto.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto{

  public PizzaNewYorkVegetariana() {
    super();
    nombre = "Pizza vegetariana New York";
    masa = "Masa integral vegana";
    salsa = "Salsa de tomate";
    ingredientes.add("Queso vegano");
    ingredientes.add("Tomate");
    ingredientes.add("Aceitunas");
    ingredientes.add("Espinacas");
    ingredientes.add("Berenjenas");
  }

  @Override
  public void cocinar() {
    System.out.println("Cocinando por 25 min. a 150°C");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando la pizza en rebanadas cuadradas.");
  }
  
}
