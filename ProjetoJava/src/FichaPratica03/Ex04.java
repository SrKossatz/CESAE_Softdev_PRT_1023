package FichaPratica03;

import java.util.Scanner;

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
