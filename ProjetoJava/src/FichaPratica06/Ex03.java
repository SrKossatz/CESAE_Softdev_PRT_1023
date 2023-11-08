package FichaPratica06;

public class Ex03 {

    /**
     * Método que verifica se um número é par
     * @param numero Valor inserido pelo utilizador
     * @return true
     */
     public static boolean numeroPar(int numero){
         if (numero%2==0){
             return true;
         }else{
             return false;
         }
     }


    /**
     * Método que avalia se um número é positivo ou negativo
     * @param numero Valor inserido pelo utilizador
     * @return true
     */
    public static boolean positivoOuNegativo(int numero){
         if (numero>=0){
             return true;
         }else{
             return false;
         }
     }

    /**
     * Método que avalia se o número é ou não primo
     * @param num inserido pelo utilizador
     * @return true se for primo
     */
    public static boolean primo(int num){

        for(int divisor=2; divisor<num; divisor++){
            if(num%divisor==0){
                return false;
            }
        }

        return true;
    }


    /**
     * Método que identifica um número Par perfeito
     * @param numero Inserido pelo utilizador
     * @return True se a soma for igual ao número
     *
     */
    public static boolean numeroPerfeito(int numero){
       int soma=0;

       for (indice=1;indice<numero;indice++){
           if (numero%indice==0){
               soma+=indice;
           }

       }

       if (soma==indice){
           return true;
       }else{
           return false;
       }

    }


    public static boolean numeroTriangular(int numero){
        int soma=0;

        for (int indice=1;indice<numero;indice++) {

            soma += numero;
        }
        if (soma==numero){
            return true;
        }
        return false;
    }
}

