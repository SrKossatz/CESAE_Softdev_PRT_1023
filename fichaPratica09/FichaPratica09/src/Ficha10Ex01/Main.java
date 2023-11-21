package Ficha10Ex01;

public class Main {
    public static void main(String[] args) {

        Carro peugeot = new Carro("Peugeot","407",2010,260,1600,6, TipoDeCombustivel.DIESEL);
        Carro renault = new Carro("Megane","megane1", 1980,180,2000,5,TipoDeCombustivel.GASOLINA);



        peugeot.exibirDetalhes();
        peugeot.ligar();

        System.out.println("\n******\n");

        renault.exibirDetalhes();
        renault.ligar();




    }
}
