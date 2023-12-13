package DesignPatterns.FactoryMethod.Ex01;

public class TacoCarne extends Taco {

    @Override
    void prepare() {
        System.out.println("A prepara taco de carne");
    }

    @Override
    void bake() {
        System.out.println("A cozinhar taco de carne");
    }

    @Override
    void box() {
        System.out.println("A embalar taco de carne");
    }
}
