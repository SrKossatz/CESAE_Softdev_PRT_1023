package FichaPratica09Ex06;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calcular = new Calculadora();


        int soma = calcular.soma(10, 2);
        System.out.println(soma);

        int subtracao = calcular.subtracao(10,2);
        System.out.println(subtracao);

        int multiplicacao = calcular.multiplicacao(10,2);
        System.out.println(multiplicacao);

        int divisao = calcular.divisao(10,2);
        System.out.println(divisao);


    }
}
