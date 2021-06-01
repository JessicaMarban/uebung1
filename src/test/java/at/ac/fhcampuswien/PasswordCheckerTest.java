package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordCheckerTest {


    @Test
    @DisplayName("Password length")
    public void testPasswordLength() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkPasswordLength("pw1268468534"));
        assertFalse(pw.checkPasswordLength("kdn"));
        assertTrue(pw.checkPasswordLength("fFJvruviernvivvn"));
    }

    @Test
    @DisplayName("Check for lower and upper case")
    public void testUpperLowerCase() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsUpperLowerLetters("mfLKJvfvfvvff"));
        assertFalse(pw.containsUpperLowerLetters("furfuerign"));
    }

    @Test
    @DisplayName("Check for numbers")
    public void testNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsNumbers("mf5dedededf"));
        assertFalse(pw.containsNumbers("fnlNfirn"));
    }

    @Test
    @DisplayName("Check for special characters")
    public void testSpecialCharacters() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForSpecialCharacters("HiYa!"));
        assertFalse(pw.checkForSpecialCharacters("Thisnfue"));
    }

    @Test
    @DisplayName("Check for two consecutive numbers")
    public void testConsecutiveNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForConsecutiveNumbers("kdjnnn8910"));
        assertFalse(pw.checkForConsecutiveNumbers("123Ksnf"));
        assertFalse(pw.checkForConsecutiveNumbers("1234Ksnf"));
    }

    @Test
    @DisplayName("Check for numbers in a row")
    public void testThreeInARow() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkThreeInARow("jnfr11"));
        assertFalse(pw.checkThreeInARow("jjdefnej222"));
    }
}
