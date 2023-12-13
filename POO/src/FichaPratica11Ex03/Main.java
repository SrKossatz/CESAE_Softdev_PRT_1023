package FichaPratica11Ex03;

public class Main {
  public static void main(String[] args) {

    BarcoPesca barco_1 = new BarcoPesca("Alcatraz","Branco","2020",10,100,Marca.QUICKSILVER);

    Peixe peixe_01 = new Peixe("Carpa",1.23,10);
    Peixe peixe_02 = new Peixe("Atum",1.00,20);
    Peixe peixe_03 = new Peixe("Salmão",2.50,30);
    Peixe peixe_04 = new Peixe("Salmão",2.23,30);
    Peixe peixe_05 = new Peixe("Tamboril",3.44,34);

    Marisco marisco_01 = new Marisco("Mexilhão",0.45,5);
    Marisco marisco_02 = new Marisco("Perceba",2.35,9);
    Marisco marisco_03 = new Marisco("Lapas",1.45,3);


    barco_1.exibirDetalhes();
    barco_1.pescarPeixes(peixe_01);
    barco_1.pescarPeixes(peixe_02);
    barco_1.pescarPeixes(peixe_03);
    barco_1.exibirDetalhes();

    barco_1.pescarMariscos(marisco_01);
    barco_1.pescarMariscos(marisco_02);
    barco_1.pescarMariscos(marisco_03);
    barco_1.exibirDetalhes();

    barco_1.largarPeixes(peixe_01);
    barco_1.largarMariscos(marisco_02);
    barco_1.exibirDetalhes();

    System.out.println();
    System.out.println("Total de dinheiro feito: "+barco_1.calcularTotal());
    System.out.println();
    System.out.println("Salário de cada tripulante: "+barco_1.salarioTrip());
    System.out.println();



  }


}
