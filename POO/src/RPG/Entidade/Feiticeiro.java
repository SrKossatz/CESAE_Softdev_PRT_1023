package RPG.Entidade;

import RPG.Itens.ArmaPrincipal;


public class Feiticeiro extends Heroi{
  private int mana;
  private int inteligencia;

  public Feiticeiro(String nome, int vidaMax, int vidaAtual, int forca, int ouro, int nivel, ArmaPrincipal armaPrincipal, int mana, int inteligencia) {
    super(nome, vidaMax, vidaAtual, forca, ouro, nivel, armaPrincipal);
    this.mana = mana;
    this.inteligencia = inteligencia;
  }

  @Override
  public void atacar(NPC npc) {
    super.atacar(npc);
  }

  @Override
  public void mostrarDetalhes() {

  }
}
