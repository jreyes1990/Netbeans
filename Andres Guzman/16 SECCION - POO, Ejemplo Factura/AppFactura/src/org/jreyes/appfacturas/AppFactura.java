package org.jreyes.appfacturas;

import java.util.Locale;
import java.util.Scanner;
import org.jreyes.appfacturas.modelo.Cliente;
import org.jreyes.appfacturas.modelo.Factura;
import org.jreyes.appfacturas.modelo.ItemFactura;
import org.jreyes.appfacturas.modelo.Producto;

public class AppFactura {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNif("5555-5");
    cliente.setNombre("Jolberth");
    
    Scanner s = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Ingrese una descripcion de la factura: ");
    String desc = s.nextLine();
    Factura factura = new Factura(desc, cliente);
    
    Producto producto;
    String nombre;
    float precio;
    int cantidad;
    
    System.out.println();
    
    for (int i = 0; i < 5; i++) {
      producto = new Producto();
      System.out.print("Ingrese producto No. "+producto.getCodigo()+": ");
      nombre = s.next();
      producto.setNombre(nombre);
      
      System.out.print("Ingrese el precio: ");
      precio = s.nextFloat();
      producto.setPrecio(precio);
      
      System.out.print("Ingrese la cantidad: ");
      cantidad = s.nextInt();
      
      ItemFactura item = new ItemFactura(cantidad, producto);
      factura.addItemFactura(item);
      System.out.println();
    }
    System.out.println(factura.generarDetalle());
  }  
}
