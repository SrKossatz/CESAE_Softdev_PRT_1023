package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int indice=0; indice <=9; indice++){

            System.out.print("Insira o número do array ["+indice+"]: ");
            vetor [indice] = input.nextInt();

        }

        for (int indice=0; indice<=9; indice++){
            System.out.println("vetor ["+indice+"]: " + vetor[indice]);
        }








    }
}
