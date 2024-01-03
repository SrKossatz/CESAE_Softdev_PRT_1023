package RPG.Controller.EstrategiaAtaque;

import RPG.Domain.Entidade.Entidade;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;
import RPG.Domain.Itens.ConsumivelCombate;

import java.util.ArrayList;
import java.util.Scanner;

import static RPG.Controller.HeroiController.exibirConsumiveis;

public class Barbaro implements EstrategiaAtaque {

  /**
   * Método atacar sobrescrito para o NPC atacar primeiro e dar 80% de dano da sua força total
   *
   * @param heroi Extends de Entidade, herda seus atributos.
   * @param npc   Extends de Entidade, herda seus atributos.
   * @return Retorna o objeto que venceu o combate
   */
  @Override
  public Entidade atacar(Heroi heroi, NPC npc) {

    do {
      Scanner input = new Scanner(System.in);
      System.out.println("---Escolha o tipo de ataque---");
      System.out.println(" 1) Ataque normal");
      System.out.println(" 2) Ataque especial");
      System.out.println(" 3) Ataque consumível");

      int tipoDeAtaque = input.nextInt();
      double danoHeroi = 0;
      double danoNPC = npc.getForca() * 0.8;

      switch (tipoDeAtaque) {
        case 1:
          danoHeroi = heroi.getForca() + heroi.getArmaPrincipal().getAtaque();
          if (danoNPC < heroi.getVidaAtual()) {
            heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
            System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano. Vida do Bárbaro agora é " + heroi.getVidaAtual());

            if (danoHeroi < npc.getVidaAtual()) {
              npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
              System.out.println("O Bárbaro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());
            } else {
              System.out.println("o Bárbaro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
              return heroi;
            }
          } else {
            System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano e venceu o combate!");
            return npc;
          }
          break;
        case 2:
          danoHeroi = heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial();
          if (danoNPC < heroi.getVidaAtual()) {
            heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
            System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano. Vida do Bárbaro agora é " + heroi.getVidaAtual());

            if (danoHeroi < npc.getVidaAtual()) {
              npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
              System.out.println("O Bárbaro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());
            } else {
              System.out.println("O Bárbaro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
              return heroi;
            }
          } else {
            System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano e venceu o combate!");
            return npc;
          }
          break;
        case 3:
          ArrayList<ConsumivelCombate> consumiveis = exibirConsumiveis(heroi);
          System.out.println("Escolha o consumível:");
          int escolha = input.nextInt();
          danoHeroi = consumiveis.get(escolha-1).getAtaqueInstantaneo();
          if (escolha > 0 && escolha <= consumiveis.size()) {
//            heroi.usarPorcao();
            if (danoNPC < heroi.getVidaAtual()) {
              heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
              System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano. Vida do Bárbaro agora é " + heroi.getVidaAtual());

              if (danoHeroi < npc.getVidaAtual()) {
                npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
                System.out.println("O Bárbaro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());
              } else {
                System.out.println("O Bárbaro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
                return heroi;
              }
            } else {
              System.out.println("NPC atacou o Bárbaro causando " + danoNPC + " de dano e venceu o combate!");
              return npc;
            }
          }
          break;
        default:
          System.out.println("Tipo de ataque inválido. Escolha novamente.");
      }


    } while (heroi.getVidaAtual() > 0 && npc.getVidaAtual() > 0);

    return null;
  }
}
