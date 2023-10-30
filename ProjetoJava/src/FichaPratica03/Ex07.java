package FichaPratica03;

import java.util.Scanner;
//
//Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
//        a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, decrescimo, acrescimo;

        System.out.print("Inssira um número inteiro: ");
        num=input.nextInt();

        decrescimo=num-5;
        acrescimo=num+5;

        while (decrescimo<num){
            System.out.println(decrescimo);
            decrescimo++;
        }

        System.out.println();

        num++;

        while (num<=acrescimo){
            System.out.println(num);
            num++;

        }

    }
}
