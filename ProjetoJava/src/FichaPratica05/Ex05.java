package FichaPratica05;
//  Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.
import java.util.Scanner;

public class Ex05 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
 
     double vetor[]= new double[10];
     double media, somatorio=0;

 
 
     for (int i = 0; i < vetor.length; i++) {
       System.out.print("Insira os valores no vetor["+i+"]:");
       vetor[i]=input.nextInt();
     }

     for (int i = 0; i < vetor.length; i++) {
       somatorio+=vetor[i];
     }

     media=somatorio/vetor.length;

     System.out.println(media);


  }
}
