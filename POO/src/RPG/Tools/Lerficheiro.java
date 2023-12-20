package RPG.Tools;

import RPG.Itens.ArmaPrincipal;
import RPG.Itens.ConsumivelCombate;
import RPG.Itens.ItemHeroi;
import RPG.Itens.Pocao;

import java.util.ArrayList;
import java.util.Scanner;

public class Lerficheiro {

  private String caminho= "src/RPG/Ficheiro/ItensHeroiRPG.csv";

  public Lerficheiro() {
    this.caminho = caminho;
  }



  public ArrayList <ItemHeroi> itensDoFicheiro(){
    Scanner file = new Scanner(this.caminho);

   String linha=file.nextLine();
   ArrayList<ItemHeroi> arrayItens = new ArrayList<>();

    while (file.hasNextLine()){
      linha= file.nextLine();
      linha.replace("[","");
      linha.replace("]","");

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

          itemHeroiAtual = new Pocao(nome,preco,ataqueInstantaneo,vida,forca);

      }

      arrayItens.add(itemHeroiAtual);

    }

    return arrayItens;
  }

}
