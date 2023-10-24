package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double finalBalance,balance,amount;

    System.out.print("Digite o saldo da conta bancária: ");
    balance = input.nextDouble();

    System.out.print("Digite o montante a creditar/debitar: ");
    amount = input.nextDouble();

    finalBalance = balance + amount;

    if (finalBalance >= 0) {
      System.out.println("Operação realizada com sucesso. Saldo final: " + finalBalance);
    } else {
      System.out.println("A operação não é válida. Você não tem saldo suficiente.");
    }


  }
}
