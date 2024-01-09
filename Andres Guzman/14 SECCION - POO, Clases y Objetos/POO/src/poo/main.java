package poo;

public class main {

  public static void main(String[] args) {
    Automovil auto = new Automovil("Subaru", "Impreza");
    Automovil mazda = new Automovil("Mazda", "BT-50", Automovil.COLOR_ROJO, 3.0);
    mazda.setTipo(TIpoAutomovil.PICKUP);
    Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
    nissan.setTipo(TIpoAutomovil.PICKUP);
    Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
    nissan2.setTipo(TIpoAutomovil.PICKUP);
    Automovil auto2 = new Automovil();
    
    auto.setColor(Automovil.COLOR_BLANCO);
    auto.setCilindrada(2.0);
    auto.setTipo(TIpoAutomovil.HATCHBACK);
    Automovil.setColorPatente(Automovil.COLOR_AMARILLO);
    
    
    System.out.println(auto.verDetalle());
    /*
    System.out.println(auto.acelerar(3000));
    System.out.println(auto.frenar());
    System.out.println("Kilometros por litro "+auto.calcularConsumo(300, 0.75f));
    */
    System.out.println();
    System.out.println(mazda.verDetalle());
    /*
    System.out.println(mazda.acelerarFrenar(8000));
    System.out.println("Kilometros por litro "+mazda.calcularConsumo(400, 55));
    */
    System.out.println();
    System.out.println(nissan.verDetalle());
    /*
    System.out.println("Kilometros por litro "+nissan.calcularConsumo(300, 60));
    */
    System.out.println();
    System.out.println(nissan2.verDetalle());
    /*
    System.out.println("Son iguales? "+(nissan == nissan2));
    System.out.println("Son iguales con equals? "+(nissan.equals(nissan2)));
    System.out.println("Son iguales (auto2 y nissan)? "+(auto2.equals(nissan2)));
    */
    System.out.println();
    System.out.println("Velocidad maxima en carretera: "+Automovil.VELOCIDAD_MAX_CARRETERA);
    System.out.println("Velocidad maxima en ciudad: "+Automovil.VELOCIDAD_MAX_CIUDAD);
    
    System.out.println();
    System.out.println(Automovil.calcularConsumoStatic(900, 0.75f));
    System.out.println(nissan2);
    
    System.out.println();
    TIpoAutomovil tipoSubaru = auto.getTipo();
    System.out.println("tipo subaru: "+tipoSubaru.getNombre());
    System.out.println("tipo desc. subaru: "+tipoSubaru.getDescripcion());
    
    switch (tipoSubaru) {
      case CONVERTIBLE:
        System.out.println("El automovil es deportivo y descapotable de dos puertas.");
        break;
      case COUPE:
        System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo.");
        break;
      case FURGON:
        System.out.println("Es un automovil utilitario de transporte, de empresas.");
        break;
      case HATCHBACK:
        System.out.println("Es un automovil mediano compacto, aspecto deportivo.");
        break;
      case PICKUP:
        System.out.println("Es un automovil de doble cabina o camioneta.");
        break;
      case SEDAN:
        System.out.println("Es un automovil mediano.");
        break;
      case STATION_WAGON:
        System.out.println("Es un automovil mas grande, con maleta grande.");
        break;
      default:
        throw new AssertionError();
    }
    
    System.out.println();
    
    TIpoAutomovil[] tipos = TIpoAutomovil.values();
    for (TIpoAutomovil ta : tipos) {
      System.out.print(ta+" => "+ta.name()+", "+ta.getNombre()+", "+ta.getDescripcion()+", "+ta.getNumeroPuerta());
      System.out.println();
    }
  }  
}
