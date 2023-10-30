package FichaPratica03;

import java.util.Scanner;

//Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
//utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
//dados deve terminar quando for lido um número negativo.
//Exemplo de Execução

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;


        while (number >= 0) {
            System.out.print("Insira um número: ");
            number = input.nextInt();

            if (number >= 0 && number <= 25) {

                intervalo1++;
            }
            if (number >= 26 && number <= 50) {

                intervalo2++;
            }
            if (number >= 51 && number <= 75) {

                intervalo3++;
            }
            if (number >= 76 && number <= 100) {

                intervalo4++;
            }
        }
        System.out.println("Intervalo de [0.25] " + intervalo1);
        System.out.println("Intervalo de [26,50] " + intervalo2);
        System.out.println("Intervalo de [51,75] " + intervalo3);
        System.out.println("Intervalo de [76,100] " + intervalo4);

    }
}
