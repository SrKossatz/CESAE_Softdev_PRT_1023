package FichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c;

    System.out.print("Insira o primeiro número: ");
    a = input.nextInt();

    System.out.print("Insira o segundo número: ");
    b = input.nextInt();

    System.out.print("Insira o terceiro número: ");
    c = input.nextInt();

    if (a<b && a<c){ //a
      if (b<c){
        System.out.println(a+" "+b+" "+c);
      }else {
        System.out.println(a+" "+c+" "+b);
      }
    }

    if (b<c && b<a){ //b
      if (a<c){
        System.out.println(b+" "+a+" "+c);
      }else{
        System.out.println(b+" "+c+" "+a);
      }
    }

    if (c<b && c<a){ //c
      if (a<b){
        System.out.println(c+" "+a+" "+b);
      }else{
        System.out.println(c+" "+b+" "+a);
      }
    }

  }
}
