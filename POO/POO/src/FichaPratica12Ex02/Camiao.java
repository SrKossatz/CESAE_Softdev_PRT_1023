package FichaPratica12Ex02;

public class Camiao extends Veiculo{
  private double capacidadeDeCarga;

  public Camiao(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, double capacidadeDeCarga) {
    super(marca, modelo, anoFabrico, potencia, cilindrada, TipoDeCombustivel.DIESEL, consumo);
    this.capacidadeDeCarga = capacidadeDeCarga;
  }

  //(DIESEL = 1.95€/L)
  public void viagem(double distacia, double carga){
    //consumo da viagem (litro/100km)
    double litroAcada100km = this.getConsumo();
    double litroAcada100kmComCarga=litroAcada100km+carga*0.1;

    //custo da viagem (quanto foi gasto em combustível)


  }




}
