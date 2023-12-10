package FichaPratica09Ex10;

public class Funcionario {
private String nome;
private double salario;
private String departamento;

  public Funcionario(String nome, double salario, String departamento) {
    this.nome = nome;
    this.salario = salario;
    this.departamento = departamento;
  }

  public void aumentarSalario(double valor) {
    this.salario*=1+(valor/100);//função usada para aumentar percentual.
  }

  public void exibirDetalhes(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Salário: "+this.salario+ "€");
    System.out.println("Departamento: "+this.departamento+"\n");
  }
}
