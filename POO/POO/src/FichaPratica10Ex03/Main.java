package FichaPratica10Ex03;

public class Main {
  public static void main(String[] args) {

    Animal macaco = new Animal("Tobias", "Orangotango", "Brasil", 800, new String[]{"banana", "morango", "mamao"});
    Animal leao = new Animal("Simba", "Felino", "Africa", 1000, new String[]{"carne", "peixe", "aves"});

    macaco.comer("morango",20);
    macaco.exibirDetalhes();


  }
}
