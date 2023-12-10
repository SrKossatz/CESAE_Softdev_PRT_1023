package FichaPratica12Ex02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{
  public Mota(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, TipoDeCombustivel tipoDeCombustivel, double consumo) {
    super(marca, modelo, anoFabrico, potencia, cilindrada, tipoDeCombustivel, consumo);
  }

  public void imprimirImagem() throws FileNotFoundException {
    Scanner file = new Scanner(new File("POO/src/FichaPratica12Ex02/Ficheiro/Mota.txt"));
    String linha;
    while(file.hasNextLine()){
      linha= file.nextLine();

      System.out.println(linha);
    }

  }

}
