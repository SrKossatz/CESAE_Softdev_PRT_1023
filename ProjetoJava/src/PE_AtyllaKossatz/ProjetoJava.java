package PE_AtyllaKossatz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Scanner;

public class ProjetoJava {


    /**
     Método que ler um conteúdo do ficheiro e imprime na consola
     * @param caminho do ficheiro
     * @throws FileNotFoundException
     */
    public static void  imprimirConteúdoFicheiro (String caminho) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File(caminho));
        String linha;

        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            System.out.println(linha);
        }

    }



    /**
     * Mátodo usado para contar as linhas
     * @param caminhoFicheiro Ficheiro a ser lido atravez do seu caminho
     * @return Quantidade de linhas do ficheiro
     */
    public static int contadorDelinhas(String caminhoFicheiro){
        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(caminhoFicheiro);

        int contadorDeLinhas=0;

        while (scanner.hasNextLine()){
            scanner.nextLine();
            contadorDeLinhas++;

        }

        return contadorDeLinhas;
    }


    /**
     * Método usado para contar as colunas de um ficheiro
     * @param caminhoFicheiro Caminho do ficheiro a ser analisado
     * @param delimitador Separador usado para determinar cada coluna
     * @return  Número de colunas do array
     * @throws FileNotFoundException
     */
    public static int contadorDeColunas(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        String linha = scanner.nextLine();
        String [] itensDaLinha = linha.split(delimitador);

        int contagemColuna=0;

        contagemColuna=itensDaLinha.length;

        return contagemColuna;




    }


    /**
     * Método que armazena o conteúdo de um ficheiro em uma matriz
     * @param caminhoFicheiro
     * @return Matriz preenchida
     * @throws FileNotFoundException
     */
    public static String [][] lerFicheiroParaMatriz (String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int numeroDeLinhas=contadorDelinhas("FicheiroProjeto/GameStart_V2.csv")-1;
        int numeroDeColunas=contadorDeColunas("FicheiroProjeto/GameStart_V2.csv", ";");

        String matriz[][] = new String[numeroDeLinhas][numeroDeColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;


        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matriz[linhaMatriz][i] = itensLinha[i];
            }

            linhaMatriz++;

        }

        return matriz;


    }

    /**
     * Método que define se um número é triabgular
     * @param num Número inserido pelo utilizador
     * @return se é ou não triangular
     */
    public static void triangular(int num){

        int somatorio=0, contador=1;

        num=121;

        while (somatorio<num){
            somatorio+=contador;

            contador++;

            if(somatorio<=num&& somatorio%5==0){
                System.out.println(somatorio);

            }
        }

    }

    public static void pesquisarTitulos(String[][] matrizTotal, String titulos) {

        for (int linha = 0; linha < matrizTotal.length; linha++) {

            if (matrizTotal[linha][7].equals(titulos)) {
                System.out.println("Títulos disponíveis: " + matrizTotal[linha][0] + "\t" + ":" + matrizTotal[linha][1]);
            }
        }
    }



    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("FicheiroProjeto/GameStart_V2.csv"));

        String linhaDeVendas = in.nextLine();
        double totaldeVendas=0;

        Scanner input = new Scanner(System.in);
        int opcaoDeEntrada;

        do {
            System.out.println("\n ***Bem vindo a gameStart!*** ");
            System.out.print("\n Logar como Administrador ( Digite: 1). Logar como Cliente( Digite: 2), Sair ( Digite: 0): ");
            opcaoDeEntrada =input.nextInt();

            if (opcaoDeEntrada ==1){
                int password;

                System.out.println("\n***Menu Administrador***");
                System.out.println("Insira seu password");
                password= input.nextInt();

                if (password==12345){
                    System.out.println("Acesso liberado");

                    do {

                        System.out.println("\nOpcão 1: Imprima o seu conteúdo na consola. ");

                        System.out.println("Opcão 2: Imprima quantas vendas foram executadas e o seu valor total. ");

                        System.out.println("Opcão 3: Sabendo que a GameStart tem 20% de lucro em cada jogo, calcule o total de lucro. ");

                        System.out.println("Opcão 4: Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email). ");

                        System.out.println("Opcão 5: Imprima qual o jogo mais caro e os clientes que o compraram. ");

                        System.out.println("Opcão 6: Imprimir qual o melhor cliente (nome, contacto, email), que mais dinheiro gastou na loja, seguido de todos os jogos que comprou. ");

                        System.out.println("Opcão 0: Sair");
                        opcaoDeEntrada=input.nextInt();


                        switch (opcaoDeEntrada){
                            case 1:
                                imprimirConteúdoFicheiro("FicheiroProjeto/GameStart_V2.csv");
                                break;
                            case 2:
                                //codigo
                                break;
                            case 3:
                                //codigo
                                break;
                            case 4:
                                //codigo
                                break;
                            case 5:
                                //codigo
                                break;
                            case 6:
                                //codigo
                                break;
                            case 0:
                                //codigo
                                break;
                            default:
                                System.out.println("Opção invárlida");

                        }

                    }while (opcaoDeEntrada!=0);

                }else {
                    System.out.println("***Senha incorreta***");
                }
            }

            if (opcaoDeEntrada >2){
                System.out.println("\n***Opção inválida***");
            }

            if(opcaoDeEntrada==2) {


                System.out.println("\n***Cliente***");
                System.out.print("Insira o seu nome: ");
                String nome = input.next();
                System.out.print("Insira o seu contato: ");
                int contato = input.nextInt();
                System.out.print("Insira o seu email: ");
                String email = input.next();

                System.out.println("Cliente Inserido com Sucesso: " + nome + "|" + contato + "|" + email);

                int opcaoCliente;

                do {

                    System.out.println("\n\n ***Escolha uma das opções do menu***");
                    System.out.println("Opçáo 1 - Verifique a disponibilidade de estacionamento:");
                    System.out.println("Opção 2 - Consulte os títulos disponíveis:");
                    System.out.println("Opção 3 - Dada uma Editora, imprima todas as categorias e os respetivos jogos");
                    System.out.println("Opção 0 - Sair do menu.");
                    opcaoCliente = input.nextInt();

                    switch (opcaoCliente){
                        case 1:
                            triangular(121);
                            break;
                        case 2:
                            lerFicheiroParaMatriz("FicheiroProjeto/GameStart_V2.csv");
                            break;
                        case 3:
                            lerFicheiroParaMatriz("FicheiroProjeto/GameStart_V2.csv");
                            pesquisarTitulos(matrizTotal[][]);


                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Escolha uma opção válida");


                    }

                } while (opcaoCliente != 0);


            }

        }while(opcaoDeEntrada !=0);




    }
}
