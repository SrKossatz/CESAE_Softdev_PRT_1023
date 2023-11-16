package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {

    /**
     * Método que conta o números de linhas de um ficheiro,
     * @param caminhoFicheiro
     * @return  Número de linhas scanneadas
     * @throws FileNotFoundException
     */
    public static int contarLinhasFicheiro (String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro= new File(caminhoFicheiro);
        Scanner  scanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (scanner.hasNextLine()){
            scanner.nextLine();
            contagemLinhas++;
        }
        return contagemLinhas;
    }


    /**
     * Método que retorna o total de colunas de um ficheiro.
     * @param caminhoFicheiro Arquivo a ser lido.
     * @param delimitador Tipo de separador usado de acordo com o ficheiro.
     * @return Número de colunas
     * @throws FileNotFoundException
     */
    public static int contarColunas (String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemColunas=0;

        String linha=scanner.nextLine();
        String [] itensLinha = linha.split(delimitador);

        contagemColunas = itensLinha.length;

        return contagemColunas;

    }


    public static void main(String[] args) {

    }
}





