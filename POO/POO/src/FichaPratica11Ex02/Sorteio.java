package FichaPratica11Ex02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
  private double premio;
  private ArrayList<Pessoa> participantes;

  /**
   * Método construtor
   * @param premio
   */
  public Sorteio(double premio) {
    this.premio = premio;
    this.participantes = new ArrayList<>();
  }

  public void addParticipante(Pessoa novoParticipante) {
    if (novoParticipante.getIdade() > 18) {
      this.participantes.add(novoParticipante);
    } else {

      System.out.println("Essa pessoa não pode competir pois tem menos que 18 anos; "+novoParticipante.getNome());
    }
  }

  public Pessoa sorteio(){
    Random random = new Random();

    int indexVencedor;

    indexVencedor=random.nextInt(0,this.participantes.size());

    return this.participantes.get(indexVencedor);
  }

  public void imprimirListaParticipantes() {
    int contador = 1;

    System.out.println("***** Lista de Participantes *****");
    for (Pessoa pessoaAtual : this.participantes) {
      System.out.print("Participante " + contador++ + ": ");
      pessoaAtual.exibirDetalhes();
    }

  }
}
