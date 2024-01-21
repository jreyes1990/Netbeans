package org.jreyes.poo.clase_abstracta.form;

import java.util.HashSet;
import java.util.Set;
import org.jreyes.poo.clase_abstracta.form.elementos.InputForm;
import org.jreyes.poo.clase_abstracta.form.elementos.SelectForm;
import org.jreyes.poo.clase_abstracta.form.elementos.TextAreaForm;
import org.jreyes.poo.clase_abstracta.form.elementos.select.Opcion;

public class EjemploForm {

  public static void main(String[] args) {
    InputForm username = new InputForm("username");
    InputForm password = new InputForm("clave", "password");
    InputForm email = new InputForm("email", "email");
    InputForm edad = new InputForm("edad", "number");
    
    TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
    
    SelectForm lenguaje = new SelectForm("lenguaje");
    
    Opcion java = new Opcion("1", "Java");
    
    lenguaje.addOpcion(java);
    lenguaje.addOpcion(new Opcion("2", "Python"));
    lenguaje.addOpcion(new Opcion("3", "JavaSript"));
    lenguaje.addOpcion(new Opcion("4", "TypeScript"));
    lenguaje.addOpcion(new Opcion("5", "PHP"));
    lenguaje.addOpcion(new Opcion("6", "Ruby On Rails"));
    
    username.setValor("jreyes");
    password.setValor("jreyes1990");
    email.setValor("jreyes@madretierra.com.gt");
    edad.setValor("33");
    java.setSelected(true);
  }  
}
