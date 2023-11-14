package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {


        //ler ficheiro
        Scanner scannerline = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        String linha, palavra="Vitor";

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_08copia.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter write = new PrintWriter(novoFicheiro);

        while(scannerline.hasNextLine()){
            linha= scannerline.nextLine();
            String [] palavrasDaLinha=linha.split(" ");


            for (int i = 0; i <palavrasDaLinha.length ; i++) {
                if (palavra.equals(palavrasDaLinha[i])){
                    System.out.println(palavra);
                    write.println(linha);
                }

                if (palavrasDaLinha[i].equals(palavra + ",")){
                    write.println(linha);
                }

            }

        }

        write.close();
        scannerline.close();


    }
}
