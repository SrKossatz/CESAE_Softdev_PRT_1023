package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int matriz[][] = new int[3][5];
    int contador = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print("Insira um valor na matriz [" + i + "][" + j + "]: ");
        matriz[i][j] = input.nextInt();
      }
    }

    System.out.print("Insira mais um valor para que seja verificado se existe dentro da matriz[]: ");
    int valorAleatório = input.nextInt();

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (valorAleatório == matriz[i][j]) {
          contador++;
        }
      }
    }
    System.out.println("O valor aleatório: " + valorAleatório + "Apareceu: " + contador + "vezes.");
  }
}
