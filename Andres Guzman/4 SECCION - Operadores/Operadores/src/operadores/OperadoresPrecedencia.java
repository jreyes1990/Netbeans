package operadores;

public class OperadoresPrecedencia {

  public static void main(String[] args) {
    int i = 14;
    int j = 8;
    int k = 20;
    
    double promedio = (i+j+k)/3d;
    System.out.println("promedio = "+promedio);
    
    promedio = i+j+k/3d*10; // 14 + 8 + 66.6
    System.out.println("promedio = "+promedio);
    
    promedio = i+j+k/(3d*10); // 14 + 8 + 0.6
    System.out.println("promedio = "+promedio);
    
    promedio = (i+j+k)/(3d*10); // 42 / 30
    System.out.println("promedio = "+promedio);
    
    promedio = (i+j+k)/3d*10; // 14 * 10
    System.out.println("promedio = "+promedio);
  }  
}
