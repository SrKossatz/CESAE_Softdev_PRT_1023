package FichaPratica03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        while (number >= 0 && number <= 400) {
            number++;
            if (number % 2 == 0) {

                System.out.println(number);

            }
        }
    }
}