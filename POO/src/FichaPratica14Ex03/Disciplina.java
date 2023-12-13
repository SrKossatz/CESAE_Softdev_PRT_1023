package FichaPratica14Ex03;

import FichaPratica14Ex03.Enum.Areaformacao;

import java.util.Scanner;

public class Disciplina {
  private String nome;
  private Areaformacao area;
  private int duracaoHoras;

  public Disciplina(String nome, Areaformacao area, int duracaoHoras) {
    this.nome = nome;
    this.area = area;
    this.duracaoHoras = duracaoHoras;
  }

  public Disciplina() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome da disciplina:");
    String nome = scanner.nextLine();

    System.out.println("Digite a área de formação da disciplina (INFORMATICA, ECONOMIA, CONTABILIDADE, MEDICINA):");
    Areaformacao area = Areaformacao.valueOf(scanner.nextLine().toUpperCase());

    System.out.println("Digite a duração em horas da disciplina:");
    int duracaoHoras = scanner.nextInt();

    this.nome=nome;
    this.area=area;
    this.duracaoHoras=duracaoHoras;

  }
}
