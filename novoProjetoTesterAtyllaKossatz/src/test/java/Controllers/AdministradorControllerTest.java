package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AdministradorControllerTest {

  private AdministradorController administradorController;

  @BeforeEach
  void setUp() throws FileNotFoundException {
    administradorController = new AdministradorController("src/test/resources/minimercadoTest.csv");
  }

  @Test
  void produtoMaisVendidoTest() {

    assertEquals(1211.0, administradorController.produtoMaisVendido().getQuantidadeVendida());
    assertEquals("Cerveja Super Bock", administradorController.produtoMaisVendido().getProduto());
  }

  @Test
  void produtoQueMaisVendeuTest() {
    assertEquals(445, administradorController.produtoQueMaisVendeu().getQuantidadeVendida());
    assertEquals("Cerveja Super Bock", administradorController.produtoQueMaisVendeu().getProduto());

    assertNotEquals("Presunto", administradorController.produtoQueMaisVendeu().getQuantidadeVendida());
  }

  @Test
  void vendaMaisValorTest() {
    assertEquals(40000.99, administradorController.vendaMaisValor().getPrecoUnitario());
    assertEquals("LGTV OLED 85 Golden Edition", administradorController.vendaMaisValor().getProduto());

    assertNotEquals(3.20, administradorController.vendaMaisValor().getPrecoUnitario());
  }

  @Test
  void adicionarUtilizadorTest() throws IOException {
    String filepath = "src/test/resources/login_grandesNegociosTest.csv";

    administradorController.adicionarUtilizador("ADMIN", "tobias", "softdev", "src/test/resources/login_grandesNegociosTest.csv");

    File file = new File(filepath);
    Scanner scanner = new Scanner(file);

    String tipoUtilizador = "";
    String username = "";
    String passeword = "";

    String linha = scanner.nextLine();
    while (scanner.hasNextLine()) {

      linha = scanner.nextLine();
      String[] linhaDividida = linha.split(";");

      tipoUtilizador = linhaDividida[0];
      username = linhaDividida[1];
      passeword = linhaDividida[2];

    }

    assertEquals("ADMIN", tipoUtilizador);
    assertEquals("tobias", username);
    assertEquals("softdev", passeword);


  }


  @Test
  void valorVendasTest() {
    assertEquals(56194.609999999964, administradorController.valorVendas());
    assertNotEquals(300, administradorController.valorVendas());
  }

  @Test
  void mediaVendasTest() {
    assertEquals(422.5158646616539, administradorController.mediaVendas());
  }
}