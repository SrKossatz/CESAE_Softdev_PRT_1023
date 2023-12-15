package RPG.Itens;

import RPG.Enums.TipoDeHeroi;

import java.security.PrivilegedAction;
import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nome;
    private int precoMoedasOuro;

    private ArrayList<TipoDeHeroi> heroisPermitidos;

    public ItemHeroi(String nome, int precoMoedasOuro) {
        this.nome = nome;
        this.precoMoedasOuro = precoMoedasOuro;
        this.heroisPermitidos=new ArrayList<>();
    }
}
