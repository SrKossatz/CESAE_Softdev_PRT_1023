package FichaPratica03;

import java.util.Scanner;

//Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
//números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
//   zero. Exemplo:
//   Valores lidos: 10 (limite) e 3 (salto)
//   Saída do algoritmo: 0 3 6 9

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto, contador=0;

        System.out.print("Insira um número inteiro: ");
        limite= input.nextInt();

        System.out.print("Insira o salto desejado: ");
        salto=input.nextInt();

        while (contador<=limite){

            System.out.println(contador);
            contador=contador+salto;

        }


    }
}
