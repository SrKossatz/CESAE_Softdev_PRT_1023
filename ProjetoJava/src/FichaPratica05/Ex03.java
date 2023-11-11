package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] vetor = new int[10];


    for (int indice = 0; indice < 10; indice++) {
      System.out.print("Insira o primeiro número do indice [" + indice + "]: ");
      vetor[indice] = input.nextInt();
    }

    int maiorElemento = vetor[0];
    for (int i = 1; i < 10; i++) {
      if (vetor[i] > maiorElemento) {
        maiorElemento = vetor[i];
      }
    }

    System.out.print(vetor[0]);
  }

}
