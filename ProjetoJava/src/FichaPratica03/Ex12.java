package FichaPratica03;

import java.util.Scanner;

//Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
//imprima os múltiplos de 5 entre eles.

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Insira o número de início do intervalo: ");
        inicio=input.nextInt();

        System.out.print("Insira o número de término do intervalo: ");
        fim=input.nextInt();

        while (inicio<=fim){

            if (inicio%5==0){

                System.out.println(inicio);

            }
            inicio++;




        }
    }
}
