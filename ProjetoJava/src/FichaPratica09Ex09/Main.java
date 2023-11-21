package FichaPratica09Ex09;

//No método main, crie um objeto dessa classe Produto e chame o método para comprar 5
//unidades.
//c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
//d. Invoque o método para comprar 10 unidades.
//e. Invoque o método para vender 35 unidades

public class Main {
    public static void main(String[] args) {

        Produto escova =new Produto("Escova de dente", 10);
        Produto toalha=new Produto("Toalha de banho", 5);


        escova.comprar(5);
        escova.exibirDetalhes();

        System.out.println("\n\n*********");

        escova.vender(3);
        escova.exibirDetalhes();

        System.out.println("\n\n*********");

        escova.vender(1);
        escova.exibirDetalhes();

        System.out.println("\n\n*********");
        escova.vender(2);
        escova.exibirDetalhes();

        //***********************************************

        toalha.comprar(10);
        toalha.exibirDetalhes();
        System.out.println("\n\n*********");
        toalha.vender(8);
        toalha.exibirDetalhes();














    }


}
