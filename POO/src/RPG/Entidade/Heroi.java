package RPG.Entidade;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.Consumivel;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public abstract class Heroi extends Entidade {
    private int ouro;
    private int nivel=0;

    private ArmaPrincipal armaPrincipal=null;

    private ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int vidaAtual, int forca, int ouro) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = ouro;
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
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja usar alguma poção? (1-SIM), (2-NÂO)");
        int sim = input.nextInt();
        if (sim == 1) {
            System.out.println("Qual pocão deseja usar?");
            System.out.println("(1-Vinho do porto), (2-Injeção de adrenalina)");
            System.out.println("");
        }
    }


    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ouro: "+this.ouro);
        System.out.println("Nível:"+this.nivel);


    }
}
