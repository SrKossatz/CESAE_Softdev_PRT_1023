package FichaPratica10Ex02;

public class Main {
  public static void main(String[] args) {
    Conta conta1 = new Conta("123456",1000,"Átylla Kossatz");
    Conta conta2 = new Conta("654321",500,"Mariana Kossatz");

    conta1.pedirEmprestimo(800);
    conta1.exibirDetalhes();
    conta1.pedirEmprestimo(800);
    conta1.exibirDetalhes();

  }
}
