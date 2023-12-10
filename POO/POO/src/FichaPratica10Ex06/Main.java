package FichaPratica10Ex06;

public class Main {
  public static void main(String[] args) {
    Atleta atleta1 = new Atleta("Atylla","Levantamento de peso",1.85,80,"Brasil");
    Atleta atleta2 = new Atleta("Raul","Levantamento de peso",1.85,80,"Portugal");
    Atleta atleta3 = new Atleta("Mariana","Ginástica",1.85,80,"Brasil");
    Atleta atleta4 = new Atleta("Leonardo","Levantamento de peso",1.85,80,"Brasil");
    Atleta atleta5 = new Atleta("Junior","Ginástica",1.85,80,"Brasil");
    Atleta atleta6 = new Atleta("Valentina","Ginástica",1.85,80,"Brasil");

    Competicao atletismo = new Competicao("A Hora da verdade", "Brasil");
    Competicao mma = new Competicao("Luta Livre","Portugal");

    atletismo.inscreverAtleta(atleta1);
    atletismo.inscreverAtleta(atleta2);
    atletismo.inscreverAtleta(atleta3);
    atletismo.imprimirCompeticao();

    System.out.println("");
    System.out.println("================================");
    System.out.println("");

    mma.inscreverAtleta(atleta4);
    mma.inscreverAtleta(atleta5);
    mma.inscreverAtleta(atleta6);
    mma.imprimirCompeticao();




  }
}
