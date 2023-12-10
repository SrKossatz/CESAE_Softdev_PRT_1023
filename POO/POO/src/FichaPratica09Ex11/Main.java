package FichaPratica09Ex11;

public class Main {
  public static void main(String[] args) {
    Conta conta1=new Conta("123456",1000,"Kossatz");
    Conta conta2=new Conta("123456",500,"Mariana");


    conta2.levantar(1000);
    conta2.exibirDetalhes();

  }
}
