package RPG.Entidade;


import RPG.Itens.ArmaPrincipal;

public class Barbaro extends Heroi{
  private int resistencia;
  private int ataqueFuria;

  public Barbaro(String nome, int vidaMax, int vidaAtual, int forca, int ouro, int nivel, ArmaPrincipal armaPrincipal, int resistencia, int ataqueFuria) {
    super(nome, vidaMax, vidaAtual, forca, ouro, nivel, armaPrincipal);
    this.resistencia = resistencia;
    this.ataqueFuria = ataqueFuria;
  }

  public int getResistencia() {
    return resistencia;
  }

  public int getAtaqueFuria() {
    return ataqueFuria;
  }

  @Override
  public void atacar(NPC npc) {
    super.atacar(npc);
  }

  @Override
  public void mostrarDetalhes() {

  }
}
