package FichaPratica01;

import java.util.Scanner;


public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double music1minutes, music1seconds,
                music2minutes, music2seconds,
                music3minutes, music3seconds,
                music4minutes, music4seconds,
                music5minutes, music5seconds,
                convertSecondsMusic1,
                convertSecondsMusic2,
                convertSecondsMusic3,
                convertSecondsMusic4,
                convertSecondsMusic5;
        ;

        System.out.print("Introduza minutos da música 1: ");
        music1minutes = input.nextDouble();
        System.out.print("Introduza segundos da música 1: ");
        music1seconds = input.nextDouble();

        convertSecondsMusic1 = music1minutes * 60 + music1seconds;

        System.out.print("Introduza minutos da música 2: ");
        music2minutes = input.nextDouble();
        System.out.print("Introduza segundos da música 2: ");
        music2seconds = input.nextDouble();

        convertSecondsMusic2 = music2minutes * 60 + music2seconds;

        System.out.print("Introduza minutos da música 3: ");
        music3minutes = input.nextDouble();
        System.out.print("Introduza minutos da música 3: ");
        music3seconds = input.nextDouble();

        convertSecondsMusic3 = music3minutes * 60 + music3seconds;


        System.out.print("Introduza minutos da música 4: ");
        music4minutes = input.nextDouble();
        System.out.print("Introduza minutos da música 4: ");
        music4seconds = input.nextDouble();

        convertSecondsMusic4 = music4minutes * 60 + music4seconds;

        System.out.print("Introduza minutos da música 5: ");
        music5minutes = input.nextDouble();
        System.out.print("Introduza minutos da música 5: ");
        music5seconds = input.nextDouble();

        convertSecondsMusic5 = music5minutes * 60 + music5seconds;


    }
}
