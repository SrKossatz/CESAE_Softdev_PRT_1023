package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("Ficheiros/exercicio_02.txt");

        PrintWriter printWriter = new PrintWriter(file);


        String fileContent = "I love programing JAVA";
        printWriter.println(fileContent);


        printWriter.close();




    }
}
