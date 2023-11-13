package ExercicioestraVetor;

import java.util.Scanner;


// Escreva um programa para ler um vetor de tamanho <=20 e determine quem é o maior e o menor elemento.

public class Ex03 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

     
    int tamanho, maior, menor;

    do {
      System.out.print("Insira um número entre 1 e 20 para determinar o tamanho do vetor[]:");
      tamanho=input.nextInt();
      
    } while (tamanho<1 || tamanho>20);

    int vetor[]=new int[tamanho];

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Adicione valores aos elementos do vetor["+i+"]:");
      vetor[i]=input.nextInt();
    }

    maior=menor=vetor[0];

    for (int i = 1; i < vetor.length; i++) {

      if (vetor[i]>maior) {
        maior = vetor[1];
      }
      if (vetor[i]<menor) {
        menor=vetor[i];
      }


    }

    System.out.println("Maior elemento: "+maior+ "\nMenor elemento: "+menor);

    
  }
  
}
