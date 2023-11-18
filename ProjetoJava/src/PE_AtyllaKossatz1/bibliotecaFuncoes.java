package PE_AtyllaKossatz1;

import java.util.Scanner;

public class bibliotecaFuncoes {

  public static void menuCliente(){
    Scanner input = new Scanner(System.in);
    int opcao;
    

    do {
      System.out.println("\n\n***Menu do Cliente***");
      System.out.println("Opção (1): Faça o seu cadastro:");
      System.out.println("Opção (2): Verifique disponibilidade de vaga no estacionamento:");
      System.out.println("Opção (3): Pesquise todos os jogos:");
      System.out.println("Opção (4): Pesquise os jogos por editora:");
      System.out.println("Opção (0): Sair:");
      
      System.out.print("Selecione a opção desejada:");
      opcao=input.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Insira seu nome: ");
          String nome=input.next();
          System.out.print("Insira seu contato: ");
          int contato=input.nextInt();
          System.out.print("Insira seu email: ");
          String email=input.next();

          System.out.println("\n\nBem vindo: "+nome+" | "+contato+" | "+email);          
          break;
      
        default:
          System.out.println("Opcão inválida");
          break;
      }
      
    } while (opcao!=0);
  }
  
}
