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

        System.out.println("\t---Bem Vindo ao RPG SombraS do DestinO---");
        System.out.println("Em Sombras do destino, o reino de Eldoria vive em uma paz frágil, ameaçada pela profecia do retorno de Noxar, uma entidade malígna que renasce das cinzas a cada milênio." +
                " \nO jogador deve escolher entre tres guerreiros sagrados: Um destemível Bárbaro, um poderoso feiticeiro, ou um habilidoso arqueiro. Vamos começar a nossa aventura.");
        System.out.println("");
        System.out.println("Primeiro defina um nome para o seu Heroi: ");
        String nomeHeroi = input.nextLine();

        int tipoHeroi;
        do {
            System.out.println("Escolha o tipo de herói: 1-Bárbaro, 2-Feiticeiro, 3-Arqueiro");
            tipoHeroi = input.nextInt();
            if (tipoHeroi < 1 || tipoHeroi > 3) {
                System.out.println("Escolha inválida. Por favor, digite '1' para Bárbaro, '2' para Feiticeiro, ou '3' para Arqueiro.");
            }
        } while (tipoHeroi < 1 || tipoHeroi > 3);

        int dificuldade;
        do {
            System.out.println("Escolha a dificuldade: (1-Fácil) ou (2-Difícil)");
            dificuldade = input.nextInt();
            if (dificuldade != 1 && dificuldade != 2) {
                System.out.println("Escolha inválida. Por favor, digite '1' para Fácil ou '2' para Difícil.");
            }
        } while (dificuldade != 1 && dificuldade != 2);

        int pontosDeCriacao = dificuldade == 1 ? 300 : 220;
        int ouro = dificuldade == 1 ? 20 : 15;

        System.out.println("Você tem " + pontosDeCriacao + " pontos de criação. Cada ponto de vida vale 1 ponto, cada ponto de força vale 5 pontos.");

        int vida = 0, forca = 0;
        int pontosTotais;

        do {
            System.out.print("Vida: ");
            vida = input.nextInt();
            System.out.print("Força: ");
            forca = input.nextInt();
            pontosTotais = vida + (forca * 5);

            if (pontosTotais > pontosDeCriacao) {
                System.out.println("Você ultrapassou " + (pontosTotais - vida) + " pontos. Você tem " + pontosDeCriacao + " pontos disponíveis. Tente novamente.");
            }
        } while (pontosTotais > pontosDeCriacao);

        Heroi heroi = null;

        switch (tipoHeroi) {
            case 1:
                heroi = new Barbaro(nomeHeroi, vida, vida, forca, ouro);
                break;
            case 2:
                heroi = new Feiticeiro(nomeHeroi, vida, vida, forca, ouro);
                break;
            case 3:
                heroi = new Arqueiro(nomeHeroi, vida, vida, forca, ouro);
                break;
            default:
                System.out.println("Ocorreu um erro inesperado na criação do herói.");
        }

        return heroi;
    }

    public Heroi sombraDoDestino(){
        Heroi jogador= criarPersonagem();




        return jogador;
    }





}

