package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    double num1, num2, resultado;
    String operacao, continuar;

    do {

      // Ler num1
      System.out.print("Insira um número: ");
      num1 = input.nextDouble();

      // Ler num2
      System.out.print("Insira outro número: ");
      num2 = input.nextDouble();

      // Ler operacao
      do {
        System.out.print("Operação Aritmética (+ - * /): ");
        operacao = input.next();
      }while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/") );

      // Aplicar a operação aos números lidos
      switch (operacao) {
        case "+": // Soma
          resultado = num1 + num2;
          System.out.println("Soma: " + resultado);
          break;

        case "-": // Subtração
          resultado = num1 - num2;
          System.out.println("Subtração: " + resultado);
          break;

        case "*": // Multiplicação
          resultado = num1 * num2;
          System.out.println("Multiplicação: " + resultado);
          break;

        case "/": // Divisão
          resultado = num1 / num2;
          System.out.println("Divisão: " + resultado);
          break;

        default:
          System.out.println("Operação não reconhecida... Tente novamente");

      }

      // Perguntar se quer realizar novas contas
      do {
        System.out.print("Deseja continuar? (introduza s/n): ");
        continuar = input.next();
      }while (!continuar.equals("s") && !continuar.equals("n"));


    } while (!continuar.equals("n"));


  }


}
