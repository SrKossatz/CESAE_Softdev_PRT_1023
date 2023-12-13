package FichaPratica09Ex11;

public class Conta {
  private String numConta;
  private int saldo=0;
  private String titular;

  public Conta(String numConta, int saldo, String titular) {
    this.numConta = numConta;
    this.saldo = saldo;
    this.titular = titular;
  }

  public void exibirDetalhes(){
    System.out.println("Nome: "+this.numConta);
    System.out.println("saldo: "+this.saldo+ "€");
    System.out.println("titular: "+this.titular+"\n");
  }

  public void transferencia(Conta destinatario, double valor){
    if(this.saldo>=valor){ // Transferencia valida
      System.out.println("Dinheiro Transferido: "+valor);
      this.saldo-=valor;
      destinatario.saldo+=valor;
    }else{ // Transferencia invalida
      System.out.println("Vai trabalhar. Não tens esse dinheiro para transferir");
    }

  }

  public void depositar(int valor){
    this.saldo+=valor;
  }

  public void levantar(int valor) {
    if (valor>this.saldo){

      System.out.println("Operação não pode ser efetuada.");
      return;
    }
    if (valor==this.saldo){
      this.saldo-=valor;
      System.out.println("Operação efetuada.");

    }
  }
}
