package org.patrones_disenio.singleton;

public class ConexionBD {
  private static ConexionBD instancia;

  private ConexionBD() {
    System.out.println("Conectandose algun motor de base de datos");
  }

  public static ConexionBD getInstancia() {
    if (instancia == null) {
      instancia = new ConexionBD();
    }
    
    return instancia;
  }  

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ConexionBD{ ");
    sb.append("Activo ");
    sb.append('}');
    return sb.toString();
  }
  
  
}
