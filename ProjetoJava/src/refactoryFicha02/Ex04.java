package refactoryFicha02;

import java.util.Scanner;

//. Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
//a. 1º Lugar: 10 pontos
//b. 2º Lugar: 8 pontos
//c. 3º Lugar: 6 pontos
//d. 4º Lugar: 5 pontos
//e. 5º Lugar: 4 pontos
//f. 6º Lugar: 3 pontos
//g. 7º Lugar: 2 pontos
//h. 8º Lugar: 1 ponto
//Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int lugar;

    System.out.print("Digite qual foi a colocação de chegada do piloto: ");
    lugar = input.nextInt();

    switch (lugar) {
      case 1:
        System.out.println("1º Lugar: 10 pontos");
        break;
      case 2:
        System.out.println("2º Lugar: 8 pontos");
        break;
      case 3:
        System.out.println("3º Lugar: 6 pontos");
        break;
      case 4:
        System.out.println("4º Lugar: 5 pontos");
        break;
      case 5:
        System.out.println("5º Lugar: 4 pontos");
        break;
      case 6:
        System.out.println("6º Lugar: 3 pontos");
        break;
      case 7:
        System.out.println("7º Lugar: 2 pontos");
        break;
      case 8:
        System.out.println("8º Lugar: 1 pontos");
        break;
      default:
        System.out.println("Não está classificado.");

    }


  }
}
