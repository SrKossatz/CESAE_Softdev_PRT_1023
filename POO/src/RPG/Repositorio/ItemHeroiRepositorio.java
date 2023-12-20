package RPG.Repositorio;

import RPG.Itens.ItemHeroi;
import RPG.Tools.Lerficheiro;

import java.util.ArrayList;

public class ItemHeroiRepositorio {
    ArrayList<ItemHeroi> itemArray;

    public ItemHeroiRepositorio() {
        Lerficheiro lerficheiro = new Lerficheiro();
        this.itemArray=lerficheiro.itensDoFicheiro();
    }

    public ArrayList<ItemHeroi> getItemArray() {
        return itemArray;
    }
}
