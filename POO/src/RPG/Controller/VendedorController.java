package RPG.Controller;

import RPG.Controller.EstrategiaAtaque.Arqueiro;
import RPG.Controller.EstrategiaAtaque.Barbaro;
import RPG.Controller.EstrategiaAtaque.Feiticeiro;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.Vendedor;
import RPG.Domain.Itens.ArmaPrincipal;
import RPG.Domain.Itens.ItemHeroi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VendedorController {

  /**
   * Método construtor
   */
  public VendedorController() {

  }

  /**
   * Método de criação da loja. Utiliza um loop FOR para selecionar aleatóriamente 10 itens.
   *
   * @return loja com os 10 itens únicos.
   */
  public ArrayList<ItemHeroi> criarLoja(ArrayList<ItemHeroi> itens) {
    ArrayList<ItemHeroi> loja = new ArrayList<>(10);
    ArrayList<Integer> auxiliar = new ArrayList<>(10);

    for (int i = 0; i < 10; i++) {
      int numeroRadom = new Random().nextInt(0, itens.size());
      if (!auxiliar.contains(numeroRadom)) {
        auxiliar.add(numeroRadom);
        loja.add(itens.get(numeroRadom));
      } else {
        i--;
      }
    }
    return loja;
  }

  /**
   * Método que exibe os itens disponíveis para compra e permite a seleção e venda do item.
   *
   * @param loja
   * @param heroi
   */
  public void imprimirLoja(Vendedor vendedor, Heroi heroi) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nAntes de seguir para o caminho escolhido você se encontra com um vendedor.");
    System.out.println("Aproveite e veja se tem algo que te interessa na loja;");
    int i = 1;

    ArrayList<ItemHeroi> itensNaLoja = criarLoja(vendedor.getLoja());

    int itemComprado = 0;
    do {
      for (ItemHeroi itemHeroi : itensNaLoja) {
        System.out.print("\nOpção " + i++);
        itemHeroi.mostrarDetalhes();
      }
      i=1;
      do {
        System.out.println("Qual item deseja comprar? (Digite 0 para sair)");
        itemComprado = input.nextInt();

        if (itemComprado < 0 || itemComprado > itensNaLoja.size()) {
          System.out.println("Escolha inválida. Tente novamente.");
        }
      } while (itemComprado < 0 || itemComprado > itensNaLoja.size());



      if (itemComprado > 0) {
        venderItem(itemComprado, itensNaLoja, heroi, vendedor);
      }

      System.out.println("Digite 0 para sair da loja ou qualquer outro número para continuar a comprar");
      itemComprado = input.nextInt();
    }while (itemComprado!=0);


  }


  /**
   * Método de venda de itens a partir do arrayList ItemHeroi.
   *
   * @param index
   * @param itens
   * @param heroi
   */
  public void venderItem(int index, ArrayList<ItemHeroi> itens, Heroi heroi, Vendedor vendedor) {
    index--;

    String classeHeroi = "";
    if (heroi.getEstrategiaAtaque() instanceof Barbaro) {
      classeHeroi = "Barbaro";
    } else if (heroi.getEstrategiaAtaque() instanceof Arqueiro) {
      classeHeroi = "Arqueiro";
    }
    if (heroi.getEstrategiaAtaque() instanceof Feiticeiro) {
      classeHeroi = "Feiticeiro";
    }

    ItemHeroi item = itens.get(index);

    System.out.println(item.getNome());
    if (heroi.getOuro() >= item.getPrecoMoedasOuro()) {

      if (item instanceof ArmaPrincipal && item.getHeroisPermitidos().contains(classeHeroi)) {
        heroi.setArmaPrincipal((ArmaPrincipal) item);
        heroi.setOuro(heroi.getOuro() - item.getPrecoMoedasOuro());
        vendedor.getLoja().remove(itens.get(index));
        itens.remove(index);
      } else if (item instanceof ArmaPrincipal && !item.getHeroisPermitidos().contains(classeHeroi)) {
        System.out.println("Seu heroi não pode usar esse item");
      } else {


        heroi.setOuro(heroi.getOuro() - item.getPrecoMoedasOuro());
        heroi.adicionarItem(item);
        vendedor.getLoja().remove(itens.get(index));
        itens.remove(index);
        System.out.println("Item comprado com sucesso");
      }

      } else{
      System.out.println("Você não tem ouro suficiente");
    }


  }

}
