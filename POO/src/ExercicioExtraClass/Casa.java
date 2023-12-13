package ExercicioExtraClass;



//Desenvolva uma casa com os seguintes parâmetros.
// Atributos Boolean: porta1, porta2, porta3. String corcasa
// Métodos abrirPortas, fecharPortas, pintarCasa, quantasPortasestãoAnbertas
public class Casa {
  private boolean porta1;
  private boolean porta2;
  private boolean porta3;
  private String corCasa;

  public Casa() {
    this.porta1 = false;
    this.porta2 = false;
    this.porta3 = false;
    this.corCasa = "branco";
  }


  /**
   * Método para abrir portas.
   * @param numeroPorta
   * @return Se está aberta = true ou fechada = false
   */
  public boolean abrirPorta(String numeroPorta){
    if (numeroPorta.equalsIgnoreCase("porta1")) {
      this.porta1 = true;

    }
    if (numeroPorta.equalsIgnoreCase("porta2")) {
      this.porta2 = true;
    }
    if (numeroPorta.equalsIgnoreCase("porta3")) {
      this.porta3 = true;
    }

    return false;

  }

  public void pintarCasa(String cor){
    if(!this.corCasa.equalsIgnoreCase(cor)){

      if (cor.equalsIgnoreCase( "Azul") || cor.equalsIgnoreCase("Amarelo") || cor.equalsIgnoreCase("Preto")){
        this.corCasa = cor;
      }else {
        System.out.println("Só pode pintar a casa de Azul, Amarelo ou Preto");
      }
    }


  }


  public void exibirDetalhes(){
    System.out.println("As porta: " +this.porta1+" está aberta.");
    System.out.println("As porta: " +this.porta2+" está aberta.");
    System.out.println("As porta: " +this.porta3+" está aberta.");
    System.out.println("A cor atual é: "+this.corCasa);
    System.out.println("Quantas portas estão aberta: "+quantasPortasAbertas());
  }

  /**
   * Método que verifica quantidade de portas abertas.
   * @return Soma dos resultados de cada condição ternária.
   */
  public int quantasPortasAbertas(){
    return (this.porta1 ? 1 : 0) + (this.porta2 ? 1 : 0) + (this.porta3 ? 1 : 0);
  }



}
