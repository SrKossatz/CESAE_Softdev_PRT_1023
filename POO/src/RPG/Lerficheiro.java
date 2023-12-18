package RPG;

import RPG.Itens.Itens;

import java.util.ArrayList;
import java.util.Scanner;

public class Lerficheiro {

  private String caminho= "src/RPG/Ficheiro/ItensHeroiRPG.csv";

  public Lerficheiro() {
    this.caminho = caminho;
  }



  public ArrayList <Itens> itensDoFicheiro(){
    Scanner file = new Scanner(this.caminho);

   String linha=file.nextLine();
   ArrayList<Itens> arrayItens = new ArrayList<>();

    while (file.hasNextLine()){
      linha= file.nextLine();
      String[] linhaAtual = linha.split(";");
      String armaPrincipal =linhaAtual[0];
      String nomeDaArma =linhaAtual[1];
      int preco = Integer.parseInt(linhaAtual[2]);
      String [] splitHeroi =linhaAtual[3].split(",");
      int ataque = Integer.parseInt(linhaAtual[4]);
      int ataqueEspecial = Integer.parseInt(linhaAtual[5]);
      int ataqueInstantaneo = Integer.parseInt(linhaAtual[6]);
      int vida = Integer.parseInt(linhaAtual[7]);
      int forca = Integer.parseInt(linhaAtual[8]);

      Itens itemEscolhido = new Itens(armaPrincipal,nomeDaArma,preco,ataque,ataqueEspecial,ataqueInstantaneo,vida,forca);
      for (String heroiAtual : splitHeroi){
        itemEscolhido.adicionarHeroi(heroiAtual);
      }

      arrayItens.add(itemEscolhido);

    }



    return arrayItens;
  }

}
