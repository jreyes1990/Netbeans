package valor_referencia;

public class PasaPorReferencia {

  public static void main(String[] args) {
    int[] edad = {10, 11, 12};
    
    System.out.println("Iniciamos el metodo main");
    for (int j = 0; j < edad.length; j++) {
      System.out.println("edad[j] = "+edad[j]);
    }
    System.out.println("Antes de llamar al metodo test");
    test(edad);
    System.out.println("Despues de llamar al metodo test");
    for (int j = 0; j < edad.length; j++) {
      System.out.println("edad[j] = "+edad[j]);
    }
    System.out.println("Finaliza el metodo main con los datos del arregle modificados");
  }  
  
  public static void test(int[] edadArr){
    System.out.println("Iniciamos con el metodo test");
    for (int j = 0; j < edadArr.length; j++) {
      edadArr[j] = edadArr[j] + 20;
    }
    System.out.println("Finaliza el metodo test");
  }
}
