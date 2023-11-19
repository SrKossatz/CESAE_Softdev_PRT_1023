package PE_AtyllaKossatz1;

import java.io.FileNotFoundException;
import java.util.Scanner;


import static PE_AtyllaKossatz1.bibliotecaFuncoes.*;

public class gameStart {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner input = new Scanner(System.in);

    int opcao;

    do {

      System.out.println("\n\n*** GAME START***");
      System.out.println("Escolha o tipo de utilizador: ");
      System.out.println("Opção (1): Logar como Cliente");
      System.out.println("Opção (2): Logar como Administrador");
      System.out.println("Opção (0): Sair");
      System.out.print("Escolha a opção desejada: ");
      opcao = input.nextInt();

      switch (opcao) {
        case 1:
          menuCliente();
          break;
        case 2:
          senhaAdministrador();
          menuAdministrador();
          break;

        default:
          System.out.println("Opcão inválida!");
          break;
      }

    } while (opcao != 0);


  }

}
