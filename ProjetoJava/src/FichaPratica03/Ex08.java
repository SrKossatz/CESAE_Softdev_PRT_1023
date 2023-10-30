package FichaPratica03;

import java.util.Scanner;

//Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
//        deve dizer a média dos números introduzidos (excluindo o -1)

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num=0, somatorio=0,contador=0, media;

        while(num!=-1){
            // Ler num até ter -1
            System.out.print("Insira um número (-1 para parar): ");
            num=input.nextDouble();

            // Acumular o número na variável somatório
            somatorio=somatorio+num;

            // Contar +1 aos números introduzidos
            contador++;
        }

        // Remover o -1 do somatório
        somatorio++;
        System.out.println("Somatório: "+somatorio);

        // Remover uma contagem
        contador--;
        System.out.println("Contador: "+contador);

        // Calcular a média
        media=somatorio/contador;

        System.out.println("Média: "+media);
    }
}
