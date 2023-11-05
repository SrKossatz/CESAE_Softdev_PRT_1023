package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int numeroSecreto, numeroJogador2, quantidadeDeTentativas;

    //ler numero jogador 1 de 0 a 100
    System.out.print("Jogador 1, insira o seu número secreto: ");
    numeroSecreto=input.nextInt();

    // jogador 2 tentar acertar numero jogador 1
    do {
      System.out.print("Jogador 2. Insira o seu número: ");
      numeroJogador2= input.nextInt();

    // se o valor não for descoberto informa se é superior ou inferior
      if (numeroSecreto<numeroJogador2){
        System.out.println("Número secreto é menor");
      }
      if (numeroSecreto>numeroJogador2){
        System.out.println("Número secreto é maior");
      }
    }while (numeroSecreto != numeroJogador2);



    // se o valor for descoberto informar o número de tentativas
  }
}
