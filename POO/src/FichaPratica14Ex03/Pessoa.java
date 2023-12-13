package FichaPratica14Ex03;

public abstract class Pessoa {
  private String nome;
  private int anoNascimento;
  private String email;
  private String telemovel;

  public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
    this.nome = nome;
    this.anoNascimento = anoNascimento;
    this.email = email;
    this.telemovel = telemovel;
  }

  public abstract void obterFuncao();
  public abstract void imprimirHorario();

  public void exibirDetalhes(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Ano de nascimento: "+this.anoNascimento);
    System.out.println("E-mail: "+this.email);
    System.out.println("Telemóvel: "+this.telemovel);
  }
}
