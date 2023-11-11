package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] vetor = new double[12];
        double somaTotal=0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor de comissão [" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            somaTotal+=vetor[i];
        }
        
        System.out.println(somaTotal);
    }
}

