package refactoryFicha02;

import java.util.Scanner;
//Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
//(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
//mantém positivo depois da operação
public class Ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double saldo, movimento, operacao;

    System.out.print("Insira o saldo da conta: ");
    saldo= input.nextDouble();
    System.out.print("Deseja retirar ou depositar quanto?: ");
    movimento= input.nextDouble();

    operacao=saldo+movimento;

    if (saldo>=0){
      System.out.print("Operação válida, saldo de: "+operacao);

    }else{
      System.out.print("Seu saldo é menor que o valor solicitado:");
    }







  }
}
