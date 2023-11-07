package refactoryFicha02;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int horas, minutos;


    System.out.println("Introduza o horário no sistema 24h");
    System.out.print("Horas: ");
    horas=input.nextInt();

    System.out.print("Minutos: ");
    minutos=input.nextInt();

    if(horas<=12){ // AM
      System.out.println(horas+":"+minutos+" AM");
    }else{ // PM
      horas=horas-12;
      System.out.println(horas+":"+minutos+" PM");
    }
  }
}
