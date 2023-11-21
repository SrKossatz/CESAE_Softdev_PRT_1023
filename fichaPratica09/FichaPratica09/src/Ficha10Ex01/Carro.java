package Ficha10Ex01;

import javax.sound.midi.Soundbank;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private int litros;
    private TipoDeCombustivel tipoDeCombustivel;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, int litros, TipoDeCombustivel tipoDeCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.litros = litros;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public void exibirDetalhes(){

        System.out.println("Marca: "+this.marca);
        System.out.println("Ano de fabrico: "+this.ano);
        System.out.println("Potência: "+this.potencia+"cv");
        System.out.println("Cilindrada: "+this.cilindrada+"cc");

    }

    public void ligar(){

        int anoAtual=2023;

        if (anoAtual-this.ano<30){
            if (this.potencia>=250){
                System.out.println("Barulho ao ligar VRUMMMMMM");
            }else{
                System.out.println("Barulho ao ligar vrummmmmm");
            }

        }

        if (anoAtual-this.ano>30){
            if (TipoDeCombustivel.DIESEL.equals(this.tipoDeCombustivel)){
                System.out.println("Deita um pouco de fumo... O carro está ligado. Vrumm vrumm vrumm");
            }
            if (TipoDeCombustivel.GASOLINA.equals(this.tipoDeCombustivel)){
                System.out.println("Custa a pegar... O carro está ligado.. Vrum vrum vrum");
            }
        }

    }

    public void corrida(Carro adversario){
        if (this.potencia>adversario.potencia){
            System.out.println("Carro vencedor: ");
        }

    }




}
