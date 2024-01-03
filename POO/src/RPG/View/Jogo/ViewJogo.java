package RPG.View.Jogo;

import RPG.Controller.JogoController;
import RPG.Controller.VendedorController;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;
import RPG.Domain.Entidade.Vendedor;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static RPG.Controller.JogoController.spawnInimigos;

public class ViewJogo {

  JogoController jogo = new JogoController();
  public Heroi heroi = jogo.sombrasDoDestino();

  public ViewJogo() throws FileNotFoundException {
  }


  public static void jornada(Heroi heroi) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Vamos começar a nossa Jornada");
    System.out.println("\nO nosso Heroi encontra logo a sua frente a sua primeira escolha decisiva.");
    System.out.println("Temos 2 caminhos para escolher.");
    System.out.println("1) Caminho da Floresta Negra ou 2) Caminho das Montanhas impiedosas");
    System.out.println("0) Desista da sua jornada e termine o jogo");
    int escolha = input.nextInt();

    if (escolha == 0) {
      System.out.println("Você escolheu desistir da jornada. Jogo encerrado.");
      return;
    }

    VendedorController vendedorController = new VendedorController();
    Vendedor vendedor = new Vendedor();


    vendedorController.imprimirLoja(vendedor, heroi);


    switch (escolha) {
      case 1:

        florestaNegra(heroi);
        break;

      case 2:

        montanhasImpiedosas(heroi);
        break;

    }
  }

  public static void escolherProximoCaminho(Heroi heroi) throws FileNotFoundException {

    Scanner input = new Scanner(System.in);
    System.out.println("\nVocê superou um grande desafio!");
    System.out.println("Agora, três novos caminhos se apresentam à sua frente:");
    System.out.println("1) Vale dos Ecos");
    System.out.println("2) Passagem de Gelo");
    System.out.println("3) Ruínas Esquecidas");
    System.out.println("Escolha o seu próximo destino:");

    int escolha = input.nextInt();

    switch (escolha) {
      case 1:
        valeDosEcos(heroi);
        break;
      case 2:
        passagemDeGelo(heroi);
        break;
      case 3:
        ruinasEsquecidas(heroi);
        break;
      default:
        System.out.println("Escolha inválida. Tente novamente.");
        escolherProximoCaminho(heroi);
        break;
    }
  }

  public static void escolherCaminhoFinal(Heroi heroi) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    System.out.println("\nVocê superou os desafios deste caminho!");
    System.out.println("Agora, dois novos caminhos se abrem diante de você:");
    System.out.println("1) Caminho dos Sussurros Ancestrais");
    System.out.println("2) Trilha das Chamas Eternas");
    System.out.println("Qual caminho você escolhe seguir?");

    int escolha = input.nextInt();

    switch (escolha) {
      case 1:
        heroi.setVidaAtual(heroi.getVidaMax());
        caminhoDosSussurrosAncestrais(heroi);
        break;
      case 2:
        trilhaDasChamasEternas(heroi);
        break;
      default:
        System.out.println("Escolha inválida. Tente novamente.");
        escolherCaminhoFinal(heroi);
        break;
    }
  }


  /**
   * Método que lida com a lógica e narrativa do caminho pela Floresta Negra.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void florestaNegra(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("          FLORESTA NEGRA             ");
    System.out.println("=====================================");
    System.out.println("\nDiz a lenda que esta Floresta abriga um segredo ancestral, protegido por criaturas místicas e armadilhas mortais.");
    System.out.println("Os aldeões próximos vivem com medo, contando histórias de aventureiros que entraram na floresta e nunca mais retornaram..");
    System.out.println(heroi.getNome() + " Se depara com um forte inimigo, (Elathor, O guardião da Floresta)");
    System.out.println("Ele é o protetor da Floresta Negra, uma vasta e antiga foresta que abriga inúmeros segredos e criaturas místicas.");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Elathor")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          florestaNegra(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }

    }

    if (!heroi.isFim()) {
      escolherProximoCaminho(heroi);
    }
  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pelas montanhas impiedosas.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void montanhasImpiedosas(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("       MONTANHAS IMPIEDOSAS          ");
    System.out.println("=====================================");
    System.out.println("\nAs Montanhas Impiedosas, assim chamadas pela sua natureza inóspita e perigos constantes, erguem-se imponentes diante do nosso Heroi.");
    System.out.println("Com picos que rasgam o céu e vales profundos envoltos em neblina, o caminho promete ser tanto uma prova de coragem quanto de resistência.");
    System.out.println("Lendas contam sobre criaturas aladas que habitam as cavernas mais altas e sobre espíritos dos montanhistas que pereceram, ainda vagando pelas encostas em busca de repouso eterno.");
    System.out.println("Emergindo da bruma, uma figura majestosa e enigmática se revela. Trata-se de Yrium, o Guardião Ancestral das Montanhas.");
    System.out.println("Compreendendo que enfrentar Yrium é um rito de passagem necessário, nosso heroi empunha sua arma, determinado a provar seu valor. O ar em volta se carrega de tensão, e o silêncio antes da batalha se instala.");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Yrium")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          montanhasImpiedosas(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }

    }

    if (!heroi.isFim()) {
      escolherProximoCaminho(heroi);
    }
  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pelo Vale dos ecos.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void valeDosEcos(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("           VALE DOS ECOS             ");
    System.out.println("=====================================");
    System.out.println("No Vale dos Ecos, nosso heroi enfrenta o Sábio Fantasmagórico (Artroxx), um espírito de um antigo sábio que agora guarda os segredos do vale.");
    System.out.println("Este ser etéreo é tanto enigmático quanto desafiador, capaz de confundir a mente com charadas e ilusões.");
    System.out.println("Para vencer o Artroxx, o nosso heroi deve superar enigmas complexos e resistir às ilusões que distorcem a realidade.");
    System.out.println("Então a batalha começa!!");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Artroxx")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          valeDosEcos(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }

    }
    if (!heroi.isFim()) {
      escolherCaminhoFinal(heroi);
    }


  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pela passagem de gelo.
   *
   * @param heroi
   * @throws FileNotFoundException
   */

  public static void passagemDeGelo(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("         PASSAGEM DE GELO            ");
    System.out.println("=====================================");
    System.out.println("Na implacável Passagem de Gelo, nosso heroi se depara com o (Aedis) Glacial, uma colossal criatura feita de gelo e neve, com olhos que brilham como cristais azuis.");
    System.out.println("(Aedis) é uma força da natureza, com ataques poderosos e resistência ao frio extremo");
    System.out.println("Nosso heroi utilizar sua astúcia para encontrar pontos fracos na armadura de gelo da criatura e usar o ambiente a seu favor.");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Aedis")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          passagemDeGelo(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }

    }

    if (!heroi.isFim()) {
      escolherCaminhoFinal(heroi);
    }

  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pelas ruinas esquecidas.
   *
   * @param heroi
   * @throws FileNotFoundException
   */

  public static void ruinasEsquecidas(Heroi heroi) throws FileNotFoundException {
//    Heroi heroi = null;
    Scanner input = new Scanner(System.in);
    System.out.println("=====================================");
    System.out.println("        RUÍNAS ESQUECIDAS            ");
    System.out.println("=====================================");
    System.out.println("Nas Ruínas Esquecidas, o Guardião das cinzas, (Toflin), um ser feito de trevas e mistério, vigia os antigos tesouros.");
    System.out.println("Ele se move silenciosamente entre as sombras das ruínas, atacando com rapidez e precisão.");
    System.out.println("Combater o Guardião das Sombras é um teste de percepção e agilidade.");
    System.out.println("Nosso heroi deve se adaptar ao estilo de luta furtivo do inimigo, usando a luz e o som para detectar sua localização e prever seus movimentos.");
    System.out.println("Antes de começar a batalha o nosso heroi encontra um baú misterioso.");
    System.out.println("Deseja abrir o bau? 1) SIM , 2) NÂO");
    int escolha = input.nextInt();
    switch (escolha) {
      case 1:
        double vidaAtual = heroi.getVidaAtual();
        heroi.setVidaAtual((vidaAtual - 15));
        System.out.println("Você encontrou uma serpente e foi picado. Perdeu 15 de vida.");
        break;

      case 2:
        int ouro = heroi.getOuro();
        heroi.setOuro(ouro + 50);
        System.out.println("Você ganhou 50 de ouro. Siga e enfrente.");
        break;
    }

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Toflin")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          caminhoDosSussurrosAncestrais(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }
    }

    if (!heroi.isFim()) {
      escolherCaminhoFinal(heroi);
    }


  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pelos sussurros dos ancestrais.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void caminhoDosSussurrosAncestrais(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("  CAMINHO DOS SUSSURROS ANCESTRAIS   ");
    System.out.println("=====================================");
    System.out.println("Uma trilha esquecida que serpenteia através de uma floresta densa e antiga, conhecida como o Caminho dos Sussurros Ancestrais.");
    System.out.println("Dizem que os espíritos dos antigos heróis e sábios habitam as árvores centenárias, sussurrando segredos e conselhos para os viajantes dignos");
    System.out.println("Nosso heroi deve confiar em sua intuição para seguir os sussurros certos, evitando ser desviado por vozes enganosas.");
    System.out.println("O caminho também é guardado por um espírito ancestral chamado (Rando) , que testará nosso heroi em sabedoria e moralidade e força, antes de permitir sua passagem.");
    System.out.println("Enfrente o Rando!!");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Rando")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          caminhoDosSussurrosAncestrais(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }
    }

    if (!heroi.isFim()) {
      crepusculoDeEldoria(heroi);
    }

  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi pela trilha das chamas eternas.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void trilhaDasChamasEternas(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("     TRILHA DAS CHAMAS ETERNAS       ");
    System.out.println("=====================================");
    System.out.println("Uma passagem arriscada que atravessa um deserto de cinzas e campos de lava, conhecido como a Trilha das Chamas Eternas. ");
    System.out.println("O calor abrasador e o terreno instável são apenas parte do desafio.");
    System.out.println("Este lugar é habitado por criaturas de fogo e fumaça, além de ser marcado por erupções vulcânicas frequentes.");
    System.out.println("Além disso, nosso heroi deve batalhar contra um poderoso Elemental de Fogo (Toguro), um guardião das chamas");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Toguro")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          trilhaDasChamasEternas(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        case 3:
          return;
      }

    }

    if (!heroi.isFim()) {
      crepusculoDeEldoria(heroi);
    }


  }

  /**
   * Método que lida com a lógica e narrativa do caminho do nosso heroi. Aqui é o grande final!
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public static void crepusculoDeEldoria(Heroi heroi) throws FileNotFoundException {
    System.out.println("=====================================");
    System.out.println("       O CREPÚSCULO DE ELDORIA       ");
    System.out.println("=====================================");
    System.out.println("A jornada do nosso heroi o levou por terras inóspitas e enfrentamentos perigosos, mas nenhum desafio se compara ao que agora se apresenta: ");
    System.out.println("a profecia do retorno de Noxar, a entidade maligna que ameaça Eldoria.");
    System.out.println("À medida que o crepúsculo cai sobre Eldoria, o céu se enche de um brilho vermelho sangue.");
    System.out.println("Ergue-se um vórtice escuro, pulsando com uma energia sombria. É de lá que (Noxar) irá emergir.");
    System.out.println("Nosso heroi avança em direção ao vórtice. Ele sente o peso de mil almas sobre ele.");
    System.out.println("O vórtice se agita violentamente, e de suas profundezas, (Noxar) emerge.");
    System.out.println("A entidade é uma visão terrível, um ser de escuridão pura, com olhos que brilham como fogo infernal.");
    System.out.println("Começa a batalha...");

    if (heroi.getEstrategiaAtaque().atacar(heroi, spawnInimigos("Noxar")) instanceof NPC) {
      switch (gameOver(heroi)) {
        case 1:
          heroi.setVidaAtual(heroi.getVidaMax());
          crepusculoDeEldoria(heroi);
          break;
        case 2:
          ViewJogo jogo = new ViewJogo();
          ViewJogo.jornada(jogo.heroi);
          break;
        default:
      }

    }

    System.out.println("=====================================");
    System.out.println("               YOU WIN               ");
    System.out.println("=====================================");


  }

  public static int gameOver(Heroi heroi) {

    Scanner input = new Scanner(System.in);
    System.out.println("=====================================");
    System.out.println("               GAME OVER             ");
    System.out.println("=====================================");
    System.out.println("Você foi derrotado.");
    int escolha;


    do {
      System.out.println("1) Recomeçar do último desafio.");
      System.out.println("2) Criar um personagem novo");
      System.out.println("3) Sair do jogo");
      escolha = input.nextInt();



    } while (escolha < 0 || escolha > 3);

    if (escolha == 3) {
      heroi.setFim(true);
    }


    return escolha;

  }


}
