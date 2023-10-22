package FichaPratica02;
import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1, number2, number3;

    System.out.print("Insira o primeiro número: ");
    number1= input.nextInt();

    System.out.print("Insira o segundo número: ");
    number2= input.nextInt();

    System.out.print("Insira o terceiro número: ");
    number3= input.nextInt();

    if (number1 < number2 && number1 < number3){
      System.out.println("O menor número é: " + number1);
    }
    if (number2 < number1 && number2 < number3){
      System.out.println("O menor número é: " + number2);
    }
    if (number3 < number1 && number3 < number2){
      System.out.println("O menor número é: " + number3);
    }

  }
}
