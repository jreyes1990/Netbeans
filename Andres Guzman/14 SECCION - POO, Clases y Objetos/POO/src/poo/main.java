package poo;

import java.util.Arrays;

public class main {

  public static void main(String[] args) {
    Persona conductorAuto = new Persona("Luci", "Martinez");
    Automovil auto = new Automovil("Subaru", "Impreza");
    auto.setConductor(conductorAuto);
    Rueda[] ruedasAuto = new Rueda[10];
    for (int i = 0; i < ruedasAuto.length; i++) {
      auto.addRueda(new Rueda("Yokohama", 16, 7.5));
    }
    
    Persona conductorMazda = new Persona("Pato", "Rodriguez");
    Rueda[] ruedasMazda = new Rueda[5];
    for (int i = 0; i < ruedasMazda.length; i++) {
      ruedasMazda[i] = new Rueda("Michelin", 18, 10.5);
    }
    Automovil mazda = new Automovil("Mazda", "BT-50", Automovil.COLOR_ROJO, new Motor(3.0, TipoMotor.DIESEL));
    mazda.setEstanque(new Estanque(45));
    mazda.setTipo(TIpoAutomovil.PICKUP);
    mazda.setConductor(conductorMazda);
    mazda.setRuedas(ruedasMazda);
    
    Persona conductorNissan = new Persona("Bea", "Gonzalez");
    Rueda[] ruedasNissan = new Rueda[5];
    for (int i = 0; i < ruedasNissan.length; i++) {
      ruedasNissan[i] = new Rueda("Pirelli", 20, 11.5);
    }
    Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50), conductorNissan, ruedasNissan);
    nissan.setTipo(TIpoAutomovil.PICKUP);
    
    Persona conductorNissan2 = new Persona("Lalo", "Mena");
    Rueda[] ruedasNissan2 = new Rueda[5];
    for (int i = 0; i < ruedasNissan2.length; i++) {
      ruedasNissan2[i] = new Rueda("Pirelli", 20, 11.5);
    }
    Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), conductorNissan2, ruedasNissan2);
    nissan2.setTipo(TIpoAutomovil.PICKUP);
    Automovil auto2 = new Automovil();
    
    auto.setColor(Automovil.COLOR_BLANCO);
    auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
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
    /*
    System.out.println();
    Automovil[] autos = new Automovil[4];
    autos[0] = auto;
    autos[1] = mazda;
    autos[2] = nissan;
    autos[3] = nissan2;
    
    Arrays.sort(autos);
    for (int i = 0; i < autos.length; i++) {
      System.out.println(autos[i]);
    }
    */
  }  
}
