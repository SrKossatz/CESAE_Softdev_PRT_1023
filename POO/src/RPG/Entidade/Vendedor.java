package RPG.Entidade;

import RPG.Itens.ItemHeroi;


import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;

    public Vendedor() {
        this.loja = new ArrayList<>();
    }

    public void imprimirLoja(){
        System.out.println("");
    }

//    public void vender(Heroi heroi){
//        System.out.println("");
//    }
}
