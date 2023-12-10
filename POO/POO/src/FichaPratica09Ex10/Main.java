package FichaPratica09Ex10;

public class Main {
  public static void main(String[] args) {
    Funcionario kossatz = new Funcionario("Kossatz.", 20, "Formação");


    kossatz.exibirDetalhes();

    kossatz.aumentarSalario(100);

    kossatz.exibirDetalhes();
  }
}
