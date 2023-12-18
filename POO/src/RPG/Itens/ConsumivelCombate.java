package RPG.Itens;



public class ConsumivelCombate extends Consumivel {
    private int ataqueInstantaneo;

    public ConsumivelCombate(String nome, int precoMoedasOuro, int ataqueInstantaneo, int ataqueInstantaneo1) {
        super(nome, precoMoedasOuro, ataqueInstantaneo);
        this.ataqueInstantaneo = ataqueInstantaneo1;
    }

    @Override
    public void mostrarDetalhes() {

    }
}
