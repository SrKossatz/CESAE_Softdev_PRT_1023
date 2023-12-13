package FichaPratica11Ex01;

public class Musica {
  private String musica;
  private String genero;
  private String artista;
  private int duracao;

  public Musica(String musica, String genero, String artista, int duracao) {
    this.musica = musica;
    this.genero = genero;
    this.artista = artista;
  }
  public void exibirDetalhes(){
    System.out.println(this.musica +" | "+this.genero+" | "+this.artista+" | "+this.duracao+" s.");
  }
}
