package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int opcao;

    do {

      System.out.println(" Escolha a opção: ");
      System.out.println("1. Criar");
      System.out.println("2. Atualizar");
      System.out.println("3. Eliminar");
      System.out.println("4. Sair");

      opcao= input.nextInt();

      switch (opcao){
        case 1:
          System.out.println("****Criar****");
          break;
        case 2:
          System.out.println("****Atualizar****");
          break;
        case 3:
          System.out.println("****Eliminar****");
          break;
        case 4:
          System.out.println("****Sair****");
          break;
        default:
          System.out.println("Esta opção ão é válida");
      }

    }while (opcao!=4);
  }
}
