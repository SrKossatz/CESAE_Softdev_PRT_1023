package DesignPatterns.FactoryMethod.Ex01;

public class TacoVegetariano extends Taco{
    @Override
    void prepare() {
        System.out.println("A preparar taco vegetariano");
    }

    @Override
    void bake() {
        System.out.println("A cozinhar taco vegetariano");
    }

    @Override
    void box() {
        System.out.println("A embalar taco vegetariano");
    }
}
