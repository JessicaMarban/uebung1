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
    }

    @Test
    @DisplayName("Check for lower and upper case")
    public void testUpperLowerCase() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsUpperLowerLetters("mfDvfvfvvff"));
    }

    @Test
    @DisplayName("Check for numbers")
    public void testNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsNumbers("mf5dedededf"));
    }

    @Test
    @DisplayName("Check for special characters")
    public void testSpecialCharacters() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForSpecialCharacters("HiYa!"));
    }

    @Test
    @DisplayName("Check for two consecutive numbers")
    public void testConsecutiveNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForConsecutiveNumbers("kdjnnn8910"));
    }

    @Test
    @DisplayName("Check for numbers in a row")
    public void testThreeInARow() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkThreeInARow("jnfr11"));
    }


}
