package RPG.Entidade;

public class NPC extends Entidade {
    private int ouro;

    public NPC(String nome, int vidaMax, int vidaAtual, int forca, int ouro) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = ouro;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do NPC: ");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Vida atual: "+this.getVidaAtual());
        System.out.println("Força: "+this.getForca());
        System.out.println("Ouro: "+this.ouro);
    }
}