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
        if (!isUpperCasePassword(password)) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one uppercase letter");
        }
        if (!isLowerCasePassword(password)) {
            throw new IllegalArgumentException("Password should contain "
                    + "at least one lowercase letter");
        }
        if (!isDigitPassword(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSymbolsPassword(password)) {
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

    public static boolean isUpperCasePassword(String p) {
        boolean result = false;
        char[] symbols = p.toCharArray();
        for (char ch : symbols) {
            if (isUpperCase(ch)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isLowerCasePassword(String p) {
        boolean result = false;
        char[] symbols = p.toCharArray();
        for (char ch : symbols) {
            if (isLowerCase(ch)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isDigitPassword(String p) {
        boolean result = false;
        char[] symbols = p.toCharArray();
        for (char ch : symbols) {
            if (isDigit(ch)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isSymbolsPassword(String p) {
        boolean result = false;
        char[] symbols = p.toCharArray();
        for (char ch : symbols) {
            if (ch >= 33 && ch <= 47) {
                result = true;
            }
        }
        return result;
    }
}