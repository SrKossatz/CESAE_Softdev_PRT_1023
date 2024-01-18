package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorControllerTest {

  AdministradorController administradorController;


  @BeforeEach
  void setUp() throws FileNotFoundException {
    administradorController = new AdministradorController("C:\\Users\\atyll\\DEV\\CESAE_Softdev_PRT_1023\\ProjetoTesteAtyllaKossatz\\src\\test\\resources\\minimercadoTest.csv");

  }

  @Test
  void produtoMaisVendidoTest() {
    assertEquals("Alimentacao", administradorController.produtoMaisVendido().getTipoProduto());
    assertEquals("Cerveja Super Bock", administradorController.produtoMaisVendido().getProduto());

  }

  @Test
  void produtoQueMaisVendeu() {
    Venda produtoQueMaisvendeu = administradorController.produtoQueMaisVendeu();
    assertEquals("Cafe em Grao", produtoQueMaisvendeu.getProduto());
  }

  @Test
  void vendaMaisValor() {
    Venda vendamaiorValor = administradorController.vendaMaisValor();
    assertEquals("LGTV OLED 85 Golden Edition", vendamaiorValor.getProduto());
  }

  @Test
  void adicionarUtilizadorTest() throws IOException {
    String filePath = "C:\\Users\\atyll\\DEV\\CESAE_Softdev_PRT_1023\\ProjetoTesteAtyllaKossatz\\src\\test\\resources\\login_grandesNegociosTest.csv";
    administradorController.adicionarUtilizador("ADMIN", "tobias", "softdev", filePath);

    File file = new File(filePath);
    Scanner input = new Scanner(file);

    String tipoUtilizador="";
    String userName="";
    String password="";

    while (input.hasNextLine()){
      String linha = input.nextLine();
      String [] linhaSeparada = linha.split(";");
      tipoUtilizador = linhaSeparada[0];
      userName = linhaSeparada[1];
      password = linhaSeparada[2];
    }

    assertEquals("ADMIN", tipoUtilizador);
    assertEquals("tobias", userName);
    assertEquals("softdev", password);

  }

  @Test
  void valorVendasTest() {
    double valorVendas = administradorController.valorVendas();
    System.out.println(valorVendas);

    assertEquals(66272.80999999997, valorVendas );

  }

  @Test
  void mediaVendasTest() {
    double mediaVendas = administradorController.mediaVendas();
    System.out.println(mediaVendas);

    assertEquals(498.291804511278, mediaVendas);
  }


  @Test
  void getTodasVendas() {
    ArrayList<Venda> vendas = administradorController.getTodasVendas();
    assertEquals(133, vendas.size());

  }
}