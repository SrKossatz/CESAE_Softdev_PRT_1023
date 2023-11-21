package Ficha09Ex11;

public class Conta {
    private String conta;
    private int saldo;
    private String titular;

    public Conta(String conta, int saldo, String titular) {
        this.conta = conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void exibirDados(){
        System.out.println("Conta: "+this.conta);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Titular: "+this.titular);
    }

    public void transferencia(Conta contaParaTransferir, double valor){
        if (saldo>=valor){
            saldo-=valor;
        }else {
            System.out.println("Transferencia não pode ser realizada.");
        }
    }

    public void depositar(int saldo){
        this.saldo+=saldo;

    }

    public void levantar(int saldo){
        if (saldo<=this.saldo){
        this.saldo-=saldo;
    }
}}
