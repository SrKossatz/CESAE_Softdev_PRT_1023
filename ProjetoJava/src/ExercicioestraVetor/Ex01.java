package ExercicioestraVetor;

import java.util.Scanner;

// Excreva um  programa para ler um vetor de N posições onde N é menor ou igual a 20 e imprima seus elementos. Solicite o tamanho do vetor ao utilizador.


public class Ex01 {

  public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);

    int vetor [], tamanho;

    do {

      System.out.print("Insira o tamanho do vetor entre 1 e 20: ");
      tamanho=input.nextInt();
      
    } while (tamanho < 1 || tamanho > 20);

    vetor= new int [tamanho];

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Insira um número no vetor["+i+"]");
      vetor[i]=input.nextInt();
    }

    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor [i]);
    }


  }



  
}
