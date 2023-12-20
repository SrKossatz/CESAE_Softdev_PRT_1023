package RPG.Itens;



public class ConsumivelCombate extends Consumivel {

    private int AtaqueInstantaneo;

    public ConsumivelCombate(String nome, int precoMoedasOuro, int ataqueInstantaneo) {
        super(nome, precoMoedasOuro);
        AtaqueInstantaneo = ataqueInstantaneo;
    }

    @Override
    public void mostrarDetalhes() {

    }
}
