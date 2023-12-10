package FichaPratica09Ex09;

public class Main {
  public static void main(String[] args) {
    Produto pc = new Produto("Computador",1500,10);
    Produto camisa = new Produto("camisa",20,5);
    Produto sabonete = new Produto("Sabonete",2,20);

    pc.verificarStock(5);
    pc.exibirDetalhes();
    pc.verificarStock(10);
    pc.exibirDetalhes();
    pc.comprar(10);
    pc.exibirDetalhes();

  }
}
