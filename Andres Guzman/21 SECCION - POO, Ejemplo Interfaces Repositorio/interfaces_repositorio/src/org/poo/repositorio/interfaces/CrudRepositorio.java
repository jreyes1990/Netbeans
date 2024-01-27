package org.poo.repositorio.interfaces;

import java.util.List;
import org.poo.repositorio.modelo.Cliente;

public interface CrudRepositorio {
  List<Cliente> listar();
  Cliente porId(Integer id);    // Para obtener el cliente por ID o el detalle
  void crear(Cliente cliente);  // Crea un cliente en nuestro repositorio
  void editar(Cliente cliente); // Edita un cliente en nuestro repositorio
  void eliminar(Integer id);    // Elimina un cliente en nuestro repositorio
}
