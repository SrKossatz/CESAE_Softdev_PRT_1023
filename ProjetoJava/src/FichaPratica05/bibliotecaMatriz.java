package FichaPratica05;

public class bibliotecaMatriz {

  public static void imprimirMatrizInteiros(int[][] matriz){
    // Imprimir a matriz na consola
    for (int i = 0; i <  matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz[i][j]+ "\t");
        }
        System.out.println();
    }

}
  
}
