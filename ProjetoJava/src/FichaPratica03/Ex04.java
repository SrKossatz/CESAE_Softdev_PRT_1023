package FichaPratica03;

import java.util.Scanner;

//imprima um número inteiro de 0 até o número solicitado

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number=0, limited;

        System.out.println("Insira um número inteiro: ");
        limited = input.nextInt();

        while (number<=limited){
            System.out.println(number);
            number++;
        }


    }
}
