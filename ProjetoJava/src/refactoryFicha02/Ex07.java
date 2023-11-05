package refactoryFicha02;

import java.util.Scanner;
// Escreva um programa que leia um número, depois apresente se é par ou ímpar.
public class Ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number;

    System.out.print("Insira um número inteiro: ");
    number= input.nextInt();

    if (number%2 == 0){
      System.out.println("Este número é par: "+number);

    }else{
      System.out.println("Este número é impar: "+number);
    }
  }
}
