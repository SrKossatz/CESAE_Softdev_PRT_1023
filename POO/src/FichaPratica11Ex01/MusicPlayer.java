package FichaPratica11Ex01;

import java.util.ArrayList;

public class MusicPlayer {
  private ArrayList<Musica> programacao;

  public MusicPlayer() {
    this.programacao = new ArrayList<>();
  }

  public void addMusica(Musica musicaNova) {
    this.programacao.add(musicaNova);
  }

  //Método remove pode ser feito pelo index ou pelo objeto.
  public void removeMusica(int index) {
    this.programacao.remove(index);
  }

  public void removeMusica(Musica musica) {
    this.programacao.remove(musica);
  }

  public void trocarMusicas(int index1, int index2) {
    //Método get usado para pegar um elemento em determinada posição de um arraylist.
    Musica musica1 = this.programacao.get(index1);
    Musica musica2 = this.programacao.get(index2);
    // Método set usado para trocar elementos dentro de um arraylist, recebe 2 parámetros.
    this.programacao.set(index1, musica2);
    this.programacao.set(index2, musica1);
  }
  public void imprimirRelatorio() {
    int contador = 1;

    // Ciclo for each
    // Grava em "musicaAtual" uma posição do array "programação", de cada vez (a cada iteração)
    for (Musica musicaAtual : this.programacao) {
      System.out.print("Música " + contador++ + ": ");
      musicaAtual.exibirDetalhes();
    }


  }
}
