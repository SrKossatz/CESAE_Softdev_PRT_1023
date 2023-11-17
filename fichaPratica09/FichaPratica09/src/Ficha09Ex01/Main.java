package Ficha09Ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa kossatz = new Pessoa("Atylla",35,1.85);
        Pessoa mariana = new Pessoa("Mariana", 35, 1.73);

        System.out.println("Nome: "+kossatz.getNome()+" "+"Idade:"+kossatz.getIdade()+" "+"Altura: "+kossatz.getAltura());
        System.out.println("Nome: "+mariana.getNome()+" "+"Idade:"+mariana.getIdade()+" "+"Altura: "+mariana.getAltura());



    }
}