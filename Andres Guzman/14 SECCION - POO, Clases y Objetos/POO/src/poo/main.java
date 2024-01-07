package poo;

public class main {

  public static void main(String[] args) {
    Automovil auto = new Automovil();
    Automovil mazda = new Automovil();
    
    auto.setFabricante("Subaru");
    auto.setModelo("Impreza");
    auto.setColor("Blanco");
    auto.setCilindrada(2.0);
    
    mazda.setFabricante("Mazda");
    mazda.setModelo("BT-50");
    mazda.setColor("Rojo");
    mazda.setCilindrada(3.0);
    
    System.out.println(auto.verDetalle());
    System.out.println(auto.acelerar(3000));
    System.out.println(auto.frenar());
    System.out.println("Kilometros por litro "+auto.calcularConsumo(300, 0.75f));
    System.out.println();
    System.out.println(mazda.verDetalle());
    System.out.println(mazda.acelerarFrenar(8000));
    System.out.println("Kilometros por litro "+mazda.calcularConsumo(400, 55));
  }  
}
