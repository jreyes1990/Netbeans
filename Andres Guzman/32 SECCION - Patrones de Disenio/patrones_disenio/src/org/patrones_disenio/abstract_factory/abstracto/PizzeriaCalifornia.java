package org.patrones_disenio.abstract_factory.abstracto;

import org.patrones_disenio.abstract_factory.producto.PizzaCaliforniaPepperoni;
import org.patrones_disenio.abstract_factory.producto.PizzaCaliforniaQueso;
import org.patrones_disenio.abstract_factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCalifornia extends PizzeriaZona {

  @Override
  PizzaProducto crearPizza(String tipo) {
    PizzaProducto producto = null;
    
    switch (tipo) {
      case "queso":
        producto = new PizzaCaliforniaQueso();
        break;
      case "pepperoni":
        producto = new PizzaCaliforniaPepperoni();
        break;
      case "vegetariana":
        producto = new PizzaCaliforniaVegetariana();
        break;
      default:
        throw new AssertionError();
    }
    
    return producto;
  }
  
}
