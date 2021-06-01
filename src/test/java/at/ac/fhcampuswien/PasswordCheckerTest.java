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
        assertTrue(pw.checkPasswordLength("ThisIsPerfect"));
        assertFalse(pw.checkPasswordLength("OhNo"));
        assertTrue(pw.checkPasswordLength("AnotherPerfectOne"));
    }

    @Test
    @DisplayName("Check for lower and upper case")
    public void testUpperLowerCase() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsUpperLowerLetters("MoiraRoseForPresident"));
        assertFalse(pw.containsUpperLowerLetters("noneforjohnny"));
    }

    @Test
    @DisplayName("Check for numbers")
    public void testNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.containsNumbers("KamalaHarris2024"));
        assertFalse(pw.containsNumbers("NoMoreTrump"));
    }

    @Test
    @DisplayName("Check for special characters")
    public void testSpecialCharacters() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForSpecialCharacters("HiYa!"));
        assertFalse(pw.checkForSpecialCharacters("NothingSpecialHere"));
    }

    @Test
    @DisplayName("Check for two consecutive numbers")
    public void testConsecutiveNumbers() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkForConsecutiveNumbers("NoTenConsecutives8910"));
        assertFalse(pw.checkForConsecutiveNumbers("EwDavid123"));
        assertFalse(pw.checkForConsecutiveNumbers("RIPRuth1234"));
    }

    @Test
    @DisplayName("Check for numbers in a row")
    public void testThreeInARow() {
        PasswordChecker pw = new PasswordChecker();
        assertTrue(pw.checkThreeInARow("RowRowRowYourBoat"));
        assertFalse(pw.checkThreeInARow("Luficer666"));
    }
}
