package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int vetor[] = new int[3];
    boolean crescente=true;
    
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Insira os valores nas posições do vetor["+i+"]:");
      vetor[i]=input.nextInt();
    }

    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i]<=vetor[i-1]) {
        crescente=false;
      }
    }

    if(crescente){
      System.out.println("Vetor Crescente");
  }else{
      System.out.println("Vetor Não Crescente");
  }

  }
  
}
