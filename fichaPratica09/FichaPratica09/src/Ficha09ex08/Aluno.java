package Ficha09ex08;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double media=9.5;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public double situacao(double nota1, double nota2){

        double aprovado = (nota1 +nota2)/2;

        if( aprovado >= this.media){
            System.out.println("Aluno Aprovado com nota: "+aprovado);
        }else{
            System.out.println("Reprovado");
        }
        return aprovado;
    }
}
