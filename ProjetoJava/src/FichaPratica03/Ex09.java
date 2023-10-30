package FichaPratica03;

import java.util.Scanner;

//Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
//Suponha que o número lido da entrada será maior que 2

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start=2, end;


        System.out.print("Insira um número inteiro maior que 2: ");
        end= input.nextInt();


        while (start<=end){
//
//            if (start % 2 == 0){
//                System.out.println(start);
//            }
            System.out.println(start);

            start=start +2;
        }
    }
}
