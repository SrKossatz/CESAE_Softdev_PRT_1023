package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws FileNotFoundException {

       Scanner sc= new Scanner(new File("Ficheiros/exercicio_05_31.txt"));

       int number, soma=0;

       while (sc.hasNextInt()){
           number= sc.nextInt();
           soma+=number;
       }

        System.out.println(soma);

    }
}
