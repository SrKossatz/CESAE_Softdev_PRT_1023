package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtillsTest {
  private StringUtills testeString;


  @Test
  public void isPalindromeTest() {
    assertTrue(StringUtills.isPalindrome("ana"));
    assertTrue(StringUtills.isPalindrome("asa"));
    assertFalse(StringUtills.isPalindrome("teste"));
    assertFalse(StringUtills.isPalindrome("agora acho que vai"));
  }

}