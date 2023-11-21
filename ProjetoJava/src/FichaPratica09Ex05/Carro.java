package FichaPratica09Ex05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public void ligarCarro(){

        System.out.println("Ligar carro!");
    }
}


