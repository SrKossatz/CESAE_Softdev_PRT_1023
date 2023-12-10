package FichaPratica11Ex03;

import java.util.ArrayList;

public class BarcoPesca {
  private String nome;
  private String cor;
  private String anoFabrico;
  private int tripulacao;
  private double capacidadeCargaKg;

  private Marca marcaDoBarco;

  private ArrayList<Peixe> peixesPescados;
  private ArrayList<Marisco> mariscosPescados;



  public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCargaKg, Marca marcaDoBarco) {
    this.nome = nome;
    this.cor = cor;
    this.anoFabrico = anoFabrico;
    this.tripulacao = tripulacao;
    this.capacidadeCargaKg = capacidadeCargaKg;
    this.marcaDoBarco = marcaDoBarco;
    this.peixesPescados = new ArrayList<Peixe>();
    this.mariscosPescados = new ArrayList<Marisco>();
  }

  public void pescarPeixes(Peixe novoPeixe){
    //preciso do valor da carga do peixe pescado e do valor total da capacidade de carga do barco. Adicionar o peso do peixe a carga atual
    if (this.capacidadeCargaKg>novoPeixe.getPeso()){
      this.capacidadeCargaKg-=novoPeixe.getPeso();
      peixesPescados.add(novoPeixe);
    }else{
      System.out.println("O barco não tem capacidade para transportar o peixe");
    }
  }

  public void largarPeixes(Peixe novoPeixe){
    peixesPescados.remove(novoPeixe);
    this.capacidadeCargaKg+=novoPeixe.getPeso();
  }

  public void pescarMariscos(Marisco novoMarisco){
    if (this.capacidadeCargaKg>novoMarisco.getPeso()){
      this.capacidadeCargaKg-=novoMarisco.getPeso();
      mariscosPescados.add(novoMarisco);
    }else{
      System.out.println("O barco não tem capacidade para transportar o peixe");
    }
  }

  public void largarMariscos(Marisco novoMarisco){
    mariscosPescados.remove(novoMarisco);
    this.capacidadeCargaKg+= novoMarisco.getPeso();
  }

  public double calcularTotal(){
    double total=0;

    for(Peixe peixeAtual : this.peixesPescados ){
      total += peixeAtual.getPeso()*peixeAtual.getPrecoKg();
    }
    for (Marisco mariscoAtual : this.mariscosPescados){
      total += mariscoAtual.getPeso()*mariscoAtual.getPrecoKg();
    }

    return total;

  }

  public double salarioTrip(){
    double salario=0;

    double valorTotalDaPesca = calcularTotal();

    salario = (valorTotalDaPesca*0.6)/this.tripulacao;

    return salario;
  }

  public void exibirDetalhes(){
    System.out.println("Carga Atual: "+this.capacidadeCargaKg);
  }


}
