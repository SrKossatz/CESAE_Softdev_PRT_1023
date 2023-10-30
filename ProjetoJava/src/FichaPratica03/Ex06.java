package FichaPratica03;

import java.util.Scanner;

//Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
//seu somatório. (Não necessita de Scanner ou input do utilizador)
//Exemplo de Execução

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startNumber = 1, endNumber=100, soma = 0;

        while (startNumber <= endNumber){
            System.out.println(startNumber);
            soma = soma + startNumber;
            startNumber++;
        }
        System.out.println(soma);
    }
}

