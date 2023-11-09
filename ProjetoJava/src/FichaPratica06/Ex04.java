package FichaPratica06;

import java.util.Scanner;


import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        do {

            System.out.println("\nDigite a opção  desejada: ");
            System.out.println("opção 1: Número Par ou Impar: ");
            System.out.println("opção 2: Positivo ou Negativo: ");
            System.out.println("opção 3: Primo ou Não Primo: ");
            System.out.println("opção 4: Perfeito ou Não Perfeito: ");
            System.out.println("opção 5: Triangular ou Não Triangular: ");
            System.out.println("opção 6: Trocar de Número : ");
            System.out.println("opção 7: Sair da aplicação: ");

            int opcao = input.nextInt();


            switch (opcao) {

                case 1:
                    if (numeroPar(numero)){
                        System.out.println("O número "+numero+ " é Par");
                    }else{
                        System.out.println("O número "+numero+ " é Impar");
                    }
                    break;
                case 2:
                    if (positivoOuNegativo(numero)){
                        System.out.println("O número "+numero+" é positivo ");
                    }else{
                        System.out.println("O número "+numero+" é negativo ");
                    }
                    break;
                case 3:
                    if (primo(numero)){
                        System.out.println("O número "+numero+" é Primo ");
                    }else{
                        System.out.println("O número "+numero+" não é Primo ");
                    }
                    break;
                case 4:
                    if (numeroPerfeito(numero)){
                        System.out.println("O número "+numero+" é Perfeito ");
                    }else{
                        System.out.println("O número "+numero+" não é Perfeito ");
                    }
                    break;
                case 5:
                    if (numeroTriangular(numero)){
                        System.out.println("O número "+numero+" é Triangular ");
                    }else{
                        System.out.println("O número "+numero+" não é triagular ");
                    }
                    break;
                case 6:
                    System.out.print("Digite um número: ");
                    numero = input.nextInt();
                    break;
                default:
                    System.out.println("Opcão inválida: ");

            }


        } while (numero != 7);


    }
}
