package RPG.Repositorio;

import RPG.Domain.Itens.ItemHeroi;
import RPG.Tools.Lerficheiro;

import java.io.FileNotFoundException;
import java.util.ArrayList;

//Repositório contém as linhas do Array em forma de Objeto. Cada linha é um objeto diferente.
//Classe que gerência itens do Heroi.

public class ItemHeroiRepositorio {
  private ArrayList<ItemHeroi> itemArray;

  /**
   * Método itensDoFicheiro chamado para preencher o itemArray com itens.
   * @throws FileNotFoundException
   */
  public ItemHeroiRepositorio() throws FileNotFoundException {
    Lerficheiro lerficheiro = new Lerficheiro();
    this.itemArray = lerficheiro.itensDoFicheiro();
  }

  public ArrayList<ItemHeroi> getItemArray() {
    return itemArray;
  }
}
