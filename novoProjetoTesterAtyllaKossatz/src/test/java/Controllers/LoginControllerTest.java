package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginControllerTest {
  private LoginController loginController;

  @BeforeEach
  void setUp() throws FileNotFoundException {
    loginController = new LoginController();
  }

  @Test
  void validarLoginTest() throws FileNotFoundException {
    String filepath = "login_grandesNegociosTest.csv";

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

}