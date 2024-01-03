package RPG.Domain.Entidade;

public class NPC extends Entidade {
    private int ouro;
    private int sala;

    public NPC(String nome, double vidaMax, double vidaAtual, double forca, int ouro, int sala) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = ouro;
        this.sala = sala;
    }

    public int getSala() {
        return sala;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }



    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do NPC: ");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Vida atual: "+this.getVidaAtual());
        System.out.println("Força: "+this.getForca());
        System.out.println("Ouro: "+this.ouro);
        System.out.println("Sala: "+this.sala);

    }


}
