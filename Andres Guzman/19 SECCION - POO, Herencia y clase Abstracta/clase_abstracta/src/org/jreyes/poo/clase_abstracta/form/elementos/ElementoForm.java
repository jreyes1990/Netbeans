package org.jreyes.poo.clase_abstracta.form.elementos;

import java.util.ArrayList;
import java.util.List;
import org.jreyes.poo.clase_abstracta.form.validador.Validador;

abstract public class ElementoForm {
  protected String valor;
  protected String nombre;
  
  private List<Validador> validadores;
  private List<String> errores;

  public ElementoForm() {
    this.validadores = new ArrayList<>();
    this.errores = new ArrayList<>();
  }

  public ElementoForm(String nombre) {
    this();
    this.nombre = nombre;
  }

  public ElementoForm addValidador(Validador validador){
    this.validadores.add(validador);
    return this;
  }

  public List<String> getErrores() {
    return errores;
  }
  
  public void setValor(String valor) {
    this.valor = valor;
  }
  
  public boolean esValido(){
    for (Validador v : validadores) {
      if (!v.esValido(this.valor)) {
        this.errores.add(v.getMensaje());
      }
    }
    return this.errores.isEmpty();
  }
  
  abstract public String dibujarHtml();
}
