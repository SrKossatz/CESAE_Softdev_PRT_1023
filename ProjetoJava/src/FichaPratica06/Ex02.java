package FichaPratica06;

import java.util.Scanner;

public class Ex02 {
    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.print("Insira um inteiro positivo: ");
            num=input.nextInt();
        }while(num<0);

        return num;
    }

    public static void imprimirAsteriscos(int numero){

        System.out.println("imprima astericos *");


    }



    public static void main(String[] args) {

        int numero= lerInteiroPositivo();

        imprimirAsteriscos(numero);
    }
}
