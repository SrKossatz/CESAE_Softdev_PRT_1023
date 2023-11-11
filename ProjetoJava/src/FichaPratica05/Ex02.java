package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] vetor = new int[12];
        int somaTotal=0;



        for (int indice=0; indice<12; indice++){
            System.out.print("Insira o valor da comissão ["+indice+"]: ");
            vetor[indice]= input.nextInt();
            somaTotal=somaTotal+vetor[indice];
            System.out.println("somaTotal" + somaTotal);

        }

        System.out.println(somaTotal);



    }
}
