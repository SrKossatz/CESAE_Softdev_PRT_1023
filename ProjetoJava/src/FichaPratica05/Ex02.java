package FichaPratica05;
// Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para 
// cada mês) e calcular o seu total anual.
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

