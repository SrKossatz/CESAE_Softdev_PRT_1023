package ExercicioestraVetor;

import java.util.Scanner;

// Escreva um programa para ler dois vetores de dimensão n<=15. Compare os elementos do primeiro vetor com o segundo e mostre em qual posição os elementos são iguais.

public class Ex02 {
  public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

    int tamanho;

    do {

      System.out.print("Insira a quantidade de elementos dos vetores (de 0 a 15): ");
      tamanho=input.nextInt();

      if (tamanho<1 || tamanho>15) {
        System.out.println("Tamanho inválido!");
      }
      
    } while (tamanho<1 || tamanho>15);


    int vetor1[]=new int[tamanho],
        vetor2[]=new int[tamanho];

    for (int i = 0; i < vetor1.length; i++) {
      System.out.print("Insira os valores no vetor1 ["+i+"]: ");
      vetor1[i]=input.nextInt();   

    }
    for (int i = 0; i < vetor2.length; i++) {
      System.out.print("Insira os valores no vetor2 ["+i+"]: ");
      vetor2[i]=input.nextInt();   
    }

    for (int i = 0; i < vetor1.length; i++) {
       if (vetor1[i]==vetor2[i]) {
            System.out.println("Os vetores são iguais na posição: "+i);
          }
    }

    
  }
  
}
