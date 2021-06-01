package at.ac.fhcampuswien;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    //check for password length (8-25)
    public boolean checkPasswordLength(String password) {
        if (password.length() >= 8 && password.length() <= 25) {
            return true;
        } else {
            return false;

        }
    }


    //checks for upper and lower case letters
    public boolean containsUpperLowerLetters(String password) {
        char c;
        boolean upperCase = false;
        boolean lowerCase = false;

        //for loop to go through words and check for letters
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                upperCase = true;
            } else if (Character.isLowerCase(c)) {
                lowerCase = true;
            }
            if (upperCase && lowerCase) {
                return true;
            }
        }
        return false;
    }


    //checks for numbers
    public boolean containsNumbers(String password) {
        char c;
        boolean number = false;

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);

            if (Character.isDigit(c)) {
                number = true;
                return true;
            }
        }
        return false;
    }


    //checks for special characters
    public boolean checkForSpecialCharacters(String password) {
        char c;
        boolean specialChar = false;

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            Pattern pattern = Pattern.compile("[()#$?!%/@]");
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                specialChar = true;
                return true;
            }
        }
        return false;
    }


    //checks for no more than two consecutive numbers
    public boolean checkForConsecutiveNumbers(String password) {

        //string must become a char array
        char[] charArray = password.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            //int counts consecutive numbers
            int numberCounter = 1;
            //for loop checks for consecutive numbers and increments the counter
            for (int n = i + 1; n < charArray.length; n++) {

                if (charArray[n] == charArray[n - 1] + 1) {
                    numberCounter++;
                }
            }
            if (numberCounter > 2) {
                return false;
            }
        }
        return true;
    }


    //checks for no more than three numbers in a row
    public boolean checkThreeInARow(String password) {

        char[] charArray = password.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int numbersCounter = 0;
            char firstChar = charArray[i];

            //turn char into an in
            if (Character.isDigit(charArray[i])) {
                for (int n = 0; n < charArray.length; n++) {
                    char secondChar = charArray[n];
                    //increment counter when number is the same
                    if (firstChar == secondChar) {
                        numbersCounter++;
                    } else {
                        numbersCounter = 0;
                    }
                }
                if (numbersCounter >= 3) {
                    return false;
                }
            }
        }
        return true;
    }

}