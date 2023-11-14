package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner maquinaLer = new Scanner(new File("Ficheiros/exercicio_07.txt"));


        int contadorLinha=0, contadorPalavras=0;
        String linha;


        while (maquinaLer.hasNextLine()){
            maquinaLer.nextLine();
            contadorLinha++;
        }

        System.out.println(contadorLinha);

        Scanner newScanner= new Scanner(new File("Ficheiros/exercicio_07.txt"));

        while (newScanner.hasNextLine()){
            linha=newScanner.nextLine();
            String [] palavrasDaLinha=linha.split(" ");
            for (int i = 0; i <palavrasDaLinha.length ; i++) {
                contadorPalavras++;
            }
        }
        System.out.println(contadorPalavras);










    }
}
