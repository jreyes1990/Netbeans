package poo;

public class Automovil {
  private String fabricante;
  private String modelo;
  private String color;
  private double cilindrada;
  private int capacidadEstanque = 40;

  // Generando el contructor de Automovil
  public Automovil() {
  }

  public Automovil(String fabricante, String modelo) {
    this.fabricante = fabricante;
    this.modelo = modelo;
  }
  
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

  // Generando los getters y setters de los atributos private
  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getCilindrada() {
    return cilindrada;
  }

  public void setCilindrada(double cilindrada) {
    this.cilindrada = cilindrada;
  }

  public int getCapacidadEstanque() {
    return capacidadEstanque;
  }

  public void setCapacidadEstanque(int capacidadEstanque) {
    this.capacidadEstanque = capacidadEstanque;
  }
}
