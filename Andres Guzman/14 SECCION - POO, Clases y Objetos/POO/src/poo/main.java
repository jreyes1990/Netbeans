package poo;

public class main {

  public static void main(String[] args) {
    Automovil auto = new Automovil("Subaru", "Impreza");
    Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
    Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
    Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);
    Automovil auto2 = new Automovil();
    
    auto.setColor("Blanco");
    auto.setCilindrada(2.0);
    Automovil.setColorPatente("amarillo");
    
    
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
    System.out.println(Automovil.calcularConsumoStatic(900, 0.75f));
    System.out.println(nissan2);
  }  
}
