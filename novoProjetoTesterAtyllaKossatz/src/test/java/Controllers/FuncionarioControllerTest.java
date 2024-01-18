package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FuncionarioControllerTest {
  private FuncionarioController funcionarioController;

  @BeforeEach
  void setUp() throws FileNotFoundException {
    funcionarioController = new FuncionarioController();
  }

  @Test
  void addVenda() throws IOException {
    String filepath = "src/test/resources/minimercadoTest.csv";

    funcionarioController.addVenda("Alimentacao", "Vinho Verde", 50, 5.99);

    File file = new File(filepath);
    Scanner scanner = new Scanner(file);

    String tipoProduto = "";
    String nomeProduto = "";
    int quantidadeProduto = 0;
    double precoProduto = 0;

    String linha = scanner.nextLine();

    while (scanner.hasNextLine()) {

      linha = scanner.nextLine();
      String[] linhaDividida = linha.split(",");

      tipoProduto = linhaDividida[0];
      nomeProduto = linhaDividida[1];
      quantidadeProduto = Integer.parseInt(linhaDividida[2]);
      precoProduto = Double.parseDouble(linhaDividida[3]);


    }


    assertEquals("Alimentacao", tipoProduto);
    assertEquals("Vinho Verde", nomeProduto);
    assertEquals(44, quantidadeProduto);
    assertEquals(5.99, precoProduto);

  }


  @Test
  void consultarStockProduto() {
    assertEquals(706, funcionarioController.consultarStockProduto("Vinho Verde"));
    assertEquals(89, funcionarioController.consultarStockProduto("Cerveja Super Bock"));
    assertNotEquals(1200, funcionarioController.consultarStockProduto("Cerveja Super Bock"));
  }
}