// package FichaPratica06;

// import java.util.Scanner;

// public class Ex02 {
//     public static int lerInteiroPositivo() {
//         Scanner input = new Scanner(System.in);
//         int num;

//         do {
//             System.out.print("Insira um inteiro positivo: ");
//             num = input.nextInt();
//         } while (num < 0);

//         return num;
//     }

// <<<<<<< Updated upstream

//     /*
//      Método que imprime asteriscos
//      * @param numero parâmetro inserido pelo utilizador
//      */
//     public static void imprimirAsteriscos(int numero){

//        for (int indice=0;indice<numero;indice++){
//            System.out.print("*");
//        }
// =======
//     public static void imprimirAsteriscos(int numero) {
//         for (int i = 0; i < numero; i++) {
//             System.out.print("*");
//         }
// >>>>>>> Stashed changes

//     }

//     public static void main(String[] args) {
//         int numero = lerInteiroPositivo();
//         imprimirAsteriscos(numero);
//     }
// }