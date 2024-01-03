package RPG.Domain.Entidade;

import RPG.Domain.Itens.ItemHeroi;
import RPG.Repositorio.ItemHeroiRepositorio;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;

    /**
     * Construtor inicializado com um array de itens do repositório
     * @throws FileNotFoundException
     */
    public Vendedor() throws FileNotFoundException {
        ItemHeroiRepositorio repositorio = new ItemHeroiRepositorio();
        this.loja = repositorio.getItemArray();

    }

    public ArrayList<ItemHeroi> getLoja() {
        return loja;
    }
}
