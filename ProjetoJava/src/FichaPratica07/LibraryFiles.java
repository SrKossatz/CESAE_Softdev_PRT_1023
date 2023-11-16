package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryFiles {

    /**
     * Método que ler um conteúdo do ficheiro e imprime na consola
     * @param caminho do ficheiro
     * @throws FileNotFoundException
     */
    public static void  printFiles (String caminho) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(caminho));
        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }

    }

}
