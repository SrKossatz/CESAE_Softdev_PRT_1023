package FichaPratica09Ex02;

public class Main {
  public static void main(String[] args) {
    Cao dog = new Cao("lucky", "YorkShire");
    Cao golias = new Cao("Golias", "Labrador");
    Cao davi = new Cao("Davi", "Salsicha");

    dog.ladrar();
    golias.ladrar();
    davi.ladrar();

    System.out.println();
    System.out.println();

    golias.setLatido("wouf wouf");
    golias.ladrar();



  }
}
