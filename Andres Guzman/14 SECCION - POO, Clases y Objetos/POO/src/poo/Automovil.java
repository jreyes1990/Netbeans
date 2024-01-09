package poo;

public class Automovil {
  private int id;
  private String fabricante;
  private String modelo;
  //private String color;
  private Color color = Color.GRIS;
  private double cilindrada;
  private int capacidadEstanque = 40;
  
  // Declarando variable de tipo Enum
  private TIpoAutomovil tipo;
  
  // Variables estaticas
  private static int capacidadEstanqueEstatico = 60;
  private static int ultimoId;
  private static Color colorPatente = Color.NARANJO;
  
  // Variables Constantes estaticas
  public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
  public static final int VELOCIDAD_MAX_CIUDAD = 60;
  public static final Color COLOR_ROJO = Color.ROJO;
  public static final Color COLOR_AMARILLO = Color.AMARILLO;
  public static final Color COLOR_AZUL = Color.AZUL;
  public static final Color COLOR_BLANCO = Color.BLANCO;
  public static final Color COLOR_GRIS = Color.GRIS;

  // Generando contructores de Automovil
  public Automovil() {
    this.id = ++ultimoId;
  }

  public Automovil(String fabricante, String modelo) {
    this(); // Invocamos el contructor vacio
    this.fabricante = fabricante;
    this.modelo = modelo;
  }

  public Automovil(String fabricante, String modelo, Color color) {
    this(fabricante, modelo); // Invocamos el contructor y sus parametros
    this.color = color;
  }

  public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
    this(fabricante, modelo, color); // Invocamos el contructor y sus parametros
    this.cilindrada = cilindrada;
  }
  
  public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
    this(fabricante, modelo, color, cilindrada); // Invocamos el contructor y sus parametros
    this.capacidadEstanque = capacidadEstanque;
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

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
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

  public static Color getColorPatente() {
    return colorPatente;
  }

  public static void setColorPatente(Color colorPatente) {
    Automovil.colorPatente = colorPatente;
  }

  public static int getCapacidadEstanqueEstatico() {
    return capacidadEstanqueEstatico;
  }

  public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
    Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TIpoAutomovil getTipo() {
    return tipo;
  }

  public void setTipo(TIpoAutomovil tipo) {
    this.tipo = tipo;
  }
  
  
  public String verDetalle(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("auto.id = ").append(this.id);
    sb.append("\nauto.fabricante = ").append(this.fabricante);
    sb.append("\nauto.modelo = ").append(this.modelo);
    sb.append("\nauto.tipo = ").append(this.getTipo().getDescripcion());
    sb.append("\nauto.color = ").append(this.color);
    sb.append("\nauto.colorPatente = ").append(colorPatente);
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
  
  public static float calcularConsumoStatic(int km, float porcentajeBencina){
    return km/(Automovil.capacidadEstanqueEstatico*porcentajeBencina);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Automovil)) {
      return false;
    }
    Automovil a = (Automovil) obj;
    return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo())); 
  }

  @Override
  public String toString() {
    return "Automovil{id="+this.id+", fabricante='"+this.fabricante+"', modelo='"+this.modelo+"', color='"+this.color+"', cilindrada="+this.cilindrada+", capacidadEstanque="+this.capacidadEstanque+", colorPatente='"+colorPatente+"'}";
  }
  
  
}
