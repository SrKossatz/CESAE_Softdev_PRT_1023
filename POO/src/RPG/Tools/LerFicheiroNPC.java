package RPG.Tools;

import RPG.Domain.Entidade.NPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerFicheiroNPC {
  private String caminho = "src/RPG/Ficheiro/NPC.csv";

  public LerFicheiroNPC() {
    this.caminho = caminho;
  }

  /**
   * Método criado para ler o ficheiro de NPC, e criar uma nova instância de NPC com base nos dados lidos do ficheiro.
   * @return ArrayList de NPC.
   * @throws FileNotFoundException
   */
  public ArrayList<NPC> ficheiroNPC() throws FileNotFoundException {
    File file = new File(this.caminho);
    Scanner scanner = new Scanner(file);

    String linha = scanner.nextLine();
    ArrayList<NPC> arrayNPC = new ArrayList<>();

    while (scanner.hasNextLine()) {
      linha = scanner.nextLine();

      String[] linhaAtual = linha.split(";");

      String nome = linhaAtual[0];
      int vidaAtual = Integer.parseInt(linhaAtual[1]);
      int forca = Integer.parseInt(linhaAtual[2]);

      int ouro = Integer.parseInt(linhaAtual[4]);
      int sala = Integer.parseInt(linhaAtual[5]);

      NPC npc = new NPC(nome, vidaAtual, vidaAtual, forca, ouro, sala);
      arrayNPC.add(npc);

    }

    return arrayNPC;
  }
}
