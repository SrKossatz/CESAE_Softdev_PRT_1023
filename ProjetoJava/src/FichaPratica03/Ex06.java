package FichaPratica03;

import java.util.Scanner;

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
