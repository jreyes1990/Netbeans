package poo;

public class main {

  public static void main(String[] args) {
    Automovil auto = new Automovil();
    Automovil mazda = new Automovil();
    
    auto.fabricante = "Subaru";
    auto.modelo = "Impreza";
    auto.color = "Blanco";
    auto.cilindrada = 2.0;
    
    mazda.fabricante = "Mazda";
    mazda.modelo = "BT-50";
    mazda.color = "Rojo";
    mazda.cilindrada = 3.0;
    
    System.out.println(auto.verDetalle());
    System.out.println(auto.acelerar(3000));
    System.out.println(auto.frenar());
    System.out.println();
    System.out.println(mazda.verDetalle());
    System.out.println(mazda.acelerarFrenar(8000));
  }  
}
