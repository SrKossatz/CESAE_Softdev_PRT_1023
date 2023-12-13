package FichaPratica10Ex01;

import java.security.PublicKey;

public class Carro {
  private String marca;
  private String modelo;
  private int anoFabrico;
  private int potencia;
  private double cilindrada;
  private TipoDeCombustivel tipoDeCombustivel;

  public Carro(String marca, String modelo, int ano, int potencia, double cilindrada, TipoDeCombustivel tipoDeCombustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.anoFabrico = ano;
    this.potencia = potencia;
    this.cilindrada = cilindrada;
    this.tipoDeCombustivel = tipoDeCombustivel;
  }

  public void ligar(int anoFabrico){
    int idadeAtual = 2023 - this.anoFabrico;

    if (idadeAtual > 30) { // Mais de 30 anos

      if (this.tipoDeCombustivel.equals(tipoDeCombustivel.DIESEL)) { // Carro a diesel
        System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
        System.out.println("Vrum-vrum-vrum");
      } else { // Carro não diesel
        System.out.println("Custa a pegar... O carro está ligado!");
        System.out.println("Vrum-vrum-vrum");
      }

    } else { // 30 anos ou mais recente

      if (this.potencia < 250) { // Menos de 250 cavalos
        System.out.println("O carro está ligado!");
        System.out.println("Vrummmmmmmmmmmmmmmmmmm");
      } else { // 250 ou mais cavalos
        System.out.println("O carro está ligado!");
        System.out.println("VRUMMMMMMMMMMMMMMMMMMMM");
      }

    }
  }

  /**
   * Método criado para retorar um objeto
   * @param adversario Objeto carro
   * @return Objeto Carro vencedor
   */
  public Carro corrida(Carro adversario){
    if (this.potencia>adversario.potencia){
      System.out.println("Carro vencedor: "+this.marca);
      return this;
    }else if(this.potencia<adversario.potencia) {
      System.out.println("Carro vencedor: "+adversario.marca);
      return adversario;
    }else if (this.cilindrada> adversario.cilindrada){
      return this;
    } else if (this.cilindrada<adversario.cilindrada) {
      return adversario;
    } else if (this.anoFabrico> adversario.anoFabrico) {
      return this;
    } else if (this.anoFabrico<adversario.anoFabrico) {
      return adversario;
    }

    return null;

  }

  public void exibirDetalhes(){
    System.out.println(this.marca);
    System.out.println(this.modelo);
    System.out.println("Ano: "+this.anoFabrico);
    System.out.println("Potencia: "+ this.potencia+ " cv.");
    System.out.println("Cilindrada: "+this.cilindrada+" cc.");
    System.out.println(this.tipoDeCombustivel);
  }

  public double consumoKmL(double distacia){
    double mediaConsumo= 15; // 10kmL
    double consumo = distacia/mediaConsumo;
    System.out.println("Consumo de: "+consumo);
    return consumo;
  }


}
