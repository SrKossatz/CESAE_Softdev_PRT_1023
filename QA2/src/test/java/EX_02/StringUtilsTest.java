package EX_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {


  @Test
  void isPalindrome() {
    assertTrue(StringUtils.isPalindrome("ovo"));
    assertTrue(StringUtils.isPalindrome("radar"));
    assertTrue(StringUtils.isPalindrome("radar ovo radar"));
  }
}