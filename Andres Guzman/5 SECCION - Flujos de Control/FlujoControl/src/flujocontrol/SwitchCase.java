package flujocontrol;

public class SwitchCase {

  public static void main(String[] args) {
    int num = 5;
    
    switch (num) {
      case 0:
        System.out.println("el numero es "+num);
        break;
      case 1:
        System.out.println("el numero es "+num);
        break;
      case 2:
        System.out.println("el numero es "+num);
        break;
      case 3:
        System.out.println("el numero es "+num);
        break;
      default:
        System.out.println("el numero "+num+" no es definido dentro de los parametros, verifique");;
    }
    
    String nombre = "admin";
    
    switch (nombre) {
      case "admin":
        System.out.println("Hola, bienvenido "+nombre);
        break;
      case "andres":
        System.out.println("Hola, bienvenido "+nombre);
        break;
      case "pepe":
        System.out.println("Hola, bienvenido "+nombre);
        break;
      default:
        System.out.println("Usuario desconocido");;
    }
  }  
}
