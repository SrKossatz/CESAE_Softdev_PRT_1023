package RPG.Entidade;

import RPG.Itens.ItemHeroi;
import RPG.Repositorio.ItemHeroiRepositorio;


import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;

    public Vendedor() {
        ItemHeroiRepositorio repositorio = new ItemHeroiRepositorio();
        this.loja = repositorio.getItemArray();
    }

    public void imprimirLoja(){
        System.out.println("");
    }

//    public void vender(Heroi heroi){
//        System.out.println("");
//    }
}
