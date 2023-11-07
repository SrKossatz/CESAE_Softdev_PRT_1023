package refactoryFicha01;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1, number2, soma;

    System.out.print("Insira o primeiro número: ");
    number1= input.nextInt();
    System.out.print("Insira o segundo número: ");
    number2= input.nextInt();

    soma= number1+number2;

    System.out.println("Aqui está a sua soma: "+soma);



  }
}
