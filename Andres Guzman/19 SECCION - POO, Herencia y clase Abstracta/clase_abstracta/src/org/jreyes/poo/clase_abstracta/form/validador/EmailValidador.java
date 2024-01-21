package org.jreyes.poo.clase_abstracta.form.validador;
/* EMAIL_REGEX
   ^  : Valida desde el comienzo de la linea
   () : Grupo de caracteres
   .  : Cualquier caracter
   +  : Se puede repetir N cantidad de veces

  Explicación de la expresión regular ( ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$ ):

  ^ : Indica el inicio de la cadena.
  [a-zA-Z0-9._%+-]+ : Coincide con uno o más caracteres alfanuméricos, puntos, guiones bajos, porcentajes y signos más y menos.
  @ : Coincide con el símbolo de arroba.
  [a-zA-Z0-9.-]+ : Coincide con uno o más caracteres alfanuméricos, puntos y guiones.
  \. : Coincide con un punto literal.
  [a-zA-Z]{2,} : Coincide con dos o más caracteres alfabéticos (dominio de nivel superior).
  $ : Indica el final de la cadena.
*/
public class EmailValidador extends Validador {
  protected String mensaje = "El formato del email es invalido";
  private final static String EMAIL_REGEX = "^(.+)@(.+)$";

  @Override
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  @Override
  public String getMensaje() {
    return mensaje;
  }

  @Override
  public boolean esValido(String valor) {
    return valor.matches(EMAIL_REGEX);
  }
  
}
