package FichaPratica05;

// Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem 
// de inserção. Exemplo de execução

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] vetor = new int[10];

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Insira o seu número no Vetor ["+i+"]: ");
      vetor[i] = input.nextInt();
    }

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Vetor["+i+"]: "+vetor[i]);

    }

  }
}
