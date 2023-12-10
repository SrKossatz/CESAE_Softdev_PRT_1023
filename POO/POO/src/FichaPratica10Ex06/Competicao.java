package FichaPratica10Ex06;

public class Competicao {
  private String nomeDaCompeticao;
  private String pais;
  private Atleta[] participantes;

  public Competicao(String nomeDaCompeticao, String pais) {
    this.nomeDaCompeticao = nomeDaCompeticao;
    this.pais = pais;
    this.participantes = new Atleta[1000];
  }

  public void inscreverAtleta(Atleta atletaNovo){
    for (int i = 0; i < participantes.length; i++) {
      if (this.participantes[i] ==null){
        this.participantes[i]= atletaNovo;
        return;
      }
    }
  }
  public void imprimirCompeticao() {
    System.out.println("Nome Da Competição: " + this.nomeDaCompeticao);
    System.out.println("Pais de Realização da competição: " + this.pais);
    System.out.println("Lista de Participantes: ");
    for(int i=0; i< this.participantes.length;i++){
      if(this.participantes[i]!=null){//imprimir informações dos participantes

        this.participantes[i].exibirDetalhes();
        System.out.println();
      }
    }
  }

}
