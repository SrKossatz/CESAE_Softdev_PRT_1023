package RPG.Itens;



public class Pocao extends Consumivel {
    private int vidaACurar;
    private int aumentoDeForca;

    public Pocao(String nome, int precoMoedasOuro, int ataqueInstantaneo, int vidaACurar, int aumentoDeForca) {
        super(nome, precoMoedasOuro, ataqueInstantaneo);
        this.vidaACurar = vidaACurar;
        this.aumentoDeForca = aumentoDeForca;
    }

    @Override
    public void mostrarDetalhes() {

    }
}
