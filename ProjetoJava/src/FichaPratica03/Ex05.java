package FichaPratica03;

import java.util.Scanner;

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
