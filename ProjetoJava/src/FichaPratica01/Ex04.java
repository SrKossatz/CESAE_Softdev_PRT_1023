package FichaPratica01;


import java.util.Scanner;

// fórmula de cáculo A = π . r2

public class Ex04 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double area, pi = 3.14, radius;


    System.out.print("Insira o raio da circuferência: ");
    radius = input.nextDouble();
    radius = radius * radius;


    area = pi * radius;

    System.out.println("A área total da circuferência é de: " + area + "cm2");








  }
}
