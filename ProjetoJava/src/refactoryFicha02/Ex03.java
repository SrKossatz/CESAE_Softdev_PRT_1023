package refactoryFicha02;

import java.util.Scanner;

//Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//a. Salário até 15.000€ inclusive paga taxa de 20%
//b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
//c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
//d. Salário superior a 25.000€ paga taxa de 40%

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int salario;

    System.out.print("Insira o seu salário: ");
    salario= input.nextInt();

    if (salario <= 15000){
      System.out.println("Paga taxa de 20%: "+(salario*0.20));
    }
    if (salario > 15000 && salario <= 20000){
      System.out.println("Paga taxa de 30%: "+(salario*0.30));
    }
    if (salario >= 20000 && salario <= 25000){
      System.out.println("Paga taxa de 35%: "+(salario*0.35));
    }
    if (salario > 25000){
      System.out.println("Paga taxa de 40%: "+(salario*0.40));
    }

  }
}
