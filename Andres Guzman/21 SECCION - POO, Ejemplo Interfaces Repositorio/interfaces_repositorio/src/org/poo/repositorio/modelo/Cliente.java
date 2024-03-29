package org.poo.repositorio.modelo;

import java.util.Objects;

public class Cliente {
  private Integer id;
  private String nombre;
  private String apellido;
  private static int ultimoId;

  public Cliente() {
    this.id = ++ultimoId;
  }

  public Cliente(String nombre, String apellido) {
    this();
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    sb.append("id=").append(id);
    sb.append(", nombre=").append(nombre);
    sb.append(", apellido=").append(apellido);

    return sb.toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    
    final Cliente cliente = (Cliente) obj;
    return Objects.equals(this.id, cliente.id);
  }
  
}
