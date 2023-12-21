package RPG;

import RPG.Controller.VendedorController;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Itens.ItemHeroi;
import RPG.Repositorio.ItemHeroiRepositorio;
import RPG.View.Jogo.Jogo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
//    Jogo jogo = new Jogo();
//    Heroi heroi = jogo.sombraDoDestino();
//    System.out.println("\n");
//    heroi.mostrarDetalhes();

    VendedorController controlador = new VendedorController();
    ArrayList<ItemHeroi> teste = controlador.criarLoja();

    controlador.imprimirLoja(teste);

//    ItemHeroiRepositorio repositorio = new ItemHeroiRepositorio();
//
//    ArrayList<ItemHeroi> arrayTeste = repositorio.getItemArray();
//    for(ItemHeroi itemAtual : arrayTeste){
//      itemAtual.mostrarDetalhes();
//    }



  }


}
