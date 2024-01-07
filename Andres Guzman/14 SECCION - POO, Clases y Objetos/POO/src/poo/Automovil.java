package poo;

public class Automovil {
  String fabricante;
  String modelo;
  String color;
  double cilindrada;
  int capacidadEstanque = 40;
  
  public String verDetalle(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("auto.fabricante = ").append(this.fabricante);
    sb.append("\nauto.modelo = ").append(this.modelo);
    sb.append("\nauto.color = ").append(this.color);
    sb.append("\nauto.cilindrada = ").append(this.cilindrada);
    
    return sb.toString();
  }
  
  public String acelerar(int rpm){
    return "el auto "+this.fabricante+" acelerando a "+rpm+"rpm";
  }
  
  public String frenar(){
    return this.fabricante+" "+this.modelo+" frenando!.";
  }
  
  public String acelerarFrenar(int rpm){
    String acelerar = this.acelerar(rpm);
    String frenar = this.frenar();
    
    return acelerar+"\n"+frenar;
  }
  
  public float calcularConsumo(int km, float porcentajeBencina){
    return km/(capacidadEstanque*porcentajeBencina);
  }
  
  public float calcularConsumo(int km, int porcentajeBencina){
    return km/(capacidadEstanque*(porcentajeBencina/100f));
  }
}
