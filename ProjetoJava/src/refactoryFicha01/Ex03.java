package refactoryFicha01;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int base, altura, result;

    System.out.print("Insira o tamanho da base do retângulo: ");
    base= input.nextInt();

    System.out.print("Insira o tamanho da altura do retângulo: ");
    altura= input.nextInt();

    result= base*altura;
    System.out.println("Area total do retângulo é: "+result);

    result= (base+base)+(altura+altura);
    System.out.println("O perímetro total do retângulo é: "+result);


  }
}
