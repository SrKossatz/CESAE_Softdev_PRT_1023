package FichaPratica02;

import java.util.Scanner;
public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double grade1, grade2, grade3, weighted;

    System.out.print("Insira a primeira nota: ");
    grade1= input.nextDouble();



    System.out.print("Insira a segunda nota: ");
    grade2= input.nextDouble();



    System.out.print("Insira a terceira nota: ");
    grade3= input.nextDouble();



    weighted = (grade1*0.25) + (grade2*0.35) + (grade3*0.40);


    if (weighted >= 9.5){
      System.out.println("Você foi aprovado com nota de: " + weighted );
    }else{
      System.out.println("Você foi reprovado.");
    }


  }
}
