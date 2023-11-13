package FichaPratica05;

import java.util.Scanner;

// Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par 
// inserido. Caso não exista, deverá informar o utilizador
public class Ex07 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int vetor[] = new int[10];
    
    int maiorElementoPar = -1;

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Insira os valores nas posições do vetor[" + i + "]:");
      vetor[i] = input.nextInt();
    }
    // Encontrar um par qualquer para inicializar maiorElementoPar
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 == 0) {
        maiorElementoPar = vetor[i];
      }
    }
    // Encontrar o maior par
    for (int indice = 0; indice < vetor.length; indice++) {
      if (vetor[indice] > maiorElementoPar && vetor[indice] % 2 == 0) {
        maiorElementoPar = vetor[indice];
      }
    }

    if(maiorElementoPar%2==0){
      System.out.println("Maior Par: "+maiorElementoPar);
    }else{
      System.out.println("Não há pares no vetor");
  }

  }

}
