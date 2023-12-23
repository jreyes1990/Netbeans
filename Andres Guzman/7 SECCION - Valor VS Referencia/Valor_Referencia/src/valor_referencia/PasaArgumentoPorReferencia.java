package valor_referencia;

class Persona{
  private String nombre;
  
  public void modificarNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String leerNombre(){
    return this.nombre;
  }
}

public class PasaArgumentoPorReferencia {

  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.modificarNombre("Andres");
    
    System.out.println("Iniciamos el metodo main");
    System.out.println("persona.nombre = "+persona.leerNombre());
    test(persona);
    System.out.println("Finaliza el metodo main");
  }  
  
  public static void test(Persona persona){
    System.out.println("Iniciamos el metodo test");
    persona.modificarNombre("Pepe");
    System.out.println("persona.nombre = "+persona.leerNombre());
    System.out.println("Finaliza el metodo test");
  }
}
