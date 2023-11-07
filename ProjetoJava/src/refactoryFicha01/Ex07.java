package refactoryFicha01;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double preco1, preco2, preco3, total;

    System.out.print("Insira preço 1: ");
    preco1=input.nextDouble();

    System.out.print("Insira preço 2: ");
    preco2=input.nextDouble();

    System.out.print("Insira preço 3: ");
    preco3=input.nextDouble();

    // Calcular o total
    total = (preco1+preco2+preco3)*0.9;

    System.out.println("Preço com 10% de desconto: "+total);

  }
}
