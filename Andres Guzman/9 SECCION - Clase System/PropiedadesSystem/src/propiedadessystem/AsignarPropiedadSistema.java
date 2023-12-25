package propiedadessystem;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadSistema {

  public static void main(String[] args) {
    try {
      FileInputStream archivo = new FileInputStream("src/config.properties"); 
      Properties p = new Properties(System.getProperties());
      p.load(archivo);
      p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
      
      System.setProperties(p);
      Properties ps = System.getProperties();
      System.out.println("ps.getProperties(...) = "+ps.getProperty("mi.propiedad.personalizada"));
      System.out.println(ps.getProperty("config.puerto.servidor"));
      System.out.println(ps.getProperty("config.autor.nombre"));
      System.out.println(ps.getProperty("config.autor.email"));
      ps.list(System.out);
    } catch (Exception e) {
      System.out.println("No existe el archivo "+e);
    }
  }  
}
