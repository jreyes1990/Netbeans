package org.poo.repositorio.implementos;

import java.util.ArrayList;
import java.util.List;
import org.poo.repositorio.interfaces.CrudRepositorio;
import org.poo.repositorio.interfaces.Direccion;
import org.poo.repositorio.interfaces.OrdenableRepositorio;
import org.poo.repositorio.interfaces.PaginableRepositorio;
import org.poo.repositorio.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {
  private List<Cliente> dataSource;

  public ClienteListRepositorio() {
    this.dataSource = new ArrayList<>();
  }

  @Override
  public List<Cliente> listar() {
    return null;
  }

  @Override
  public Cliente porId(Integer id) {
    Cliente resultado = null;
    
    for (Cliente cli : dataSource) {
      if (cli.getId().equals(id)) {
        resultado = cli;
        break;
      }
    }
    
    return resultado;
  }

  @Override
  public void crear(Cliente cliente) {
    this.dataSource.add(cliente);
  }

  @Override
  public void editar(Cliente cliente) {
    Cliente c = this.porId(cliente.getId());
    c.setNombre(cliente.getNombre());
    c.setApellido(cliente.getApellido());
  }

  @Override
  public void eliminar(Integer id) {
    Cliente c = this.porId(id);
    this.dataSource.remove(c);
  }

  @Override
  public List<Cliente> listar(String campo, Direccion dir) {
    return null;
  }

  @Override
  public List<Cliente> listar(int desde, int hasta) {
    return null;
  }
  
}
