package FichaPratica10Ex04;

public class Imovel {
  private String rua;
  private String numPorta;
  private String cindade;
  private TipoDeImovel tipoDeImovel;
  private Acabamento acabamento;
  private double area;
  private int numQuartos;
  private int numCasaDeBanho;
  private double areaPiscina;

  public void valorImovel(Imovel novoImovel){
    double valorDoImovel=0;

    if (this.tipoDeImovel.equals(TipoDeImovel.APARTAMENTO)){
      valorDoImovel+=this.area*1000;

    }
    if (this.tipoDeImovel.equals(TipoDeImovel.CASA)){
      valorDoImovel+=this.area*3000;
    }
    if (this.tipoDeImovel.equals(TipoDeImovel.MANSAO)){
      valorDoImovel+=this.area*5000;
    }

    if (this.acabamento.equals(Acabamento.PARA_RESTAURO))
      valorDoImovel+=this.area*0.5;


  }


}
