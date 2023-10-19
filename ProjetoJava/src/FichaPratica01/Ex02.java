package FichaPratica01;



import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;

        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("A soma dos números é " + result);

        result = num1 - num2;
        System.out.println("A subtração dos números é " + result);

        result = num1 * num2;
        System.out.println("A multiplicação dos números é " + result);

        result = num1 / num2;
        System.out.println("A divisão dos números é " + result);
    }
}
