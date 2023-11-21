package Ficha09Ex11;

public class Main {

    public static void main(String[] args) {
        Conta atylla = new Conta("123456", 200, "Átylla Kossatz");
        Conta vitor = new Conta("123654", 200, "Vitor Silva");

        System.out.println("***Valor inicial da conta***");
        atylla.exibirDados();
        System.out.println("\n");
        atylla.transferencia(vitor,50);
        atylla.exibirDados();


        System.out.println("\n******\n");

        atylla.depositar(200);
        atylla.exibirDados();

        System.out.println("\n******\n");

        atylla.levantar(200);
        atylla.exibirDados();

        atylla.levantar(200);
        atylla.exibirDados();



    }
}
