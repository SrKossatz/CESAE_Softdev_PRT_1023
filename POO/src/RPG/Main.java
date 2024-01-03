package RPG;

import RPG.View.Jogo.ViewJogo;

import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {


    ViewJogo jogo = new ViewJogo();
    ViewJogo.jornada(jogo.heroi);


  }

}



