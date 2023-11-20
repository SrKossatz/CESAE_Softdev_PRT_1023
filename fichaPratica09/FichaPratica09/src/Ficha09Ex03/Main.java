package Ficha09Ex03;

public class Main {
    public static void main(String[] args) {

        Retangulo retagulo = new Retangulo(10,5);



       retagulo.calcularArea();
       retagulo.calcularPerimetro();

        retagulo.setAltura(20);
        retagulo.setLargura(2);

        retagulo.calcularArea();
        retagulo.calcularPerimetro();


    }
}
