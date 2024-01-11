package tarea;

import java.util.Date;

public class Ordenes {
  /*La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

    Se requiere crear la clase Ordenes con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String, 
    fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.

    En la clase Ordenes, crear constructor que inicialice solo la descripción.

    En la clase Ordenes, crear métodos getter para todos los atributos.

    En la clase Ordenes implementar sólo métodos set para cliente y fecha.

    Respecto a los productos de la clase Ordenes, sólo se pueden agregar usando el método public void addProducto (Producto producto), 
    nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

    La clase Ordenes debe tener un método que devuelva el gran total, sumando los precios de los productos.

    Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus valores en el 
    constructor e implementar sus respectivos métodos getter.

    Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar sus respectivos 
    métodos getter.

    Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

    Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, 
    que no se repitan.

    Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método getter obtenemos el 
    arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en cuenta en la salida 
    el gran total de cada orden, los clientes, todo. */

  public static void main(String[] args) {
    // Crear productos
    Producto producto1 = new Producto("Fabricante1", "Producto1", 100);
    Producto producto2 = new Producto("Fabricante2", "Producto2", 150);
    Producto producto3 = new Producto("Fabricante3", "Producto3", 200);
    Producto producto4 = new Producto("Fabricante4", "Producto4", 120);

    // Crear clientes
    Cliente cliente1 = new Cliente("Cliente1", "Apellido1");
    Cliente cliente2 = new Cliente("Cliente2", "Apellido2");
    Cliente cliente3 = new Cliente("Cliente3", "Apellido3");

    // Crear órdenes de compra
    OrdenCompra orden1 = new OrdenCompra("Orden1");
    OrdenCompra orden2 = new OrdenCompra("Orden2");
    OrdenCompra orden3 = new OrdenCompra("Orden3");

    // Configurar fechas
    orden1.setFecha(new Date());
    orden2.setFecha(new Date());
    orden3.setFecha(new Date());

    // Asignar clientes a las órdenes
    orden1.setCliente(cliente1);
    orden2.setCliente(cliente2);
    orden3.setCliente(cliente3);

    // Agregar productos a las órdenes
    orden1.addProducto(producto1);
    orden1.addProducto(producto2);
    orden1.addProducto(producto3);
    orden1.addProducto(producto4);

    orden2.addProducto(producto2);
    orden2.addProducto(producto3);
    orden2.addProducto(producto4);

    orden3.addProducto(producto1);
    orden3.addProducto(producto3);

    // Imprimir información de las órdenes
    imprimirOrden(orden1);
    imprimirOrden(orden2);
    imprimirOrden(orden3);
  }  
  
  // Método para imprimir información de una orden de compra
  private static void imprimirOrden(OrdenCompra orden) {
    System.out.println("Orden de Compra #" + orden.getIdentificador());
    System.out.println("Descripción: " + orden.getDescripcion());
    System.out.println("Fecha: " + orden.getFecha());
    System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());

    System.out.println("Productos:");
    for (Producto producto : orden.getProductos()) {
      if (producto != null) {
        System.out.println("  - Fabricante: " + producto.getFabricante());
        System.out.println("    Nombre: " + producto.getNombre());
        System.out.println("    Precio: " + producto.getPrecio());
      }
    }

    System.out.println("Gran Total: " + orden.calcularGranTotal());
    System.out.println("------------------------------");
  }
}
