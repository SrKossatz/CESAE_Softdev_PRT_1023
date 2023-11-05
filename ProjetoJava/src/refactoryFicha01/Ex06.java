package refactoryFicha01;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int valor1, valor2;

    System.out.print("Insira o primeiro valor: ");
    valor1= input.nextInt();

    System.out.print("Insira o segundo valor: ");
    valor2= input.nextInt();

    valor1 = valor1 + valor2;
    valor2 = valor1 - valor2;
    valor1 = valor1 - valor2;

    System.out.println("imprima os valores trocados: Valor1 agora é " +valor1  +", e valor2 agora é"+valor2);

  }
}
