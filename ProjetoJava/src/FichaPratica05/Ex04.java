package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int vetor[]= new int[10];


    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Insira os valores no vetor["+i+"]:");
      vetor[i]=input.nextInt();
    }

    int menorElemento=vetor[0];

    for(int i=0; i<vetor.length; i++){
     
      if(vetor[i]<menorElemento){
          menorElemento= vetor[i];
      }
  }

  // Imprimir menor elemento
  System.out.println("Menor Elemento: "+menorElemento);


  }
  
}
