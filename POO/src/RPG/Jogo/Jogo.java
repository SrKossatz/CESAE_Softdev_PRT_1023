package RPG.Jogo;

import RPG.Entidade.Barbaro;
import RPG.Entidade.Heroi;

import java.util.Scanner;



public class Jogo {

    public Jogo() {
    }



    public Heroi criarPersonagem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o tipo de herói: Bárbaro, Feiticeiro ou Arqueiro");
        String tipo = input.nextLine();

        System.out.println("Escolha a dificuldade: Fácil ou Difícil");
        String dificuldade = input.nextLine();

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
        } while (vida + (forca * 5) > pontosDeCriacao);


        Heroi heroi = null;


//        switch (tipo.toLowerCase()) {
//            case "bárbaro":
//                heroi = new Barbaro(criarPersonagem().getNome(), criarPersonagem().getVidaMax(),criarPersonagem().getVidaAtual(),criarPersonagem().getForca(),criarPersonagem().getOuro(),criarPersonagem().getNivel(),criarPersonagem().getArmaPrincipal(),criarPersonagem())
//
//        }

        // Retorna a variável heroi
        return heroi;
    }


}

