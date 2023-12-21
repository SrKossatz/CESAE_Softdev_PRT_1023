package RPG.Domain.Itens;



public class ConsumivelCombate extends Consumivel {

    private int ataqueInstantaneo;

    public ConsumivelCombate(String nome, int precoMoedasOuro, int ataqueInstantaneo) {
        super(nome, precoMoedasOuro);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ataque Instantâneo: "+this.ataqueInstantaneo);
    }
}
