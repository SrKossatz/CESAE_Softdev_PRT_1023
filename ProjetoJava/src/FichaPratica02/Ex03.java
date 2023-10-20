package FichaPratica02;
import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;

        System.out.print("Insira o salário: ");
        salario = input.nextInt();

        if (salario <= 15000){
            System.out.print("Paga taxa de 20%");
        }
        if (salario > 15000 && salario <= 20000){
            System.out.println("Paga taxa de 30%");
        }
        if (salario >= 20000 && )

    }

}
