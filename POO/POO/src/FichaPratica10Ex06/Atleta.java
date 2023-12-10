package FichaPratica10Ex06;

public class Atleta {
  private String nome;
  private String modalidadeDesportiva;
  private double altura;
  private double peso;
  private String paisOrigem;

  public Atleta(String nome, String modalidadeDesportiva, double altura, double peso, String paisOrigem) {
    this.nome = nome;
    this.modalidadeDesportiva = modalidadeDesportiva;
    this.altura = altura;
    this.peso = peso;
    this.paisOrigem = paisOrigem;
  }
  public void exibirDetalhes(){
    System.out.print("Nome: "+this.nome +" | Modalidade: "+this.modalidadeDesportiva+" | Altura: "+this.altura+"m. | Peso: "+this.peso+"Kg. | Pais Origem: "+this.paisOrigem);
  }
}
