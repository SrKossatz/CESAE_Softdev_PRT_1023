package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Ficheiros/exercicio_04.csv");

        Scanner sc= new Scanner(file);

        String linha;

        while (sc.hasNextLine()) {
           linha=sc.nextLine();

            System.out.println(linha);
        }

        sc.close();
    }
}
