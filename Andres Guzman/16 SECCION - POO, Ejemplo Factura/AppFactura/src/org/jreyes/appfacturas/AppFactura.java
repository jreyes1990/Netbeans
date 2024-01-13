package org.jreyes.appfacturas;

import java.util.Locale;
import java.util.Scanner;
import org.jreyes.appfacturas.modelo.*;

public class AppFactura {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNif("5555-5");
    cliente.setNombre("Jolberth");
    
    Scanner s = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Ingrese una descripcion de la factura: ");
    Factura factura = new Factura(s.nextLine(), cliente);
    
    Producto producto;
    System.out.println();
    
    for (int i = 0; i < 5; i++) {
      producto = new Producto();
      System.out.print("Ingrese producto No. "+producto.getCodigo()+": ");
      producto.setNombre(s.next());
      
      System.out.print("Ingrese el precio: ");
      producto.setPrecio(s.nextFloat());
      
      System.out.print("Ingrese la cantidad: ");
      
      factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
      System.out.println();
    }
    System.out.println(factura.generarDetalle());
  }  
}
