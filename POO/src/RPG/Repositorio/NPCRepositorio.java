package RPG.Repositorio;
//Classe responsável por gerenciar os NPCs.
import RPG.Domain.Entidade.NPC;
import RPG.Tools.LerFicheiroNPC;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class NPCRepositorio {
  private ArrayList<NPC> arrayNPC;

  /**
   * Construtor inicializado com o ficheiro de NPC sendo atribuído a um arrayNPC
   * @throws FileNotFoundException
   */
  public NPCRepositorio() throws FileNotFoundException {
    LerFicheiroNPC ficheiroNPC = new LerFicheiroNPC();
    this.arrayNPC = ficheiroNPC.ficheiroNPC();
  }

  public ArrayList<NPC> getArrayNPC() {
    return arrayNPC;
  }
}
