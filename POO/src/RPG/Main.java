package RPG;

import RPG.Entidade.Heroi;
import RPG.Jogo.Jogo;

public class Main {
  public static void main(String[] args) {
    Jogo jogo = new Jogo();
    Heroi heroi = jogo.criarPersonagem();

    // jogo.nomeDoJogo(heroi);

  }
}
