package RPG.Entidade;

import RPG.Consumivel;
import RPG.Entidade;
import NPC;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    private int ouro;
    private int nivel;

    private String armaprincipal; //ficheiro

    private ArrayList<Consumivel> inventario;


    public Heroi(String nome, int vidaMax, int vidaAtual, int forca) {
        super(nome, vidaMax, vidaAtual, forca);
    }

    @Override
    public void atacar(NPC npc) {
        System.out.println("");
    }
}
