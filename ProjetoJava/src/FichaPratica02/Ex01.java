package FichaPratica02;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Isira o primeiro número: ");
        number1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        number2 = input.nextInt();

        if(number1 > number2 ){
            System.out.println("Imprima: " + number1);
        }
        if(number2 > number1){
            System.out.println("Imprima:" +number2);
        }
        if(number1 == number2){
            System.out.println("Os número são iguais");
        }


    }

}
