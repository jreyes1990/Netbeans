package org.jreyes.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
  private int folio;
  private String descripcion;
  private Date fecha;
  // Asociacion de modelos
  private Cliente cliente;
  private ItemFactura[] items;
  // Variable para incrementar el indice de la factura
  private int indiceItems;
  // Variable constante estatica
  public static final int MAX_ITEMS = 10;
  // Autoincrementar el folio
  private static int ultimoFolio;

  // Constructor
  public Factura(String descripcion, Cliente cliente) {
    this.descripcion = descripcion;
    this.cliente = cliente;
    this.items = new ItemFactura[MAX_ITEMS];
    this.folio = ++ultimoFolio; // Preincremento, para que comience en 1
    this.fecha = new Date();
  }
  
  public int getFolio() {
    return folio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public ItemFactura[] getItems() {
    return items;
  }
  
  public void addItemFactura(ItemFactura item){
    if (indiceItems < MAX_ITEMS) {
      this.items[indiceItems++] = item;
    }
  }
  
  public float calcularTotal(){
    float total = 0.0f;
    for (ItemFactura item : this.items) {
      if (item == null) {
        continue;
      }
      total += item.calcularImporte();
    }
    return total;
  }
  
  public String generarDetalle(){
    SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
    StringBuilder sb = new StringBuilder("Factura No: ");
    
    sb.append(folio)
      .append("\nCliente: ").append(this.cliente.getNombre())
      .append("\nNIF: ").append(cliente.getNif())
      .append("\nDescripcion: ").append(this.descripcion)
      .append("\n")
      .append("Fecha Emision: ").append(df.format(this.fecha)).append("\n")      
      .append("\n#\tNombre\t$\tCant.\tTotal\n");
    
    
    for (ItemFactura item : items) {
      if (item == null) {
        continue;
      }
      sb.append(item.getProducto().getCodigo()).append("\t")
        .append(item.getProducto().getNombre()).append("\t")
        .append(item.getProducto().getPrecio()).append("\t")
        .append(item.getCantidad()).append("\t")
        .append(item.calcularImporte()).append("\n");
    }
    
    sb.append("\nGran Total: ").append(calcularTotal());
    
    return sb.toString();
  }
}
