package FichaPratica12Ex01;

import FichaPratica12Ex01.Enums.Categoria;
import FichaPratica12Ex01.Enums.Instalacoes;

import java.util.ArrayList;

public class JatosParticulares extends Aviao {
  private int lotacão;
  private double capacidadeBag;
  private Categoria categoria;
  private ArrayList<Instalacoes> instalacoes;

  public JatosParticulares(int numeroSerie, String modelo, int anofabrico, double peso, double comprFuselagem, double envergadura, double alturaCalda, int numeroMotores, double autonomia, double velocidadeMax, double preco, int lotacão, double capacidadeBag, Categoria categoria) {
    super(numeroSerie, modelo, anofabrico, peso, comprFuselagem, envergadura, alturaCalda, numeroMotores, autonomia, velocidadeMax, preco);
    this.lotacão = lotacão;
    this.capacidadeBag = capacidadeBag;
    this.categoria = categoria;
    this.instalacoes = new ArrayList<Instalacoes>();
  }

  public void addInstalacoes(Instalacoes novaInstalacao){
    instalacoes.add(novaInstalacao);
  }

  public void removerInstalacoes(Instalacoes instalacao){
    instalacoes.remove(instalacao);
  }

  @Override
  public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Lotação: "+this.lotacão);
    System.out.println("Capacidade de bagagem: "+this.capacidadeBag);
    System.out.println("categoria: "+this.categoria);
    System.out.println("instalações: "+this.instalacoes);
  }
}
