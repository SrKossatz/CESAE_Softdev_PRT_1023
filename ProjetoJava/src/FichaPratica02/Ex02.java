package FichaPratica02;
import java.util.Scanner;
public class Ex02 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;

        System.out.print("Insira o salário: ");
        salario = input.nextInt();

        if (salario <= 15000){
            System.out.println("Salário igual ou inferior a 15000 paga taxa de 20%");
        }else{
            System.out.println("Salário maior que 15000 paga taxa de 30%");
        }
    }
}
