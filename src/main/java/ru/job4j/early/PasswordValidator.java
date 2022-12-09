package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        char[] symbols = password.toCharArray();
        int upperSymbol = 0;
        int lowerSymbol = 0;
        int digitSymbol = 0;
        int specialSymbol = 0;
        for (char symbol : symbols) {
            if (isUpperCase(symbol)) {
                upperSymbol = 1;
            }
            if (isLowerCase(symbol)) {
                lowerSymbol = 1;
            }
            if (isDigit(symbol)) {
                digitSymbol = 1;
            }
            if (symbol >= 33 && symbol <= 47) {
                specialSymbol = 1;
            }
        }

        if (upperSymbol == 0) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one uppercase letter");
        }
        if (lowerSymbol == 0) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one lowercase letter");
        }

        if (digitSymbol == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (specialSymbol == 0) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one special symbol");
        }

        String[] wrongWords = {"qwerty", "12345", "password", "admin", "user"};
        for (String word : wrongWords) {
            if (password.toLowerCase().contains(word)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: "
                        + "qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}