package FichaPratica12Ex02;
//new main criado para usar o designe patters factory method
import java.awt.*;
import java.util.Scanner;

public class NewMain {

    public static Veiculo criarVeiculo(String tipo){
        Scanner input = new Scanner(System.in);

        if ("carro".equalsIgnoreCase(tipo)) {
            System.out.println("Qual a marca:");
            String marca = input.next();
            System.out.println("Qual o modelo:");
            String modelo = input.next();
            System.out.println("Qaual o ano de fabrico:");
            int anoFabrico = input.nextInt();
            System.out.println("Insira a potência: ");
            int potencia = input.nextInt();
            System.out.println("Qual a cilindrada: ");
            int cilindrada = input.nextInt();
            System.out.println("Qual o tipo de combustível. ( GASOLINA, DIESEL, GPL, ELETRICO)");
            TipoCombustivel tipoCombustivel = TipoCombustivel.valueOf(input.next().toUpperCase());
            System.out.println("Consumo: ");
            double consumo = input.nextDouble();
            System.out.println("Quantidade de passageiros:");
            int quantidadeDePassageiro = input.nextInt();

            return new Carro(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo, quantidadeDePassageiro);

        }
//        } else if ("moto".equalsIgnoreCase(tipo)) {
//
//            return new Mota();

        return null;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcao;





        do {

            System.out.println("Crie um veículo a sua escolha: Camiao, carro ou moto");
            System.out.println("1) Carro.");
            System.out.println("2) camião.");
            System.out.println("3) Mota.");
            System.out.println("4) Calcule o consumo do veículo do carro.");
            System.out.println("0) Sair.");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Criando Carro");
                    criarVeiculo("carro").exibirDetalhes();

                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Consumo");
//
                    break;
            }

        }while (opcao!=0);





    }
}
