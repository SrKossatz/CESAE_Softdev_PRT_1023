package FichaPratica10Ex02;

import javax.sound.midi.Soundbank;

public class Conta {
private String numConta;
private double saldo;
private String titular;
private String AnoAbertura="2023";
private double margemEmprestimo=0.9;
private double valorEmDivida;

  public Conta(String numConta, double saldo, String titular) {
    this.numConta = numConta;
    this.saldo = saldo;
    this.titular = titular;
  }

  /**
   * Método para pedir empréstimo
   * @param valor Valor solicitado.
   * @return Se foi ou não aprovado
   */
  public boolean pedirEmprestimo(double valor) {

    if (this.valorEmDivida > 0.0) {
      System.out.println("Você já possui uma dívida. Não pode fazer empréstimo.");
      return false;
    }

    // Verifica se o valor do empréstimo é menor ou igual à margem disponível.
    if (valor <= this.margemEmprestimo*this.saldo) {
      this.saldo += valor;
      this.valorEmDivida = valor;
      System.out.println("Empréstimo de " + valor + "€ aprovado!");
      return true;
    } else {
      System.out.println("Valor de empréstimo superior à margem disponível.");
      return false;
    }
  }

  public void exibirDetalhes(){
    System.out.println("Atualização de conta corrente:");
    System.out.println("Titular: "+this.titular);
    System.out.println("Número da conta: "+this.numConta);
    System.out.println("Saldo atual: "+this.saldo);

  }

}



