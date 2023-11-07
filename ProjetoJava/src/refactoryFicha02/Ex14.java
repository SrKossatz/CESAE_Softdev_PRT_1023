package refactoryFicha02;

import java.util.Scanner;
//Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.
public class Ex14 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int number1, number2, number3;

    System.out.print("Insira o primeiro número: ");
    number1= input.nextInt();

    System.out.print("Insira o segundo número: ");
    number2= input.nextInt();

    System.out.print("Insira o terceiro número: ");
    number3= input.nextInt();

    if (number1<number2 && number2<number3){
      System.out.print("Ordem crescente: " +number1+" "+number2+" "+number3);
    }
    if (number2<number3 && number2>number1){
      System.out.print("Ordem crescente: " +number1+" "+number2+" "+number3);
    }
  }
}
