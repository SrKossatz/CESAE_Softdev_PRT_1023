package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int selectedOption;

    System.out.println("Bem vindo ao menu interativo, digite a opção desejada: ");
    System.out.println("Opção 1: Criar.");
    System.out.println("Opção 2: Atualizar.");
    System.out.println("Opção 3: Eliminar.");
    System.out.println("Opção 4: Sair.");

    selectedOption= input.nextInt();

    switch (selectedOption){
      case 1:
        System.out.println("Opção 1 selecionada.");
        break;
      case 2:
        System.out.println("Opção 2 selecionada.");
        break;
      case 3:
        System.out.println("Opção 3 selecionada.");
        break;
      case 4:
        System.out.println("");
        break;
      default:
        System.out.println("Opção inválida");

    }


  }
}
