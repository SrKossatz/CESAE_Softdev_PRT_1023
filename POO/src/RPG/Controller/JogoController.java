package RPG.Controller;

import RPG.Controller.EstrategiaAtaque.Arqueiro;
import RPG.Controller.EstrategiaAtaque.Barbaro;
import RPG.Controller.EstrategiaAtaque.Feiticeiro;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;
import RPG.Domain.Itens.ArmaPrincipal;
import RPG.Repositorio.ItemHeroiRepositorio;
import RPG.Repositorio.NPCRepositorio;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JogoController {

  public JogoController() {
  }

  /**
   * Método responsável por guiar o jogador na criação de um personagem do RPG
   * @return Heroi criado
   * @throws FileNotFoundException
   */
  public Heroi criarPersonagem() throws FileNotFoundException {
    Scanner input = new Scanner(System.in);

    System.out.println("\t #####                                                                ######                                      \n" +
            "#     #  ####  #    # #####  #####    ##    ####     #####   ####     #     # ######  ####  ##### # #    #  ####  \n" +
            "#       #    # ##  ## #    # #    #  #  #  #         #    # #    #    #     # #      #        #   # ##   # #    # \n" +
            " #####  #    # # ## # #####  #    # #    #  ####     #    # #    #    #     # #####   ####    #   # # #  # #    # \n" +
            "      # #    # #    # #    # #####  ######      #    #    # #    #    #     # #           #   #   # #  # # #    # \n" +
            "#     # #    # #    # #    # #   #  #    # #    #    #    # #    #    #     # #      #    #   #   # #   ## #    # \n" +
            " #####   ####  #    # #####  #    # #    #  ####     #####   ####     ######  ######  ####    #   # #    #  ####  \n");
    System.out.println("\nEm Sombras do destino, o reino de Eldoria vive em uma paz frágil, ameaçada pela profecia do retorno de Noxar, uma entidade malígna que renasce das cinzas a cada milênio." +
            " \nO jogador deve escolher entre tres guerreiros sagrados: Um destemível Bárbaro, um poderoso feiticeiro, ou um habilidoso arqueiro. Vamos começar a nossa aventura.");
    System.out.println("");
    System.out.println("Primeiro defina um nome para o seu Heroi: ");
    String nomeHeroi = input.nextLine();

    int tipoHeroi;
    do {
      System.out.println("Escolha o tipo de herói: 1-Bárbaro, 2-Feiticeiro, 3-Arqueiro");
      tipoHeroi = input.nextInt();
      if (tipoHeroi < 1 || tipoHeroi > 3) {
        System.out.println("Escolha inválida. Por favor, digite '1' para Bárbaro, '2' para Feiticeiro, ou '3' para Arqueiro.");
      }
    } while (tipoHeroi < 1 || tipoHeroi > 3);

    int dificuldade;
    do {
      System.out.println("Escolha a dificuldade: (1-Fácil) ou (2-Difícil)");
      dificuldade = input.nextInt();
      if (dificuldade != 1 && dificuldade != 2) {
        System.out.println("Escolha inválida. Por favor, digite '1' para Fácil ou '2' para Difícil.");
      }
    } while (dificuldade != 1 && dificuldade != 2);

    int pontosDeCriacao = dificuldade == 1 ? 300 : 220;


    System.out.println("Você tem " + pontosDeCriacao + " pontos de criação. Cada ponto de vida vale 1 ponto, cada ponto de força vale 5 pontos.");

    double vida = 0, forca = 0;
    double pontosTotais;

    do {
      System.out.print("Vida: ");
      vida = input.nextDouble();
      System.out.print("Força: ");
      forca = input.nextDouble();
      pontosTotais = vida + forca;
      forca*=5;

      if (pontosTotais > pontosDeCriacao) {
        System.out.println("Você ultrapassou " + (pontosTotais - vida) + " pontos. Você tem " + pontosDeCriacao + " pontos disponíveis. Tente novamente.");
      }
    } while (pontosTotais > pontosDeCriacao);

    Heroi heroi = null;
    ItemHeroiRepositorio itemHeroiRepositorio = new ItemHeroiRepositorio();


    switch (tipoHeroi) {
      case 1:
        heroi = new Heroi(nomeHeroi, vida, vida, forca, (ArmaPrincipal) itemHeroiRepositorio.getItemArray().get(3),new Barbaro());
        break;
      case 2:
        heroi = new Heroi(nomeHeroi, vida, vida, forca, (ArmaPrincipal) itemHeroiRepositorio.getItemArray().get(4), new Feiticeiro());
        break;
      case 3:
        heroi = new Heroi(nomeHeroi, vida, vida, forca,(ArmaPrincipal) itemHeroiRepositorio.getItemArray().get(4), new Arqueiro());
        break;
      default:
        System.out.println("Ocorreu um erro inesperado na criação do herói.");
    }

    heroi.setOuro(dificuldade == 1 ? 20 : 15);

    heroi.mostrarDetalhes();
    return heroi;
  }

  /**
   * Método criado para ser ponto de partida do jogo.
   * @return Personagem criado e inicia o jogo.
   * @throws FileNotFoundException
   */
  public Heroi sombrasDoDestino() throws FileNotFoundException {
    return criarPersonagem();
  }


  /**
   * Método que gera um npc de acordo com o nome listado no arquivo csv do NPCrepositório.
   * @param nome
   * @return NPC da sala correspondente de acordo com o enredo.
   * @throws FileNotFoundException
   */
  public static NPC spawnInimigos(String nome) throws FileNotFoundException {
    NPCRepositorio npcRepositorio = new NPCRepositorio();
    for (NPC npcAtual : npcRepositorio.getArrayNPC()) {
      if (npcAtual.getNome().equalsIgnoreCase(nome)) {
        return npcAtual;
      }
    }
    return null;
  }
}
