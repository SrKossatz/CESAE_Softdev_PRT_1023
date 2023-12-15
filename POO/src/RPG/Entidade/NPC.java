package RPG.Entidade;

import RPG.Entidade;

public abstract class NPC extends Entidade {
    private int ouro;

    public NPC(String nome, int vidaMax, int vidaAtual, int forca, int ouro) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = ouro;
    }


}
