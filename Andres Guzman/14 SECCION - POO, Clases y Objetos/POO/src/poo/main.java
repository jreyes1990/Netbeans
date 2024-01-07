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
    
    System.out.println(auto.detalle());
    System.out.println();
    System.out.println(mazda.detalle());
  }  
}
