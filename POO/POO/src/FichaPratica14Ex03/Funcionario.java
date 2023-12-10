package FichaPratica14Ex03;

import FichaPratica14Ex03.Enum.Funcao;

public class Funcionario extends Pessoa {

private Funcao funcao;

  public Funcionario(String nome, int anoNascimento, String email, String telemovel, Funcao funcao) {
    super(nome, anoNascimento, email, telemovel);
    this.funcao = funcao;
  }

  @Override
  public void obterFuncao() {

  }

  @Override
  public void imprimirHorario() {

  }
}
