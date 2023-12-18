package RPG.Jogo;

import RPG.Entidade.Arqueiro;
import RPG.Entidade.Barbaro;
import RPG.Entidade.Feiticeiro;
import RPG.Entidade.Heroi;

import java.util.Scanner;



public class Jogo {

    public Jogo() {
    }





    public Heroi criarPersonagem() {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo ao RPG Sombra do Destino");
        System.out.println("Primeiro defina um nome para o seu Heroi: ");
        String nomeHeroi = input.nextLine();

        System.out.println("Escolha o tipo de herói: Bárbaro, Feiticeiro ou Arqueiro");
        String tipo = input.nextLine();

        System.out.println("Escolha a dificuldade: (1-Fácil) ou (2-Difícil)");
//        int dificuldade = input.nextInt();
        String dificuldade = input.nextLine();

//        int pontosDeCriacao=0;
//        int ouro=0;
//        do {
//            if (dificuldade==1){
//                pontosDeCriacao = 300;
//                ouro=20;
//
//            }else if(dificuldade==2){
//                pontosDeCriacao = 220;
//                ouro=15;
//            }else{
//                System.out.println("Escolha entre as opcões 1 e 2");
//            }
//        }while ();




        int pontosDeCriacao = (dificuldade.equalsIgnoreCase("Fácil")) ? 300 : 220;
        int ouro = (dificuldade.equalsIgnoreCase("Fácil")) ? 20 : 15;


        System.out.println("Você tem " + pontosDeCriacao + " pontos de criação. Cada ponto de vida vale 1 ponto, cada ponto de força vale 5 pontos.");
        System.out.println("Distribua seus pontos entre vida e força:");

        int vida, forca;
        do {
            System.out.print("Vida: ");
            vida = input.nextInt();
            System.out.print("Força: ");
            forca = input.nextInt();
        } while (vida + (forca * 5) <= pontosDeCriacao);


        Heroi heroi = null;


        switch (tipo.toLowerCase()) {
            case "barbaro":
                heroi = new Barbaro(nomeHeroi,vida,vida,forca,ouro);
                break;
            case "Feiticeiro":
                heroi = new Feiticeiro(nomeHeroi,vida,vida,forca,ouro);
                break;
            case "Mago":
                heroi = new Arqueiro(nomeHeroi,vida,vida,forca,ouro);
                break;
            default:
                System.out.println("Escolha um dos herois disponíveis para criação");

        }

        return heroi;
    }

    public Heroi sombraDoDestino(){
        Heroi jogador= criarPersonagem();

        return jogador;
    }



}

