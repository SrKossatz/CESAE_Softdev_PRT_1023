package RPG;

// Vida MAX = 100
// Vida Mínima = 0

public abstract class Entidade {
    private String  nome;
    private int vidaMax=100;
    private int vidaAtual=100;
    private int forca=100;

    public Entidade(String nome, int vidaMax, int vidaAtual, int forca) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaAtual;
        this.forca = forca;
    }

    public abstract void atacar(NPC npc);

    public abstract void mostrarDetalhes();
}
