package Ficha09Ex10;

public class Main {
    public static void main(String[] args) {
        Funcionario kossatz = new Funcionario("Kossatz", 1000, "BackEnd");
        Funcionario miguel = new Funcionario("Miguel", 800, "FrontEnd");

        kossatz.aumentoSalrario(100);
        kossatz.exibirDados();

        System.out.println("***********");

        miguel.aumentoSalrario(50);
        miguel.exibirDados();

    }
}
