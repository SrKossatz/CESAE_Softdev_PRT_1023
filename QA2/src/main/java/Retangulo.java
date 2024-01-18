public class Retangulo {
  private double largura;
  private double altura;

  public Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  public double calcularPerimetro(){
    // Variável perimetro é redundante pois podemos retornar diretamente o cálculo
    double perimetro= (this.largura*2)+(this.altura*2);
    return perimetro;
  }

  /**
   * Método que calcula a área do retangulo
   * @return Área do retângulo
   */
  public double calcularArea(){
    return this.largura*this.altura;
  }


}
