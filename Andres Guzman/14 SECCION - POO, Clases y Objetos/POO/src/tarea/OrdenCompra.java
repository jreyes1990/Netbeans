package tarea;

import java.util.Date;

public class OrdenCompra {
  private static Integer contadorId = 1;
  private Integer identificador;
  private String descripcion;
  private Date fecha;
  private Cliente cliente;
  private Producto[] productos = new Producto[4];

  // Constructor que inicializa solo la descripción
  public OrdenCompra(String descripcion) {
    this.identificador = contadorId++;
    this.descripcion = descripcion;
  }

  // Métodos getter
  public Integer getIdentificador() {
    return identificador;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Date getFecha() {
    return fecha;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Producto[] getProductos() {
    return productos;
  }

  // Métodos setter
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  // Método para agregar producto
  public void addProducto(Producto producto) {
    for (int i = 0; i < productos.length; i++) {
      if (productos[i] == null) {
        productos[i] = producto;
        break;
      }
    }
  }

  // Método para calcular el gran total
  public int calcularGranTotal() {
    int granTotal = 0;
    for (Producto producto : productos) {
      if (producto != null) {
        granTotal += producto.getPrecio();
      }
    }
    return granTotal;
  }
}
