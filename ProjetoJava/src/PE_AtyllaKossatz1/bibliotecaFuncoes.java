package PE_AtyllaKossatz1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class bibliotecaFuncoes {


  public static void menuCliente() {
    Scanner input = new Scanner(System.in);
    int opcao;


    do {
      System.out.println("\n\n***Menu do Cliente***");
      System.out.println("Opção (1): Faça o seu cadastro.");
      System.out.println("Opção (2): Verifique disponibilidade de vaga no estacionamento.");
      System.out.println("Opção (3): Pesquise todos os jogos.");
      System.out.println("Opção (4): Pesquise os jogos por editora.");
      System.out.println("Opção (0): Sair.");

      System.out.print("Selecione a opção desejada:");
      opcao = input.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Insira seu nome: ");
          String nome = input.next();
          System.out.print("Insira seu contato: ");
          int contato = input.nextInt();
          System.out.print("Insira seu email: ");
          String email = input.next();

          System.out.println("\n\nBem vindo: " + nome + " | " + contato + " | " + email);
          break;

        case 2:
          System.out.println("\n\n***Vagas disponíveis:***");
          vagaEstacionamento(121);
          break;


        default:
          System.out.println("Opcão inválida");
          break;
      }

    } while (opcao != 0);
  }

  public static void menuAdministrador() throws FileNotFoundException {

    Scanner input = new Scanner(System.in);

    int opcao;

    do {
      System.out.println("\n**** Menu Administrador****");

      System.out.println("Opção (1): Ficheiro geral de dados GameStart.");
      System.out.println("Opção (2): Valor total de vendas.");
      System.out.println("Opção (3): Total do lucro baseado nos (20%) de direito sobre as vendas.");
      System.out.println("Opção (4): Pesquisar cliente.");
      System.out.println("Opção (6): Imprima qual o jogo mais caro e os clientes que o compraram.");
      System.out.println("Opção (0): Sair!");
      System.out.print("Escolha a opção desejada: ");
      opcao = input.nextInt();


      switch (opcao) {
        case 1:

          imprimirConteudoFicheiro("src/PE_AtyllaKossatz1/GameStart_V2.csv");

          break;

        case 2:
          valorTotaldeVendas(matriz("src/PE_AtyllaKossatz1/GameStart_V2.csv"));
          break;

        case 3:
          lucro(matriz("src/PE_AtyllaKossatz1/GameStart_V2.csv"));
          break;

        case 4:

          break;

        case 5:

          break;

        case 6:

          break;

        case 0:
          break;

        default:
          System.out.println("Opção Inválida!");
          break;
      }
    } while (opcao != 0);

  }


  /**
   * Método criado para contar linhas do ficheiro
   *
   * @return Quantidade de linhas
   * @throws FileNotFoundException Excessão ao erro
   */
  public static int contarLinhas(String caminhoFicheiro) throws FileNotFoundException {

    File ficheiro = new File("src/PE_AtyllaKossatz1/GameStart_V2.csv");

    Scanner scanner = new Scanner(ficheiro);

    int contadorDeLinhas = 0;

    while (scanner.hasNextLine()) {
      scanner.nextLine();
      contadorDeLinhas++;
    }

    return contadorDeLinhas;

  }

  /**
   * Método criado para contar colunas do ficheiro.
   *
   * @return Quantida de colunas divididas por split.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static int contarColunas(String caminhoFicheiro) throws FileNotFoundException {

    File ficheiro = new File("src/PE_AtyllaKossatz1/GameStart_V2.csv");

    Scanner scanner = new Scanner(ficheiro);

    int contadorDeColunas = 0;

    String linha = scanner.nextLine();
    String[] itensLinha = linha.split(";");

    contadorDeColunas = itensLinha.length;

    return contadorDeColunas;
  }

  /**
   * Método criado para atribuir o ficheiro a matriz.
   *
   * @param caminhoFicheiro Caminho do ficheiro
   * @return Matriz preenchida com linhas e colunas.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static String[][] matriz(String caminhoFicheiro) throws FileNotFoundException {

    File ficheiro = new File("src/PE_AtyllaKossatz1/GameStart_V2.csv");

    Scanner scanner = new Scanner(ficheiro);


    //Atribui o contador de linhas a variável numLinhas.
    int numeroDeLinhas = (contarLinhas(caminhoFicheiro)) - 1;

    //Atribui o contador de colunas a variável numColunas.
    int numeroDeColunas = (contarColunas(caminhoFicheiro));

    //Valores inseridos dentro da matriz para definir as linhas e colunas.
    String[][] matriz = new String[numeroDeLinhas][numeroDeColunas];

    String linhaAtual = scanner.nextLine();

    int linhaMatriz = 0;

    //Loop para atribuir linhas a matriz.
    while (scanner.hasNextLine()) {
      linhaAtual = scanner.nextLine();
      String[] itensLinha = linhaAtual.split(";");


      //loop para atribuir colunas as linhas
      for (int coluna = 0; coluna < itensLinha.length; coluna++) {
        matriz[linhaMatriz][coluna] = itensLinha[coluna];

      }
      linhaMatriz++;
    }

    return matriz;

  }

  /**
   * Método usado para imprimir o conteúdo do ficheiro.
   *
   * @param caminhoFicheiro Caminho onde está armazenado o ficheiro.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void imprimirConteudoFicheiro(String caminhoFicheiro) throws FileNotFoundException {

    Scanner ficheiro = new Scanner(new File(caminhoFicheiro));
    String linha;

    while (ficheiro.hasNextLine()) {
      linha = ficheiro.nextLine();
      System.out.println(linha);
    }
  }

  /**
   * Método criado para verificar as vagas disponíveis no estacionamento. Número triangulares multiplos de 5.
   *
   * @param num Quantidade total a ser verificada definida na raiz. num=121.
   */
  public static void vagaEstacionamento(int num) {

    int somatorio = 0, contador = 1;

    num = 121;

    while (somatorio < num) {
      somatorio += contador;

      contador++;

      if (somatorio <= num && somatorio % 5 == 0) {
        System.out.println(somatorio);

      }
    }
  }

  /**
   * Método criado para verificar senha do administrador.
   *
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void senhaAdministrador() throws FileNotFoundException {

    Scanner input = new Scanner(System.in);

    int senhaRegistrada = 123456789, senha;

    System.out.print("Digite sua senha:");
    senha = input.nextInt();

    if (senhaRegistrada == senha) {

      System.out.println("Senha Correta. Acesso liberado!");
      menuAdministrador();
    } else {
      System.out.println("Senha incorreta!");
    }
  }


  /**
   * Método que calcula o total de vendas.
   * @param matrizTotal Recebe a matriz preenchida com o fihceiro.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void valorTotaldeVendas(String[][] matriz) throws FileNotFoundException {

    matriz = matriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

    double valor, totalVendas = 0;

    for (int linha = 0; linha < matriz.length; linha++) {
      valor = Double.parseDouble(matriz[linha][8]);
      totalVendas += valor;
    }

    System.out.println("Valor total: €" + totalVendas);
  }

  /**
   * Método usado para calcular o lucro total (20% das vendas)
   * @param matriz
   */
  public static void lucro(String [][] matriz){
    double lucro = 0;

    for (int i = 0; i < matriz.length; i++) {

      lucro += Double.parseDouble(matriz[i][8]) * 0.2;
    }
    System.out.println("Lucro:"+"€"+lucro);

  }



}


