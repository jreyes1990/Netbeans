package org.jreyes.poo.clase_abstracta.form;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;
import org.jreyes.poo.clase_abstracta.form.elementos.*;
import org.jreyes.poo.clase_abstracta.form.elementos.select.Opcion;
import org.jreyes.poo.clase_abstracta.form.validador.*;

public class EjemploForm {

  public static void main(String[] args) {
    InputForm username = new InputForm("username");
    username.addValidador(new RequeridoValidador());
    InputForm password = new InputForm("clave", "password");
    password.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6, 12));
    InputForm email = new InputForm("email", "email");
    email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
    InputForm edad = new InputForm("edad", "number");
    edad.addValidador(new NumeroValidador());
    
    TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
    
    SelectForm lenguaje = new SelectForm("lenguaje");
    lenguaje.addValidador(new NoNuloValidador());
    
    Opcion java = new Opcion("1", "Java");
    
    lenguaje.addOpcion(java);
    lenguaje.addOpcion(new Opcion("2", "Python"));
    lenguaje.addOpcion(new Opcion("3", "JavaSript"));
    lenguaje.addOpcion(new Opcion("4", "TypeScript"));
    lenguaje.addOpcion(new Opcion("5", "PHP"));
    lenguaje.addOpcion(new Opcion("6", "Ruby On Rails").setSelected());
    
    ElementoForm saludar = new ElementoForm("saludo") {
      @Override
      public String dibujarHtml() {
        return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
      }
    };
    
    saludar.setValor("Hola que tal, este campo esta deshabilitado");
    username.setValor("jreyes");
    password.setValor("jreyes1990");
    email.setValor("jreyes@madretierra.com.gt");
    edad.setValor("33");
    experiencia.setValor("... mas de 3 meses de experiencia");
    
    // java.setSelected(true);
    
    /*
    List<ElementoForm> elementos = new ArrayList<>();
    elementos.add(username);
    elementos.add(password);
    elementos.add(email);
    elementos.add(edad);
    elementos.add(experiencia);
    elementos.add(lenguaje);
    
    for (ElementoForm e : elementos) {
      System.out.println(e.dibujarHtml());
    }
    */
    
    List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje, saludar);
    
    elementos.forEach(e -> {
      System.out.println(e.dibujarHtml());
    });
    
    elementos.forEach(e -> {
      if (!e.esValido()) {
        e.getErrores().forEach(err -> System.out.println(e.getNombre()+" -> ("+e.getValor()+") , "+err));
      }
    });
  }  
}
