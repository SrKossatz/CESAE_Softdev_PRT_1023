package RPG.Entidade;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;



import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    private int ouro;
    private int nivel;

    private ArmaPrincipal armaPrincipal;

    private ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int vidaAtual, int forca, int ouro, int nivel, ArmaPrincipal armaPrincipal) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = ouro;
        this.nivel = nivel;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();
    }

    public int getOuro() {
        return ouro;
    }

    public int getNivel() {
        return nivel;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    public void atacar(NPC npc) {
        System.out.println("");
    }

    public static void usarPorcao() {
        System.out.println("");
    }



}
