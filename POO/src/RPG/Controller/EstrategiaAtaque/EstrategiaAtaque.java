package RPG.Controller.EstrategiaAtaque;
import RPG.Domain.Entidade.Entidade;
import RPG.Domain.Entidade.Heroi;
import RPG.Domain.Entidade.NPC;

public interface EstrategiaAtaque {


  /**
   * Método Strategy pattern
   * @param heroi
   * @param npc
   * @return
   */
  Entidade atacar(Heroi heroi, NPC npc);
}
