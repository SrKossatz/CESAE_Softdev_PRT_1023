package FichaPratica09Ex02;

public class Main {



    public static void main(String[] args) {

        // No main precisa invocar o método construtor
        Cao cao1 = new Cao("lucky", "Yourk Shire");
        Cao cao2 = new Cao("Golias", "Pastor Alemão");
        Cao cao3 = new Cao("Thor", "Vira Lata");



        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();

        System.out.println();

        // Alterar o latido do cao1
        cao1.setLadrar("wooof!");

        cao1.ladrar();
        cao2.ladrar();
        cao3.ladrar();
    }
}
