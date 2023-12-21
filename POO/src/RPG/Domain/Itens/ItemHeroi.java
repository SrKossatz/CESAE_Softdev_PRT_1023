package RPG.Domain.Itens;

import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nome;
    private int precoMoedasOuro;

    private ArrayList<String> heroisPermitidos;

    public ItemHeroi(String nome, int precoMoedasOuro) {
        this.nome = nome;
        this.precoMoedasOuro = precoMoedasOuro;
        this.heroisPermitidos=new ArrayList<>();
    }

    public void mostrarDetalhes(){

        System.out.println("\nNome: "+this.nome);
        System.out.println("precoMoedas: "+this.precoMoedasOuro);
        System.out.println("heroisPermitidos: "+this.heroisPermitidos);
    }

    public void adicionarHeroisPermitidos(String heroi){
        heroisPermitidos.add(heroi);
    }


}
