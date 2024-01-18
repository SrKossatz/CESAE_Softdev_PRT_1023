package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {
  private ClientController clientController;

  @BeforeEach
  void setUp() throws FileNotFoundException {
    clientController = new ClientController();
  }

  @Test
  void produtoMaisCaroTest() {
    assertEquals(40000.99, clientController.produtoMaisCaro().getPrecoUnitario());
    assertEquals("LGTV OLED 85 Golden Edition", clientController.produtoMaisCaro().getProduto());

    assertNotEquals(3.24, clientController.produtoMaisCaro().getPrecoUnitario());
    assertNotEquals("Sabao Azul e Branco", clientController.produtoMaisCaro().getProduto());
  }

  @Test
  void produtosDisponiveisSemDuplicadosTest() {
    assertEquals(108, clientController.produtosDisponiveisSemDuplicados().size());

    boolean duplicado = false;

    for (int i = 0; i < clientController.produtosDisponiveisSemDuplicados().size(); i++) {

      duplicado = false;

      for (int j = 0; j < clientController.produtosDisponiveisSemDuplicados().size(); j++) {

        if (clientController.produtosDisponiveisSemDuplicados().get(i).getProduto().equals
                (clientController.produtosDisponiveisSemDuplicados().get(j).getProduto())) {

          duplicado = true;
        }
      }
    }
    assertTrue(duplicado);

  }

  @Test
  void produtosDeCategoriaTest() {
    assertEquals(34, clientController.produtosDeCategoria("Produtos para Casa").size());
    assertNotEquals(32, clientController.produtosDeCategoria("Higiene").size());

    boolean testeCategoria = false;

    for (int i = 0; i < clientController.produtosDeCategoria("Produtos para Casa").size(); i++) {
      testeCategoria = false;
      if (!clientController.produtosDeCategoria("Produtos para Casa").get(i).getTipoProduto().equals("Produtos para Casa")) {
        testeCategoria = true;
      }
    }

    assertFalse(testeCategoria);

    for (int i = 0; i < clientController.produtosDeCategoria("Higiene").size(); i++) {
      testeCategoria = false;
      if (!clientController.produtosDeCategoria("Higiene").get(i).getTipoProduto().equals("Higiene")) {
        testeCategoria = true;
      }
    }

    assertFalse(testeCategoria);
  }


  @Test
  void produtoMaisBaratoTest() {

    assertEquals("Pate de Sardinha", clientController.produtoMaisBarato().getProduto());
    assertEquals(0.65, clientController.produtoMaisBarato().getPrecoUnitario());
    assertEquals("Alimentacao", clientController.produtoMaisBarato().getTipoProduto());

  }
}