package RPG.Domain.Entidade;

import RPG.Controller.EstrategiaAtaque.EstrategiaAtaque;
import RPG.Domain.Itens.ArmaPrincipal;
import RPG.Domain.Itens.Consumivel;
import RPG.Domain.Itens.ItemHeroi;
import RPG.Domain.Itens.Pocao;


import java.util.ArrayList;
import java.util.Scanner;

public class Heroi extends Entidade {
    private int ouro;
    private int nivel=0;

    private ArmaPrincipal armaPrincipal=null;

    private ArrayList<Consumivel> inventario;

    private EstrategiaAtaque estrategiaAtaque;

    private boolean fim = false;

    public Heroi(String nome, double vidaMax, double vidaAtual, double forca, ArmaPrincipal armaPrincipal, EstrategiaAtaque estrategiaAtaque) {
        super(nome, vidaMax, vidaAtual, forca);
        this.ouro = 0;
        this.nivel = 1;
        this.armaPrincipal = armaPrincipal;
        this.inventario = new ArrayList<>();
        this.estrategiaAtaque = estrategiaAtaque;

    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setInventario(ArrayList<Consumivel> inventario) {
        this.inventario = inventario;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public int getOuro() {
        return ouro;
    }

    public int getNivel() {
        return nivel;
    }

    public EstrategiaAtaque getEstrategiaAtaque() {
        return estrategiaAtaque;
    }
    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    /**
     * Método que permite a escolha do jogador ,usar uma poção de seu inventário. Exibe apenas poções disponíveis.
     *
     */
    public void usarPorcao() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja usar alguma poção? (1-SIM), (2-NÃO)");
        int escolha = input.nextInt();

        if (escolha == 1) {
            ArrayList<Consumivel> pocoes = new ArrayList<>();
            for (ItemHeroi item : inventario) {
                if (item instanceof Pocao) {
                    pocoes.add((Pocao) item);
                }
            }

            if (pocoes.isEmpty()) {
                System.out.println("Você não tem poções no inventário.");
                return;
            }

            System.out.println("Qual poção deseja usar?");
            for (int i = 0; i < pocoes.size(); i++) {
                System.out.println((i + 1) + " - " + pocoes.get(i).getNome());
            }

            int escolhaPocao = input.nextInt();

            if (escolhaPocao < 1 || escolhaPocao > pocoes.size()) {
                System.out.println("Escolha inválida.");
            } else {
                Consumivel pocaoEscolhida = pocoes.get(escolhaPocao - 1);
//                aplicarEfeitoPocao(pocaoEscolhida);
                inventario.remove(pocaoEscolhida);
                System.out.println("Você usou " + pocaoEscolhida.getNome() + ".");
            }
        }
    }


    @Override
    public void mostrarDetalhes() {
        System.out.println("\n------------- Detalhes do Herói -------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Vida Máxima: "+this.getVidaMax());
        System.out.println("Vida Atual: "+this.getVidaAtual());
        System.out.println("Força: "+this.getForca());
        System.out.println("Ouro: "+this.ouro);
        System.out.println("Nível:"+this.nivel);


    }

    public void adicionarItem(ItemHeroi item) {
        this.inventario.add((Consumivel) item);
    }
}
