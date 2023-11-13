package ExercicioestraVetor;
// Crie uma matriz e imprima seus elementos.
import java.util.Scanner;



public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int matriz[][]=new int[3][3];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]+"\t");
      }
     System.out.println();
    }
   
  }
  
}
