package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int value1, value2;
    System.out.print("Insira o primeiro valor: ");
    value1= input.nextInt();

    System.out.print("Insira o segundo valor: ");
    value2= input.nextInt();

    if (value1 > value2){
      System.out.print(value2+ " " +value1);
    }else{
      System.out.println(value1+ " " +value2);
    }

  }
}
