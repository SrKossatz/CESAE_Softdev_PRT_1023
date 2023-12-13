package FichaPratica10Ex05;

public class Main {
  public static void main(String[] args) {
    Agenda minhaAgenda = new Agenda();

    Pessoa pessoa1= new Pessoa("Vitor",24,"vmvs007@gmail.com","911222333");
    Pessoa pessoa2= new Pessoa("Maria",30,"maria@gmail.com","922333444");
    Pessoa pessoa3 = new Pessoa("Cristiano Ronaldo", 39,"cr7@gmail.com","955666777");

    minhaAgenda.addPessoa(pessoa1);
    minhaAgenda.addPessoa(pessoa2);
    minhaAgenda.addPessoa(pessoa3);

    minhaAgenda.listarAgenda();
  }
}
