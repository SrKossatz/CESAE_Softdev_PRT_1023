package FichaPratica09Ex01;

public class Pessoa {
  private String nome;
  private String idade;
  private String altura;

  public Pessoa(String nome, String idade, String altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  void exibirDetalhes(){
    System.out.println("Nome: "+this.nome+" | "+this.idade+" | "+this.altura);
  }
}
