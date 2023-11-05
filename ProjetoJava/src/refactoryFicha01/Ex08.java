package refactoryFicha01;

import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double minutosTotais, segundosTotais, segundosTotaisAlbum, minutosTotaisAlbum;

    System.out.print("Insira os minutos da música 1: ");
    minutosTotais= input.nextDouble();
    System.out.print("Insira os segundos da música 1: ");
    segundosTotais= input.nextDouble();

    System.out.print("Insira os minutos da música 2: ");
    minutosTotais= input.nextDouble()+minutosTotais;
    System.out.print("Insira os segundos da música 2: ");
    segundosTotais= input.nextDouble()+segundosTotais;

    System.out.print("Insira os minutos da música 3: ");
    minutosTotais= input.nextDouble()+minutosTotais;
    System.out.print("Insira os segundos da música 3: ");
    segundosTotais= input.nextDouble()+segundosTotais;

    System.out.print("Insira os minutos da música 4: ");
    minutosTotais= input.nextDouble()+minutosTotais;
    System.out.print("Insira os segundos da música 4: ");
    segundosTotais= input.nextDouble()+segundosTotais;

    System.out.print("Insira os minutos da música 5: ");
    minutosTotais= input.nextDouble()+minutosTotais;
    System.out.print("Insira os segundos da música 5: ");
    segundosTotais= input.nextDouble()+segundosTotais;

    System.out.println("Os minutos totais são: "+minutosTotais);
    System.out.println("Os segundos totais são: "+segundosTotais);

    segundosTotaisAlbum=(minutosTotais*60)+segundosTotais;
    minutosTotaisAlbum= (segundosTotaisAlbum/60);
    System.out.println(minutosTotaisAlbum);

//    *******************exercício não finalizado********************


  }
}
