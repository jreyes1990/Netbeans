package org.poo.repositorio.interfaces;

import java.util.List;
import org.poo.repositorio.modelo.Cliente;

public interface OrdenableRepositorio {
  List<Cliente> listar(String campo, Direccion dir);

  public List<Cliente> listar(int i, int i0);
  
  public static int ordenar(String campo, Cliente a, Cliente b) {
    int resultado = 0;

    switch (campo) {
      case "id":
        resultado = a.getId().compareTo(b.getId());
        break;
      case "nombre":
        resultado = a.getNombre().compareTo(b.getNombre());
        break;
      case "apellido":
        resultado = a.getApellido().compareTo(b.getApellido());
        break;
    }

    return resultado;
  }
}
