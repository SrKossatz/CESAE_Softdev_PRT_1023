package refactoryFicha02;

import java.util.Scanner;

//Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//a. Salário até 15.000€ inclusive paga taxa de 20%
//b. Salário superior a 15.000€ paga taxa de 30%

public class Ex02 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int salario;

    System.out.print("Insira o seu salário: ");
    salario= input.nextInt();

    if (salario <= 15000){
      System.out.print("Paga taxa de 20%, total: " +(salario*0.20));

    }else{
      System.out.print("Paga taxa de 30%, total: " +(salario*0.30));
    }

  }

}
