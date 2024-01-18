package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {

  ClientController clientController;


  @BeforeEach
  void setUp() throws FileNotFoundException {
    clientController =new ClientController();
    clientController.getTodasVendas().clear();

    Venda venda1 = new Venda("Video Jogos", "Call of Duty", 200,60);
    Venda venda2 = new Venda("Video Jogos", "Call of Duty", 200,60);
    Venda venda3 = new Venda("Video Jogos", "GTA", 200,70);
    Venda venda4 = new Venda("Casa", "TV 55", 1,80);
    Venda venda5 = new Venda("Casa", "Sofa", 2,100);

    clientController.getTodasVendas().add(venda1);
    clientController.getTodasVendas().add(venda2);
    clientController.getTodasVendas().add(venda3);
    clientController.getTodasVendas().add(venda4);
    clientController.getTodasVendas().add(venda5);
  }

  @Test
  void produtoMaisCaroTest() {
    assertEquals(100, clientController.produtoMaisCaro().getPrecoUnitario());
    assertEquals("Sofa", clientController.produtoMaisCaro().getProduto());
  }

  @Test
  void produtosDisponiveisSemDuplicadosTest() {
    assertEquals(3, clientController.produtosDisponiveisSemDuplicados().size());

  }

  @Test
  void produtosDeCategoria() {
    assertEquals(2, clientController.produtosDeCategoria("Video Jogos").size());
    assertEquals("Call of Duty", clientController.produtosDeCategoria("Video Jogos").get(0).getProduto());
    assertEquals("GTA", clientController.produtosDeCategoria("Video Jogos").get(1).getProduto());
  }

  @Test
  void produtoMaisBarato() {
    assertEquals("Call of Duty", clientController.produtoMaisBarato().getProduto());
    assertEquals(60.0, clientController.produtoMaisBarato().getPrecoUnitario());
  }
}