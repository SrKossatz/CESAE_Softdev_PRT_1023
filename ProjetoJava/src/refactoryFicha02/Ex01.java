package refactoryFicha02;
import java.util.Scanner;

//Leia dois números inteiros e escreva na consola o maior deles.

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1, number2;
    System.out.print("Insira o primeiro número: ");
    number1= input.nextInt();
    System.out.print("Insira o primeiro número: ");
    number2= input.nextInt();

    if (number1>number2){
      System.out.println(number1);
    }
    if (number2>number1){
      System.out.println(number2);
    }
    if(number1==number2){
      System.out.println("São iguais");
    }
  }
}
