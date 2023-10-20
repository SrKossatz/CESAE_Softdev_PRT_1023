package FichaPratica01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int area, base, height, perimeter;

        System.out.print("Insira o valor da base do retângulo: ");
        base = input.nextInt();

        System.out.print("Insira o valor da altura do retângulo: ");
        height = input.nextInt();

        area = base * height;
        perimeter = base * 2 + height * 2;
        System.out.println("A Área do retângulo é de: " + area + "m, e o Perímetro é de: " + perimeter + "m");
    }


}
