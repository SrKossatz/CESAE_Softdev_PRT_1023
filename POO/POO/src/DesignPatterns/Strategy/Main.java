package DesignPatterns.Strategy;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ShippingCalculator calcular1 = new ShippingCalculator(new ExpressShippingStrategy());
    ShippingCalculator calcular2 = new ShippingCalculator(new OvernightShippingStrategy());
    ShippingCalculator calcular3 = new ShippingCalculator(new StandardShippingStrategy());

    Scanner input = new Scanner(System.in);
    double peso;
    System.out.println("Insira o peso do produto:");
    peso=input.nextDouble();


    Double expresso= calcular1.calculadora(peso);
    Double noturno= calcular2.calculadora(peso);
    Double padrao= calcular3.calculadora(peso);

    System.out.println("Custo de portes padrão: $"+expresso);
    System.out.println("Custo de portes expresso: $"+noturno);
    System.out.println("Custo de portes noturno: $"+padrao);
  }
}
