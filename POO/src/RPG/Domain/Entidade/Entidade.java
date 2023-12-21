package RPG.Domain.Entidade;

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

    public String getNome() {
        return nome;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getForca() {
        return forca;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Nome: "+this.vidaMax);
        System.out.println("Nome: "+this.vidaAtual);
        System.out.println("Nome: "+this.forca);
    }
}
