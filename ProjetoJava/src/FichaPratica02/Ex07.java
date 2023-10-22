package FichaPratica02;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number;

    System.out.print("Insira um número inteiro e direi se é PAR ou ÍMPAR: ");
    number = input.nextInt();

    if (number % 2 == 0){
      System.out.println("Este número é PAR");
    }else{
      System.out.println("Este número é ÍMPAR");
    }

  }
}
