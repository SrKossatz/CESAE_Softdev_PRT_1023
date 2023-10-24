package FichaPratica02;
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double number1, number2;
    String operation;

    System.out.print("Insira o primeiro número: ");
    number1=input.nextDouble();

    System.out.print("Insira o segundo número: ");
    number2=input.nextDouble();

    System.out.print("Agora escolha qual operação deseja realizar (+, -, /, *): ");
    operation=input.next();

    switch (operation){
      case "+":
        System.out.println(number1+number2);
        break;
      case "-":
        System.out.println(number1-number2);
        break;
      case "/":
        System.out.println(number1/number2);
        break;
      case "*":
        System.out.println(number1*number2);
        break;
      default:
        System.out.println("Operador não válido. Insira (+, -, /, *");
    }
  }
}
