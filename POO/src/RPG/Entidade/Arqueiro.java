package RPG.Entidade;

import RPG.Itens.ArmaPrincipal;


public class Arqueiro extends Heroi{
  private int agilidade;
  private int precisao;

  public Arqueiro(String nome, int vidaMax, int vidaAtual, int forca, int ouro, int nivel, ArmaPrincipal armaPrincipal, int agilidade, int precisao) {
    super(nome, vidaMax, vidaAtual, forca, ouro, nivel, armaPrincipal);
    this.agilidade = agilidade;
    this.precisao = precisao;
  }

  @Override
  public void atacar(NPC npc) {
    super.atacar(npc);
  }

  @Override
  public void mostrarDetalhes() {

  }
}
