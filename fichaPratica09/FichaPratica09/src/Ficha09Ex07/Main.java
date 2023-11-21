package Ficha09Ex07;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Anjos e demônios", "Kossatz", 250, "Romance",12333254 );
        Livro livro2 = new Livro("Agora ou nunca", "JetLee", 200, "Romance",33552211 );

        livro1.exibirDetalhes(); //Método usado para verificar o conteúdo do objeto.
        livro2.exibirDetalhes();

    }
}
