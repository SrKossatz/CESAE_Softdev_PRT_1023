package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double product1, product2, product3, totalValueProduct, result;

        System.out.println("Insira o preço dos 3 produtos adquiridos");
        product1 = input.nextDouble();
        product2 = input.nextDouble();
        product3 = input.nextDouble();

         totalValueProduct = product1 + product2 + product3;
         result = totalValueProduct - 0.10;

        System.out.println("Total a pagar com desconto de 10% é de :" +result);
    }
}
