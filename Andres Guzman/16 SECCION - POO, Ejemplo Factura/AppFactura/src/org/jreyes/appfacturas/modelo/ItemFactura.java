package org.jreyes.appfacturas.modelo;

public class ItemFactura {
  private int cantidad;
  // Asociacion de modelos
  private Producto producto;

  // Contructor
  public ItemFactura(int cantidad, Producto producto) {
    this.cantidad = cantidad;
    this.producto = producto;
  }
  
  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }
  
  public float calcularImporte(){
    return this.cantidad*this.producto.getPrecio();
  }
}
