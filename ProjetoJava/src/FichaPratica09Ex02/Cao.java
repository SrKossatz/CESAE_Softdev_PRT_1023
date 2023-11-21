package FichaPratica09Ex02;

public class Cao {

    //Classe defini um conjunto de atributos
    // Bloco dos construtores C/lista de parâmetros
    // lista de Métodos
    // get para ver
    //sett para alterar


    private String nome;
    private String raca;

    private String ladrar="Au au au";


    public Cao(String nome, String raca) { // Método construtor é público para que seja acedido dentro da própria classe.
        this.nome = nome;
        this.raca = raca;

    }


    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    public void ladrar(){
        System.out.println(this.ladrar);
    }


}
