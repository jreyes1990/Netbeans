package flujocontrol;

public class FlujoControl {

  public static void main(String[] args) {
    float promedio = 5.2f;
    String mensaje = "";
    
    if (promedio >= 6.5) {
      mensaje = "Felicitaciones, excelente promedio";
    } else if (promedio >= 6.0) {
      mensaje = "Muy buen promedio";
    } else if (promedio >= 5.5) {
      mensaje = "Buen promedio";
    } else if (promedio >= 5.0) {
      mensaje = "Regular, necesitas esforzarte un poco mas!";
    } else if (promedio >= 4.0) {
      mensaje = "Insuficiente, necesitas estudiar mas";
    } else {
      mensaje = "Necesitas esforzarte un poco mas!";
    }
    
    System.out.println(mensaje);
  }  
}
