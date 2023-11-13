package FichaPratica05;

import java.util.Scanner;

import static FichaPratica05.bibliotecaMatriz.imprimirMatrizInteiros;

public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int matriz[][]=new int[3][3];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print("Insira um valor na matriz ["+i+"]["+j+"]: ");
        matriz[i][j]=input.nextInt();
      }
    }

    imprimirMatrizInteiros(matriz);
  }
  
}
