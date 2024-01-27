package org.poo.repositorio.interfaces;

import java.util.List;
import org.poo.repositorio.modelo.Cliente;

public interface OrdenableRepositorio {
  List<Cliente> listar(String campo, Direccion dir);
}
