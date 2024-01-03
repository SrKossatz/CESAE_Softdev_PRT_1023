package RPG.Controller;

import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;
import RPG.Domain.Itens.Consumivel;
import RPG.Domain.Itens.ConsumivelCombate;
import RPG.Domain.Itens.ItemHeroi;
import RPG.Domain.Itens.Pocao;
import RPG.Repositorio.NPCRepositorio;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HeroiController {

  private final ArrayList<NPC> npcs;
  private final Heroi heroi;

  /**
   * Método construtor. Cria uma instância de NPCRepositorio e chama o arrayNPC.
   *
   * @param heroi
   * @throws FileNotFoundException
   */
  public HeroiController(Heroi heroi) throws FileNotFoundException {
    NPCRepositorio repositorioNPC = new NPCRepositorio();
    this.npcs = repositorioNPC.getArrayNPC();
    this.heroi = heroi;
  }

  /**
   * Método exibe os consumíveis de combate..
   *
   * @param heroi Objeto que fornece os parâmetros.
   * @return Retorna um arrayList de itens com índices.
   */
  public static ArrayList<ConsumivelCombate> exibirConsumiveis(Heroi heroi) {
    ArrayList<ConsumivelCombate> consumiveis = new ArrayList<>();//cria array auxiliar para listar os consumíveis.

    int contador = 1;

    for (ItemHeroi itemAtual : heroi.getInventario()) {// verifica no ficheiro o tipo consumível.

      if (itemAtual instanceof ConsumivelCombate) { //Só entra nesse IF os consumíveis de combate.
        ConsumivelCombate consumivelCombateAtual = (ConsumivelCombate) itemAtual;

        System.out.println("Consumível " + contador++);
        consumivelCombateAtual.mostrarDetalhes();

        consumiveis.add(consumivelCombateAtual);//Adiciona o índice do consumível ao array.  Este índice pode ser usado para identificar o consumível escolhido pelo jogador.
      }
    }
    return consumiveis;
  }

//  public void usarConsumivelCombate() {
//    Scanner input = new Scanner(System.in);
//    System.out.println("Deseja usar alguma poção? (1-SIM), (2-NÃO)");
//    int escolha = input.nextInt();
//
//    if (escolha == 1) {
//      ArrayList<Consumivel> pocoes = new ArrayList<>();
//      for (ItemHeroi item : inventario) {
//        if (item instanceof Pocao) {
//          pocoes.add((Pocao) item);
//        }
//      }
//
//      if (pocoes.isEmpty()) {
//        System.out.println("Você não tem poções no inventário.");
//        return;
//      }
//
//      System.out.println("Qual poção deseja usar?");
//      for (int i = 0; i < pocoes.size(); i++) {
//        System.out.println((i + 1) + " - " + pocoes.get(i).getNome());
//      }
//
//      int escolhaPocao = input.nextInt();
//
//      if (escolhaPocao < 1 || escolhaPocao > pocoes.size()) {
//        System.out.println("Escolha inválida.");
//      } else {
//        Consumivel pocaoEscolhida = pocoes.get(escolhaPocao - 1);
////                aplicarEfeitoPocao(pocaoEscolhida);
//        inventario.remove(pocaoEscolhida);
//        System.out.println("Você usou " + pocaoEscolhida.getNome() + ".");
//      }
//    }
//  }

}
