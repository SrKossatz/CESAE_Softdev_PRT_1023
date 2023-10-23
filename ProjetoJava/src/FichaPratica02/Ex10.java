package FichaPratica02;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double number1, number2, sum, multiplication, division, subtraction;
    char operator;

    System.out.println("Vamos realizar uma operação matemática básica!");
    System.out.print("Insira o primeiro número real: ");
    number1= input.nextDouble();

    System.out.print("Insira o segundo número real: ");
    number2= input.nextDouble();

    System.out.print("Insira o código do operador que deseja saber o resultado ( +, -, *, / )");
    operator = input.next().charAt(0);

    sum=number1+number2;
    multiplication
    division
    subtraction=number1-number2;


    switch (operator){
      case '+':
        System.out.println("O valor da soma é: " + sum);
        break;

      case '-':
        System.out.println("O valor da subtração é: " + subtraction);
        break;

      case '*':
        System.out.println("O valor da multiplicação é: " +(number1*number2));
        break;

      case '/':
        System.out.println("O valor da divisão é: " +(number1/number2));
        break;

    }



  }
}
