package flujocontrol;

public class For_While_Etiquetas {

  public static void main(String[] args) {
    System.out.println("********** USO DE FOR Y CONTINUE **********");
    etiquetaContinue:
    for (int i = 0; i < 5; i++) {
      System.out.println();
      for (int j = 0; j < 5; j++) {
        if (i == 2) {
          continue etiquetaContinue;
        }
        System.out.print("[i = "+i+", j = "+j+"], ");
      }
    }
    
    System.out.println("\n\n********** USO DE FOR Y BREAK **********");
    etiquetaBreak:
    for (int i = 0; i < 5; i++) {
      System.out.println();
      for (int j = 0; j < 5; j++) {
        if (i == 2) {
          break etiquetaBreak;
        }
        System.out.print("[i = "+i+", j = "+j+"], ");
      }
    }
    
    System.out.println("\n\n********** USO DE FOR Y WHILE **********");
    etiquetaWhile:
    for (int i = 0; i < 5; i++) {
      System.out.println();
      int j = 0;
      while(j < 5) {
        if (i == 2) {
          continue etiquetaWhile;
        }
        System.out.print("[i = "+i+", j = "+j+"], ");
        j++;
      }
    }
    
    System.out.println("\n\n");
    etiquetaDiasLaborados:
    for (int i = 1; i <= 7; i++) {
      int j = 1;
      while(j <= 8) {
        if (i == 6 || i == 7) {
          System.out.println("Dias "+i+": descanso de fin de semana!");
          continue etiquetaDiasLaborados;
        }
        System.out.println("Dia "+i+", trabajando a las "+j+" Hrs.");
        j++;
      }
    }
    
    System.out.println("\n\n");
  }  
}
