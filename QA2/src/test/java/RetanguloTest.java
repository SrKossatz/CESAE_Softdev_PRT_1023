import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

  Retangulo retangulo1;
  Retangulo retangulo2;

  @BeforeEach
  void setUp() {
    retangulo1 = new Retangulo(10, 10);
    retangulo2 = new Retangulo(5, 20);
  }

  @Test
  void getLargura() {
    assertEquals(10, retangulo1.getLargura());
    assertEquals(5, retangulo2.getLargura());
  }



  @Test
  void getAltura() {
    assertEquals(10, retangulo1.getAltura());
    assertEquals(20, retangulo2.getAltura());
  }


  @Test
  void calcularPerimetro() {
    assertEquals(40, retangulo1.calcularPerimetro());
    assertEquals(50, retangulo2.calcularPerimetro());
  }

  @Test
  void calcularArea() {
    assertEquals(100, retangulo1.calcularArea());
    assertEquals(100, retangulo2.calcularArea());
  }
}