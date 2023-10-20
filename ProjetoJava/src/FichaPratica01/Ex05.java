package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media, valor1, valor2, valor3;

        System.out.print("Insira o valor: ");
        valor1= input.nextDouble();

        System.out.print("Insira o valor: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o valor: ");
        valor3= input.nextDouble();

        media = (valor1+valor2+valor3)/3;

        System.out.println("media Aritimética " +media);

        media = (valor1*0.2)+(valor2*0.3)+(valor3*0.5);

        System.out.println("Media ponderada " +media);

    }



}
