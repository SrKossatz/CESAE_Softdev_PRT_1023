package FichaPratica03;

import java.util.Scanner;

//Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
//imprima os números inteiros neste intervalo.
//Exemplo de execução:

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Insira o primeiro número inteiro: ");
        number1= input.nextInt();

        System.out.print("Insira o primeiro número inteiro: ");
        number2 = input.nextInt();



        while (number1 <= number2){
            System.out.println(number1);
            number1++;
        }



    }
}
