package RPG.Domain.Entidade;

public abstract class Entidade {
  private String nome;
  private double vidaMax = 100;
  private double vidaAtual = 100;
  private double forca = 100;

  public Entidade(String nome, double vidaMax, double vidaAtual, double forca) {
    this.nome = nome;
    this.vidaMax = vidaMax;
    this.vidaAtual = vidaAtual;
    this.forca = forca;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setVidaMax(double vidaMax) {
    this.vidaMax = vidaMax;
  }

  public void setVidaAtual(double vidaAtual) {
    this.vidaAtual = vidaAtual;
  }

  public void setForca(double forca) {
    this.forca = forca;
  }

  public String getNome() {
    return nome;
  }

  public double getVidaMax() {
    return vidaMax;
  }

  public double getVidaAtual() {
    return vidaAtual;
  }

  public double getForca() {
    return forca;
  }

  public void mostrarDetalhes() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Nome: " + this.vidaMax);
    System.out.println("Nome: " + this.vidaAtual);
    System.out.println("Nome: " + this.forca);
  }
}
