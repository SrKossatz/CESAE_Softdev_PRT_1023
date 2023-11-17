package Ficha09Ex02;

public class Cao {

    private String nome;
    private String raca;

    private String ladrar="Au au au";


    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

   public void ladrar(){
       System.out.println("ola");

   }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return ladrar;
    }


}
