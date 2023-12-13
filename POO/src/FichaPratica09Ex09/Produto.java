package FichaPratica09Ex09;

public class Produto {
  private String nome;
  private int preco;
  private int stock=0;

  public Produto(String nome, int preco, int stock) {
    this.nome = nome;
    this.preco = preco;
    this.stock = stock;
  }

  public void verificarStock(int quantidade){
    if (quantidade>this.stock){
      System.out.println("Não temos stock suficiente: "+this.stock);
    }else{
      this.stock-=quantidade;
    }
  }

  public void comprar(int quantidade) {
    this.stock += quantidade;
  }

  void exibirDetalhes(){
    System.out.println("Nome: "+this.nome+" | "+this.preco+" | "+this.stock);
  }
}



