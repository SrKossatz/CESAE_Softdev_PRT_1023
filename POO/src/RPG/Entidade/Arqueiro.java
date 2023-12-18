package RPG.Entidade;

import RPG.Itens.ArmaPrincipal;


public class Arqueiro extends Heroi{

  public Arqueiro(String nome, int vidaMax, int vidaAtual, int forca, int ouro) {
    super(nome, vidaMax, vidaAtual, forca, ouro);
  }

  @Override
  public void atacar(NPC npc) {
    super.atacar(npc);
  }

  @Override
  public void mostrarDetalhes() {

  }
}
