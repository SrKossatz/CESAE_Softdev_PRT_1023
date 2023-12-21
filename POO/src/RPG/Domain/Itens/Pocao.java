package RPG.Domain.Itens;



public class Pocao extends Consumivel {
    private int vidaACurar;
    private int aumentoDeForca;

    public Pocao(String nome, int precoMoedasOuro, int vidaACurar, int aumentoDeForca) {
        super(nome, precoMoedasOuro);
        this.vidaACurar = vidaACurar;
        this.aumentoDeForca = aumentoDeForca;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Vida a Curar: "+this.vidaACurar);
        System.out.println("Aumento de Força : "+this.aumentoDeForca);
    }
}
