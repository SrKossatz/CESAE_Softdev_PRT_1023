package RPG.Controller.EstrategiaAtaque;

import RPG.Domain.Entidade.Entidade;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;
import RPG.Domain.Itens.ConsumivelCombate;

import java.util.ArrayList;
import java.util.Scanner;

import static RPG.Controller.HeroiController.exibirConsumiveis;

public class Feiticeiro implements EstrategiaAtaque {

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
      double danoNPC = npc.getForca();

      switch (tipoDeAtaque) {
        case 1:
          // Ataque normal
          danoHeroi = heroi.getForca() + heroi.getArmaPrincipal().getAtaque();
          if (danoHeroi < npc.getVidaAtual()) {

            npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
            System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());

            if (danoNPC < heroi.getVidaAtual()) {
              heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
              System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano. Vida do herói agora é " + heroi.getVidaAtual());
            } else {
              System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano e venceu o combate!");
              return npc;
            }
          } else {
            System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
            return heroi;
          }
          break;
        case 2:
          // Ataque especial
          danoHeroi = heroi.getForca() + heroi.getArmaPrincipal().getAtaqueEspecial();
          if (danoHeroi < npc.getVidaAtual()) {

            npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
            System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());

            if (danoNPC < heroi.getVidaAtual()) {
              heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
              System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano. Vida do herói agora é " + heroi.getVidaAtual());
            } else {
              System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano e venceu o combate!");
              return npc;
            }
          } else {
            System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
            return heroi;
          }

          break;
        case 3:
          ArrayList<ConsumivelCombate> consumiveis = exibirConsumiveis(heroi);
          System.out.println("Escolha o consumível:");
          int escolha = input.nextInt();
          if (escolha > 0 && escolha <= consumiveis.size()) {

            for (ConsumivelCombate consumivelCombateAtual : consumiveis) {

              if (escolha == consumiveis.indexOf(consumivelCombateAtual) + 1) {
                danoHeroi = consumivelCombateAtual.getAtaqueInstantaneo();
                if (danoHeroi < npc.getVidaAtual()) {

                  npc.setVidaAtual(npc.getVidaAtual() - danoHeroi);
                  System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano. Vida do NPC agora é " + npc.getVidaAtual());

                  if (danoNPC < heroi.getVidaAtual()) {
                    heroi.setVidaAtual(heroi.getVidaAtual() - danoNPC);
                    System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano. Vida do herói agora é " + heroi.getVidaAtual());
                  } else {
                    System.out.println("NPC atacou o Feiticeiro causando " + danoNPC + " de dano e venceu o combate!");
                    return npc;
                  }
                } else {
                  System.out.println("O Feiticeiro atacou o NPC causando " + danoHeroi + " de dano e venceu o combate!");
                  return heroi;
                }
              }
            }

//
          } else {
            System.out.println("Escolha inválida.");

          }
          break;
        default:
          System.out.println("Tipo de ataque inválido. Escolha novamente.");

      }

    } while (heroi.getVidaAtual() > 0 && npc.getVidaAtual() > 0);

    return null;
  }

}

