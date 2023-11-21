package PE_AtyllaKossatz1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class bibliotecaFuncoes {


  public static void menuCliente() throws FileNotFoundException {
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

        case 3:
          buscarJogos(matriz("src/PE_AtyllaKossatz1/gameStart.java"));

        case 4:
          System.out.println("Questão não resolvida!");
          break;


        case 0:
          System.out.println("Goodbye");
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
      System.out.println("Opção (4): Pesquisar cliente pelo ID.");
      System.out.println("Opção (5): Imprima qual o jogo mais caro e os clientes que o compraram.");
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
          buscarCliente(matriz("src/PE_AtyllaKossatz1/GameStart_V2.csv"));
          break;

        case 5:
//
          jogoMaisCaro(matriz("src/PE_AtyllaKossatz1/GameStart_V2.csv"));
          break;

        case 0:
          System.out.println("Goodbye");
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
   *
   * @param matriz Recebe a matriz preenchida com o fihceiro.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void valorTotaldeVendas(String[][] matriz) throws FileNotFoundException {


    double valor, totalVendas = 0;

    for (int linha = 0; linha < matriz.length; linha++) {
      valor = Double.parseDouble(matriz[linha][8]);
      totalVendas += valor;
    }

    System.out.println("Valor total: €" + totalVendas);
  }

  /**
   * Método usado para devolver o lucro gerado pelas vendas. O resultado devolve 20% do valor total.
   *
   * @param matriz Caminho usado para localizar a matriz
   */
  public static void lucro(String[][] matriz) {
    double lucro = 0;

    for (int i = 0; i < matriz.length; i++) {

      lucro += Double.parseDouble(matriz[i][8]) * 0.2;
    }
    System.out.println("Lucro:" + "€" + lucro);

  }

  /**
   * Método que busca o cliente pelo ID.
   *
   * @param matriz Caminho do ficheiro inserido dentro da matriz.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void buscarCliente(String[][] matriz) throws FileNotFoundException {


    Scanner input = new Scanner(System.in);


    System.out.print("Digite o ID do cliente: ");
    double id = input.nextDouble();

    for (int linha = 0; linha < matriz.length; linha++) {
      if (id == Double.parseDouble(matriz[linha][1])) {


        System.out.println("Nome: " + matriz[linha][2] + "Contato:" + matriz[linha][3] + "Email: " + matriz[linha][4]);
        break;
      }
    }

  }

  /**
   * Método usado para buscar os jogos e eliminar os jogos já vistos.
   *
   * @param matriz Matriz que recebe o ficheiro.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void buscarJogos(String[][] matriz) throws FileNotFoundException {

    String jogoJaVisto = "";

    for (int linha = 0; linha < matriz.length; linha++) {

      String jogoAtual = matriz[linha][7];

      //Únuca forma que consegui resolver essa questão. Segue link da pesquisa: https://www.w3schools.com/java/ref_string_contains.asp
      //Método contains().
      if (jogoJaVisto.contains(jogoAtual) == false) {
        System.out.println(jogoAtual);

        jogoJaVisto += jogoAtual;

      }

    }

  }

  /**
   * Método que imprime o jogo mais caro e o nome do cliente que o comprou.
   * @param matriz Matriz que recebe o ficheiro.
   * @throws FileNotFoundException Excessão ao erro.
   */
  public static void jogoMaisCaro(String[][] matriz) throws FileNotFoundException {


    double jogoAtual = 0, jogoMaisCaro = 0;


    for (int linha = 0; linha < matriz.length; linha++) {
      jogoAtual = Double.parseDouble(matriz[linha][8]);

      if (jogoAtual > jogoMaisCaro) {
        jogoMaisCaro = jogoAtual;

      }

    }
    for (int linha = 0; linha < matriz.length; linha++) {
      jogoAtual = Double.parseDouble(matriz[linha][8]);
      if (jogoAtual==jogoMaisCaro){
        System.out.println("Jogo mais caro: "+matriz[linha][7]);
        System.out.println("Cliente: "+matriz[linha][2]);
      }

    }

  }

}


