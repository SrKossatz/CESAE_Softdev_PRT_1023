package RPG.Itens;



public abstract class Consumivel extends ItemHeroi {

    private int ataqueInstantaneo;

    public Consumivel(String nome, int precoMoedasOuro, int ataqueInstantaneo) {
        super(nome, precoMoedasOuro);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }


}
