package FichaPratica10Ex01;

public class Main {
  public static void main(String[] args) {

    Carro mercedes = new Carro("Mercedes","A45",1988,430, 2.0, TipoDeCombustivel.DIESEL);
    Carro bmw = new Carro("BMW","BM01",2000,200, 2.0, TipoDeCombustivel.GASOLINA);
    Carro ferrari = new Carro("Ferrari","F200",2022,600, 2.2, TipoDeCombustivel.GASOLINA);


    mercedes.corrida(ferrari);
    mercedes.consumoKmL(97);
    ferrari.exibirDetalhes();



  }
}
