package refactoryFicha01;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1, number2, result;

    System.out.print("Insira o primeiro valor: ");
    number1= input.nextInt();

    System.out.print("Insira o segundo valor: ");
    number2= input.nextInt();

    System.out.println("Agora vamos calcular");

    result = number1+number2;
    System.out.println("soma: "+result);

    result = number1-number2;
    System.out.println("Subtração: "+result);

    result = number1*number2;
    System.out.println("Multiplicação: "+result);

    result = number1/number2;
    System.out.println("divisão: "+result);




  }
}
