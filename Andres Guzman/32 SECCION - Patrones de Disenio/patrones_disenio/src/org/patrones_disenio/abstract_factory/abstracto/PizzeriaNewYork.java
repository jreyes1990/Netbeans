package org.patrones_disenio.abstract_factory.abstracto;

import org.patrones_disenio.abstract_factory.producto.*;

public class PizzeriaNewYork extends PizzeriaZona {

  @Override
  PizzaProducto crearPizza(String tipo) {
    PizzaProducto producto = null;
    
    switch (tipo) {
      case "vegetariana":
        producto = new PizzaNewYorkVegetariana();
        break;
      case "pepperoni":
        producto = new PizzaNewYorkPepperoni();
        break;
      case "italiana":
        producto = new PizzaNewYorkItaliana();
        break;
      default:
        throw new AssertionError();
    }
    
    return producto;
  }
  
}
