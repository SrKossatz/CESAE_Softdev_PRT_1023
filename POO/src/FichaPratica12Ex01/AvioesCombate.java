package FichaPratica12Ex01;

import FichaPratica12Ex01.Enums.Armas;

import java.util.ArrayList;

public class AvioesCombate extends Aviao {
  private String paisDeOrigem;
  private boolean camuflagem;

  private ArrayList<Armas> arsenal;

  public AvioesCombate(int numeroSerie, String modelo, int anofabrico, double peso, double comprFuselagem, double envergadura, double alturaCalda, int numeroMotores, double autonomia, double velocidadeMax, double preco, String paisDeOrigem, boolean camuflagem) {
    super(numeroSerie, modelo, anofabrico, peso, comprFuselagem, envergadura, alturaCalda, numeroMotores, autonomia, velocidadeMax, preco);
    this.paisDeOrigem = paisDeOrigem;
    this.camuflagem = camuflagem;
    this.arsenal = new ArrayList<Armas>(3);
  }

  public void addArmas(Armas armamento){
    if (arsenal.size()<3){
      arsenal.add(armamento);
    }

  }

  public void removerArmas(Armas armamento){
    arsenal.remove(armamento);
  }

  public void exibirDestalhes(){
    System.out.println("Arsenal: "+this.arsenal);
  }


  @Override
  public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Pais de origem: "+this.paisDeOrigem);
    System.out.println("Camuflagem: "+this.camuflagem);
    System.out.println("arsenal: "+this.arsenal);
  }
}
