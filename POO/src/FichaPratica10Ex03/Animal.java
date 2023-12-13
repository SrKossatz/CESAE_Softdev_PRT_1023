package FichaPratica10Ex03;

public class Animal {
  private String nome;
  private String especie;
  private String paisOrigem;
  private double pesoKg;
  private String [] alimentacao;


  public Animal(String nome, String especie, String paisOrigem, int pesoKg, String[] alimentacao) {
    this.nome = nome;
    this.especie = especie;
    this.paisOrigem = paisOrigem;
    this.pesoKg = pesoKg;
    this.alimentacao = alimentacao;
  }

  public void comer(String alimento, double pesoAlimento){
    for (int i = 0; i < alimentacao.length ; i++) {
      if (this.alimentacao[i].equals(alimento)){
        System.out.println("O animal pode comer!");
        this.pesoKg+=pesoAlimento/1000;
        System.out.println("O " + this.especie + " " + this.nome + " comeu " + alimento);
        return;
      }
    }
    System.out.println("O " + this.especie + " " + this.nome + " NÃO COMEU " + alimento);

  }

  public void exibirDetalhes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Especie: " + this.especie);
    System.out.println("Pais Origem: " + this.paisOrigem);
    System.out.println("Peso: " + this.pesoKg);
  }
}
