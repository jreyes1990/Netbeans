package org.poo.repositorio;

import java.util.List;
import org.poo.repositorio.implementos.ClienteListRepositorio;
import org.poo.repositorio.interfaces.CrudRepositorio;
import org.poo.repositorio.interfaces.Direccion;
import org.poo.repositorio.interfaces.OrdenableRepositorio;
import org.poo.repositorio.interfaces.PaginableRepositorio;
import org.poo.repositorio.modelo.Cliente;

public class MainRepositorio {

  public static void main(String[] args) {
    CrudRepositorio repo = new ClienteListRepositorio();
    repo.crear(new Cliente("Jano", "Perez"));
    repo.crear(new Cliente("Bea", "Gonzalez"));
    repo.crear(new Cliente("Luci", "Martinez"));
    repo.crear(new Cliente("Andres", "Guzman"));
    
    System.out.println("===== CLIENTES =====");
    List<Cliente> clientes = repo.listar();
    clientes.forEach(System.out::println);
    
    System.out.println("\n===== PAGINABLE =====");
    List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 3);
    paginable.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR ID - ASCENDENTE =====");
    List<Cliente> clientesOrdenIdAsc = ((OrdenableRepositorio)repo).listar("id", Direccion.ASC);
    clientesOrdenIdAsc.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR ID - DESCENDENTE =====");
    List<Cliente> clientesOrdenIdDesc = ((OrdenableRepositorio)repo).listar("id", Direccion.DESC);
    clientesOrdenIdDesc.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR NOMBRE - ASCENDENTE =====");
    List<Cliente> clientesOrdenNombreAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
    clientesOrdenNombreAsc.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR NOMBRE - DESCENDENTE =====");
    List<Cliente> clientesOrdenNombreDesc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.DESC);
    clientesOrdenNombreDesc.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR APELLIDO - ASCENDENTE =====");
    List<Cliente> clientesOrdenApellidoAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);
    clientesOrdenApellidoAsc.forEach(System.out::println);
    
    System.out.println("\n===== ORDENABLE POR APELLIDO - DESCENDENTE =====");
    List<Cliente> clientesOrdenApellidoDesc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);
    clientesOrdenApellidoDesc.forEach(System.out::println);
    
    System.out.println("\n===== EDITAR =====");
    Cliente actualizar = new Cliente("Bean","Mena");
    actualizar.setId(2);
    repo.editar(actualizar);
    ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC).forEach(System.out::println);
    
    System.out.println("\n===== ELIMINAR =====");
    repo.eliminar(2);
    repo.listar().forEach(System.out::println);
  }  
}
