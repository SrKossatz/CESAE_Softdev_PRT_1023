package RPG.Controller;

import RPG.Domain.Itens.ItemHeroi;
import RPG.Repositorio.ItemHeroiRepositorio;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class VendedorController {
  private ArrayList<ItemHeroi> itens;

  public VendedorController() throws FileNotFoundException {
    ItemHeroiRepositorio repositorio = new ItemHeroiRepositorio();
    this.itens = repositorio.getItemArray();
  }

  public ArrayList<ItemHeroi> criarLoja(){
    ArrayList<ItemHeroi> loja = new ArrayList<>(10);
    ArrayList<Integer> auxiliar = new ArrayList<>(10);

    for (int i = 0; i < 10 ; i++) {
      int numeroRadom = new Random().nextInt(0, itens.size());
      if (!auxiliar.contains(numeroRadom)){
        auxiliar.add(numeroRadom);
        loja.add(itens.get(numeroRadom));
      }else{
        i--;
      }
    }
    return loja;
  }

  public void imprimirLoja(ArrayList<ItemHeroi> loja){
    int i=1;

    for(ItemHeroi itemHeroi: loja){
      System.out.print("\nOpção "+i++);
      itemHeroi.mostrarDetalhes();
    }
  }

}
