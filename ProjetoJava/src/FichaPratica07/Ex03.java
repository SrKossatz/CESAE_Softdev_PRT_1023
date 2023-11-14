package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


//Abrir o ficheiro existente: File
//Cria novo ficheiro: File
//Ler o ficheiro existente
//Escreve no novo ficheiro

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        File file= new File("Ficheiros/exercicio_03.txt");
        File newFile= new File("Ficheiros/exercicio_03_copia.txt");


//        ler conteúdo
        Scanner sc= new Scanner(file);

//        Escrever
        PrintWriter write = new PrintWriter(newFile);


        String linha;

        while (sc.hasNextLine()){
            linha=sc.nextLine();
            write.println(linha);


        }

        write.close();


    }
}
