package FichaPratica14Ex03;

import FichaPratica14Ex03.Enum.Areaformacao;

import java.util.ArrayList;

public class Professor extends Pessoa {

  private int nivelAcademico;
  private ArrayList<Areaformacao> areaFormacao;

  public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
    super(nome, anoNascimento, email, telemovel);
    this.nivelAcademico = nivelAcademico;
    this.areaFormacao = new ArrayList<Areaformacao>();
  }


  @Override
  public void obterFuncao() {

  }

  @Override
  public void imprimirHorario() {

  }
}
