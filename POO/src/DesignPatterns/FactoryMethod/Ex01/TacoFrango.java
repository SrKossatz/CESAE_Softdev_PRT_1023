package DesignPatterns.FactoryMethod.Ex01;

public class TacoFrango extends Taco{
    @Override
    void prepare() {
        System.out.println("A prepara taco de frango");
    }

    @Override
    void bake() {
        System.out.println("A cozinhar taco de frango");
    }

    @Override
    void box() {
        System.out.println("A embalar taco de frango");
    }
}
