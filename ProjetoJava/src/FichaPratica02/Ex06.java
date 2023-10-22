package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int value1, value2, valueMax;

    System.out.print("Insira o primeiro valor de 1 a 10: ");
    value1 = input.nextInt();

    System.out.print("Insira o segundo valor de 1 a 10: ");
    value2 = input.nextInt();

//    Função para encontrar o maior valor
//    valueMax = Math.max(value1, value2);
//    System.out.println(valueMax);

    if(value1 > value2){
      System.out.println(value1);
    }else {
      System.out.println(value2);
    }
  }
}
