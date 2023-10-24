package FichaPratica01;

import java.util.Scanner;


public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalMinutes, totalSeconds, hours;


        System.out.print("Insira minutos da musica 1: ");
        totalMinutes = input.nextInt();
        System.out.print("Insira segundos da musica 1: ");
        totalSeconds = input.nextInt();


        System.out.print("Insira minutos da musica 2: ");
        totalMinutes = totalMinutes + input.nextInt();
        System.out.print("Insira segundos da musica2: ");
        totalSeconds = totalSeconds+input.nextInt();


        System.out.print("Insira minutos da musica 3: ");
        totalMinutes = totalMinutes + input.nextInt();
        System.out.print("Insira segundos da musica 3: ");
        totalSeconds = totalSeconds+input.nextInt();

        System.out.println("Minutos Totais: "+totalMinutes);
        System.out.println("Segundos Totais: "+totalSeconds);

        // Calcular o total de segundos do album
        totalSeconds=totalMinutes*60+totalSeconds;
        System.out.println(totalSeconds);

        // Calcular as horas
        hours=(totalSeconds/3600);
        System.out.println(hours);

        //calcular minutos
        //calcular segundos







    }
}
