package refactoryFicha01;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double valor1, valor2, valor3, result, ponderada=1;

    System.out.print("Insira o primeiro valor: ");
    valor1= input.nextDouble();
    System.out.print("Insira o segundo valor: ");
    valor2= input.nextDouble();
    System.out.print("Insira o segundo valor: ");
    valor3= input.nextDouble();

    result= (valor1*0.20)+(valor2*0.30)+(valor3*0.50)/ponderada;

    System.out.print("A média ponderada é de: "+result);


  }
}
