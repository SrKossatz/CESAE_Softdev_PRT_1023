package DesignPatterns.FactoryMethod.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Taco carne = TacoFactory.criarTaco("carne");
        Taco frango = TacoFactory.criarTaco("frango");
        Taco vegetariano = TacoFactory.criarTaco("vegetariano");

//        carne.prepare();
//        carne.bake();
//        carne.box();
//
//        System.out.println();
//        System.out.println();
//
//        frango.prepare();
//        frango.bake();
//        frango.box();
//
//        System.out.println();
//        System.out.println();
//
//        vegetariano.prepare();
//        vegetariano.bake();
//        vegetariano.box();

        Scanner input = new Scanner(System.in);



            System.out.print("Qual taco deseja comprar [Carne][Frango][Vegetariano]?");
            String opcao=input.next();

           if (opcao.equals("carne")){
               carne.prepare();
               carne.bake();
               carne.box();
           } else if (opcao.equals("frango")) {
               frango.prepare();
               frango.bake();
               frango.box();
           } else if (opcao.equals("vegetariano")) {
               vegetariano.prepare();
               vegetariano.bake();
               vegetariano.box();
           }

    }
}
