package ExercicioExtraClass;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Casa minhaCasa = new Casa();

    minhaCasa.abrirPorta("porta1");
    minhaCasa.exibirDetalhes();
    minhaCasa.abrirPorta("porta2");
    minhaCasa.exibirDetalhes();


  }
}
