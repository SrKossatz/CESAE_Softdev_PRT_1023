package Ficha09Ex10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentoSalrario(double percentual){

        this.salario= this.salario*(1+(percentual/100));

    }

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Nome: "+this.salario);
        System.out.println("Nome: "+this.departamento);
    }

    //aumentarSalario
    //exibirDados

}
