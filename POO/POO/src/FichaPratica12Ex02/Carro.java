package FichaPratica12Ex02;

public class Carro extends Veiculo{
  public int quantidadeDePassageiros;

  public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, TipoDeCombustivel tipoDeCombustivel, double consumo, int quantidadeDePassageiros) {
    super(marca, modelo, anoFabrico, potencia, cilindrada, tipoDeCombustivel, consumo);
    this.quantidadeDePassageiros = quantidadeDePassageiros;
  }

  //(GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L)
  public void calcularCusto(double distacia){

    //Litros consumidos em uma viagem de X Km de distância. X=distância.
    double consumoTotal=consumo(distacia);

    if (this.getTipoDeCombustivel().equals(TipoDeCombustivel.GASOLINA)){
      System.out.println("Preço total : "+(consumoTotal*2.10));
    }
    if (this.getTipoDeCombustivel().equals(TipoDeCombustivel.DIESEL)){
      System.out.println("Preço total: "+(consumoTotal*1.95));
    }
    if (this.getTipoDeCombustivel().equals(TipoDeCombustivel.GPL)){
      System.out.println("Preço total: "+(consumoTotal*1.15));

    }if (this.getTipoDeCombustivel().equals(TipoDeCombustivel.ELETRICO)){
      System.out.println("Preço total: "+(consumoTotal*0.12));
    }
  }

}
