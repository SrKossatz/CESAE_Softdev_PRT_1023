package Ex_03;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Ex_03.Alimento.CARNE;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

  Animal animal;

  @BeforeEach
  void setUp() {
    this.animal = new Animal("Leao", CARNE);
  }

  @Test
  void estaComFome() {
    assertTrue(animal.estaComFome());
  }

  @Test
  void getTipoAlimentacao() {
    animal.comer(CARNE);
    assertFalse(animal.estaComFome());
  }

  @Test
  void comer() {
    animal.comer(Alimento.FRUTAS);
    assertTrue(animal.estaComFome());
  }
}