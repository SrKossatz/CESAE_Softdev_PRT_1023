package FichaPratica10Ex05;

public class Agenda {
  private Pessoa[] agenda;//criação de um array de objeto para fácil manipulação dentro do cliclo for.

  /**
   * Construtor agenda inicializado para definir o tamanho do array em 100.
   */
  public Agenda() {
    this.agenda = new Pessoa[100];

  }

  /**
   * Método criado para adicionar pessoa a um array de objetos. A condição IF verifica se há espaço vazio e adiciona uma pessoa nova ao array caso haja.
   * @param pessoaNova Objeto criado a partir da instância do construtor
   */
  public void addPessoa(Pessoa pessoaNova){
    for(int i =0; i<this.agenda.length;i++){
      if(this.agenda[i]==null){
        this.agenda[i]= pessoaNova;
        return;
      }
    }
  }


  /**
   * Método criado para exibir os detalhes de cada objeto dentro da agenda. O ciclo FOR corre toto o array e caso esteja preenchido chama o método exibirDetalhes para mostrar os dados.
   *
   */
  public void listarAgenda(){
    System.out.println("==Agenda==");
    for(int i =0;i<this.agenda.length;i++){
      if(this.agenda[i]!=null){
        this.agenda[i].exibirDetalhes();
      }
    }
    System.out.println("==FIM==");
  }





}
