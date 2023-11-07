package refactoryFicha01;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final double pi=3.14;
    int raio;
    double result;

    System.out.print("Insira o tamanho do raio da circuferência: ");
    raio= input.nextInt();

    result = pi*(raio*raio);
    System.out.print("A area da circuferência é de: "+result);

  }
}
