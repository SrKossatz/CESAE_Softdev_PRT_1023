package FichaPratica14Ex03;

public class Aluno extends Pessoa {
  private Curso curso;

  private double mediaNotas;

  private String [][] pauta;

  public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas) {
    super(nome, anoNascimento, email, telemovel);
    this.curso = curso;
    this.mediaNotas = mediaNotas;
//    this.pauta = String[][];
  }

  @Override
  public void obterFuncao() {

  }

  @Override
  public void imprimirHorario() {

  }
}
