package RPG.Tools;

import RPG.Domain.Itens.ArmaPrincipal;
import RPG.Domain.Itens.ConsumivelCombate;
import RPG.Domain.Itens.ItemHeroi;
import RPG.Domain.Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lerficheiro {

  private String caminho= "src/RPG/Ficheiro/ItensHeroiRPG.csv";

  public Lerficheiro() {
    this.caminho = caminho;
  }



  public ArrayList <ItemHeroi> itensDoFicheiro() throws FileNotFoundException {
    File file = new File(this.caminho);
    Scanner scanner = new Scanner(file);

   String linha=scanner.nextLine();
   ArrayList<ItemHeroi> arrayItens = new ArrayList<>();

    while (scanner.hasNextLine()){
      linha= scanner.nextLine();
      linha=linha.replace("[","");
      linha=linha.replace("]","");

      String[] linhaAtual = linha.split(";");
      String tipo =linhaAtual[0];
      String nome =linhaAtual[1];
      int preco = Integer.parseInt(linhaAtual[2]);

      String [] splitHeroi =linhaAtual[3].split(",");

      int ataque = Integer.parseInt(linhaAtual[4]);
      int ataqueEspecial = Integer.parseInt(linhaAtual[5]);
      int ataqueInstantaneo = Integer.parseInt(linhaAtual[6]);
      int vida = Integer.parseInt(linhaAtual[7]);
      int forca = Integer.parseInt(linhaAtual[8]);

      ItemHeroi itemHeroiAtual=null;

      switch (tipo){

        case "ArmaPrincipal":

          itemHeroiAtual= new ArmaPrincipal(nome,preco,ataque,ataqueEspecial);

          break;

        case "ConsumivelCombate":

          itemHeroiAtual= new ConsumivelCombate(nome,preco,ataqueInstantaneo);
          break;

        case "Pocao":

          itemHeroiAtual = new Pocao(nome,preco,vida,forca);

      }

      for (int i = 0; i < splitHeroi.length; i++) {
        itemHeroiAtual.adicionarHeroisPermitidos(splitHeroi[i]);
      }

      arrayItens.add(itemHeroiAtual);

    }

    return arrayItens;
  }

}
