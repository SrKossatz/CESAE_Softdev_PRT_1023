// package FichaPratica06;

// <<<<<<< Updated upstream
// import java.util.Scanner;

// public class Ex03 {

//     /**
//      * Método que verifica se um número é par
//      *
//      * @param numero Valor inserido pelo utilizador
//      * @return true
//      */
//     public static boolean numeroPar(int numero) {
//         if (numero % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }


//     /**
//      * Método que avalia se um número é positivo ou negativo
//      *
//      * @param numero Valor inserido pelo utilizador
//      * @return true
//      */
//     public static boolean positivoOuNegativo(int numero) {
//         if (numero >= 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     /**
//      * Método que avalia se o número é ou não primo
//      *
//      * @param numero inserido pelo utilizador
//      * @return true se for primo
//      */
//     public static boolean primo(int numero) {

//         for (int divisor = 2; divisor < numero; divisor++) {
//             if (numero % divisor == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }


//     /**
//      * Método que identifica um número Par perfeito
//      *
//      * @param numero Inserido pelo utilizador
//      * @return True se a soma for igual ao número
//      */
//     public static boolean numeroPerfeito(int numero) {
//         int soma = 0, indice;

//         for (indice = 1; indice < numero; indice++) {
//             if (numero % indice == 0) {
//                 soma += indice;
//             }

//         }

//         if (soma == indice) {
//             return true;
//         } else {
//             return false;
//         }

//     }


//     /**
//      * Método que defini se um número é triangular
//      *
//      * @param numero Inserido pelo utilizador
//      * @return true
//      */
//     public static boolean numeroTriangular(int numero) {
//         int soma = 1;

//         for (int indice = 1; indice < numero; indice++) {

//             soma += numero;
//         }
//         if (soma == numero) {
//             return true;
//         }
//         return false;
//     }

// =======
// public class Ex03 {

//   /**
//    * Método que verifica se um número é par
//    * @param numero recebe número do utilizador
//    * @return verdadeiro
//    */
//   public static boolean numeroPar(int numero) {
//     if (numero%2==0){
//       return true;
//     }else{
//       return false;
//     }
//   }

//   /**
//    * Método que verifica se um número é positivo ou negativo
//    * @param numero recebe número do utilizador
//    * @return número maior ou igual a zero
//    */
//   public static boolean PositivoOuNegativi(int numero){
//     return numero >= 0;
//   }

//   /**
//    * Método que determina se um número é primo
//    * @param numero recebe número o utilizador
//    * @return true se for primo
//    *
//    */
//   public static boolean eOuNaoPrimo(int numero){
//     for (int divisor=2;divisor<=numero;divisor++){
//       if(numero%divisor==0){
//         return false;
//       }
//     }
//     return true;
//   }

//   public static boolean numeroPerfeito(int numero) {
//     if (numero <= 0) {
//       return false;
//     }

//     int somaDivisores = 0;

//     for (int indice = 1; indice < numero; indice++) {
//       if (numero % indice == 0) {
//         somaDivisores += indice;
//       }
//     }

//     return somaDivisores == numero;
//   }

// }
// >>>>>>> Stashed changes




// <<<<<<< Updated upstream
// };



// =======
// >>>>>>> Stashed changes
