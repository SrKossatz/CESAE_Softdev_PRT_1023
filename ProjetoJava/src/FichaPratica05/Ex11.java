package FichaPratica05;

import static FichaPratica05.bibliotecaMatriz.imprimirMatrizInteiros;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] matriz=new int[3][3];
    int maiorValor, menorValor;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print("Introduza os valores da matriz["+i+"]["+j+"]: ");
        matriz[i][j]=input.nextInt();        
      }
    }

    imprimirMatrizInteiros(matriz);

    maiorValor=menorValor=matriz[0][0];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (maiorValor<matriz[i][j]) {
          maiorValor=matriz[i][j];
        }
        if (menorValor>matriz[i][j]) {
          menorValor=matriz[i][j];
        }       
      }
    }

    System.out.println("O menor valor é: "+menorValor+" e o maior é: "+maiorValor);




  }
  
}
