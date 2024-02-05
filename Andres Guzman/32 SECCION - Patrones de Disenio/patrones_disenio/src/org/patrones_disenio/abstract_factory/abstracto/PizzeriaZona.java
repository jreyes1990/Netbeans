package org.patrones_disenio.abstract_factory.abstracto;

abstract public class PizzeriaZona {
  public PizzaProducto ordenarPizza(String tipo){
    String separador = "----------";
    PizzaProducto pizza = crearPizza(tipo);
    System.out.println(separador+" fabricando la "+pizza.getNombre()+" "+separador);
    pizza.preparar();
    pizza.cocinar();
    pizza.cortar();
    pizza.empaquetar();
    
    return pizza;
  }
  
  abstract PizzaProducto crearPizza(String tipo);
}
