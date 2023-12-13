package FichaPratica12Ex01;

import FichaPratica12Ex01.Enums.Armas;
import FichaPratica12Ex01.Enums.Categoria;

import static FichaPratica12Ex01.Enums.Armas.*;
import static FichaPratica12Ex01.Enums.Instalacoes.*;
import static FichaPratica12Ex01.Enums.Categoria.*;

public class Main {
  public static void main(String[] args) {

    Catalogo catalogo = new Catalogo();

    AvioesCombate aviao_01 = new AvioesCombate(1234,"F-35",2023,1590.4,5.6,9.8,4.4,3,1490,560,100000,"Bélgica",true);
    AvioesCombate aviao_02 = new AvioesCombate(1211,"F-16",2020,1770.6,6.1,8.9,4.8,3,1690,574,100658,"E.U.A.",false);
    AvioesCombate aviao_03 = new AvioesCombate(2454,"T-12",2021,1356.4,5.3,7.8,3.4,4,1320,554,140000,"Alemanha",true);

    JatosParticulares jato_01 = new JatosParticulares(124,"X Deluxe",2021,1040.4,10.3,15.3,2.3,4,2130.3,420.5,1000000,8,500, MIDSIZE);
    JatosParticulares jato_02 = new JatosParticulares(132,"X Deluxe",2021,1040.4,10.3,15.3,2.3,4,2130.3,420.5,1000000,8,500,MIDSIZE);
    JatosParticulares jato_03 = new JatosParticulares(126,"X Deluxe",2021,1040.4,10.3,15.3,2.3,4,2130.3,420.5,1000000,8,500,MIDSIZE);

    aviao_01.addArmas(METRALHADORAS);
    aviao_01.addArmas(TORPEDOS);
    aviao_01.addArmas(FOGUETES);
    aviao_01.addArmas(BOMBAS);



    jato_01.addInstalacoes(WC);
    jato_01.addInstalacoes(CINEMA);
    jato_01.addInstalacoes(TOMADAS);

    catalogo.comprarAviao(aviao_01);
    catalogo.comprarAviao(aviao_02);
    catalogo.comprarAviao(jato_01);

    catalogo.listarCatalogo();


  }
}
