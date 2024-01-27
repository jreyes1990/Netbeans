package org.poo.repositorio.interfaces;

import java.util.List;
import org.poo.repositorio.modelo.Cliente;

public interface PaginableRepositorio {
  List<Cliente> listar(int desde, int hasta);
}
