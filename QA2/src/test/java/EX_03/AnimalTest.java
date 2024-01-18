package EX_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

  Animal tobias;
  Animal tigrao;

  @BeforeEach
  void setUp() {
    tobias = new Animal("tobias", Alimento.FRUTAS);
    tigrao = new Animal("tigrão", Alimento.CARNE);
  }

  @Test
  void getNome() {
   assertEquals("tobias", tobias.getNome());
   assertEquals("tigrão", tigrao.getNome());

  }

  @Test
  void estaComFome() {
    assertTrue(tigrao.estaComFome());
    assertTrue(tobias.estaComFome());
  }

  @Test
  void getTipoAlimentacao() {
    assertEquals(Alimento.FRUTAS, tobias.getTipoAlimentacao());
    assertEquals(Alimento.CARNE, tigrao.getTipoAlimentacao());
  }

  @Test
  void comer() {
    tobias.comer(Alimento.FRUTAS);
    tigrao.comer(Alimento.CARNE);

    assertFalse(tobias.estaComFome());
    assertFalse(tigrao.estaComFome());

  }
}