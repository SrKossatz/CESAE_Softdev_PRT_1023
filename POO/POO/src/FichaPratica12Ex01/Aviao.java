package FichaPratica12Ex01;

public class Aviao {
  private int numeroSerie;
  private String modelo;
  private int anofabrico;
  private double peso;
  private double compFuselagem;
  private double envergadura;
  private double alturaCauda;
  private int numeroMotores;
  private double autonomia;
  private double velocidadeMax;
  private double preco;

  public Aviao(int numeroSerie, String modelo, int anofabrico, double peso, double compFuselagem, double envergadura, double alturaCalda, int numeroMotores, double autonomia, double velocidadeMax, double preco) {
    this.numeroSerie = numeroSerie;
    this.modelo = modelo;
    this.anofabrico = anofabrico;
    this.peso = peso;
    this.compFuselagem = compFuselagem;
    this.envergadura = envergadura;
    this.alturaCauda = alturaCalda;
    this.numeroMotores = numeroMotores;
    this.autonomia = autonomia;
    this.velocidadeMax = velocidadeMax;
    this.preco = preco;
  }

  public double getPreco() {
    return preco;
  }

  public void exibirDetalhes(){
    System.out.println("Detalhes do Avião: ");
    System.out.println("Modelo: "+this.numeroSerie);
    System.out.println("anoFabrico: "+this.anofabrico);
    System.out.println("Altura da cauda: "+this.alturaCauda);
    System.out.println("Numero de motores: "+this.numeroMotores);
    System.out.println("Preço: "+this.preco);
  }
}
