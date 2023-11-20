package Ficha09Ex04;

// Area = Pi * raio*raio.
// Pi = 3,14

//C = 2*π*r.
public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }


    public double calcularArea() {
        return 3.14 * this.raio;

    }

    public double calcularCircunferencia() {
        return 2 * 3.1415 * this.raio;
    }


}
