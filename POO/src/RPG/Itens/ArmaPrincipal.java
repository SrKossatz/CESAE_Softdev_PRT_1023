package RPG.Itens;



public class ArmaPrincipal extends ItemHeroi {

  private int ataque;
  private int ataqueEspecial;

  public ArmaPrincipal(String nome, int precoMoedasOuro, int ataque, int ataqueEspecial) {
    super(nome, precoMoedasOuro);
    this.ataque = ataque;
    this.ataqueEspecial = ataqueEspecial;
  }

  @Override
  public void mostrarDetalhes() {

  }
}
