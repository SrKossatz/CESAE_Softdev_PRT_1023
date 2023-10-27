package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, decrescimo, acrescimo;

        System.out.print("Inssira um número inteiro: ");
        num=input.nextInt();

        decrescimo=num-5;


        while (decrescimo<num){
            System.out.println(decrescimo);
            decrescimo++;
        }

        System.out.println("");


        acrescimo=num+5;

        num++;

        while (num<=acrescimo){
            System.out.println(num);
            num++;

        }

    }
}
