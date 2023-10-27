package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num=0, media=0, ciclo=-1;


        while (num!=-1){
            media=media+num;
            System.out.print("Introduza um número: ");
            num= input.nextInt();
            ciclo=ciclo+1;

            System.out.println(media);

        }
        System.out.println(media/ciclo);



    }
}
