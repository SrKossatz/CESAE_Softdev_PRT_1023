package FichaPratica05;

import static FichaPratica05.bibliotecaMatriz.imprimirMatrizInteiros;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int matriz [][]= new int[5][5];
    int soma=0;

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[0].length; coluna++) {
        System.out.print("Insira os valores na matriz["+linha+"]["+coluna+"]: ");
        matriz[linha][coluna]=input.nextInt();
      }
    }

    imprimirMatrizInteiros(matriz);   

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[0].length; coluna++) {
        soma+=matriz[linha][coluna];
        
      }
    }
    
    System.out.println("a soma é: "+soma);

  }
  
}
