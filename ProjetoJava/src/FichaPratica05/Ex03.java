package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor[] = new int[5];

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Digite números até preencher o vetor[" + i + "]:");
      vetor[i] = input.nextInt();
    }

    int maiorElemento = vetor[0];
   

    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] > maiorElemento) {
        maiorElemento = vetor[i];

        System.out.println("Maior elemento: "+maiorElemento);
      }

    }

  }
}
