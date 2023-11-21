package FichaPratica09Ex03;

//Area = Largura * Altura
//Perímetro = Largura*2 + Altura*2

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void calcularArea() {


        System.out.println(this.altura * this.largura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public  void calcularPerimetro(){
        System.out.println((this.altura*2)+(this.largura*2));
    }
}

