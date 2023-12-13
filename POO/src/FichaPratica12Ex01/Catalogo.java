package FichaPratica12Ex01;

import java.util.ArrayList;

public class Catalogo{
  private ArrayList<Aviao> catalogo;

  public Catalogo() {
    this.catalogo = new ArrayList<Aviao>();
  }

  public void comprarAviao(Aviao novoAviao){
    catalogo.add(novoAviao);
  }

  public void venderAviao(Aviao aviao){
    catalogo.remove(aviao);
    System.out.println("O avião foi vendido.");
  }

  public double calcularTotal(){
    double total=0;

    for (Aviao aviaoAtual : this.catalogo){
      total+=aviaoAtual.getPreco();
    }

    return total;
  }

  public void listarCatalogo(){
    for (Aviao aviaoAtual : this.catalogo){
      aviaoAtual.exibirDetalhes();
      System.out.println();
    }
  }

}
