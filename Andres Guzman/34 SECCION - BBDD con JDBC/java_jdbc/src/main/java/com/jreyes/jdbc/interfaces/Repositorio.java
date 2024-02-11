package com.jreyes.jdbc.interfaces;

import java.util.List;

public interface Repositorio<T> {
  public List<T> listar();
  public T porId(Long id);
  public void guardar(T t);
  public void eliminar(Long id);
}
