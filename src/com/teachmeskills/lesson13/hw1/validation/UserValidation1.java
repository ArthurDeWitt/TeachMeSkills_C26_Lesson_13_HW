package com.teachmeskills.lesson13.hw1.validation;

import com.teachmeskills.lesson13.hw.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.hw.exceptions.WrongPasswordException;

public class UserValidation1 {
    public class UserValidation {
        public static boolean validateUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Invalid login");
            }
            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Invalid password");
            }
            return true;
        }

        public static boolean validateUserCharArray(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
            if (validateLoginWithCharArray(login) && validatePasswordWithCharArray(password, confirmPassword)) {
                return true;
            } else {
                return false;
            }
        }

        private static boolean validateLoginWithCharArray(String login) throws WrongLoginException {
            char[] chars = login.toCharArray();
            if (chars.length >= 20) {
                throw new WrongLoginException("Invalid login length");
            }
            for (char c : chars) {
                if (c == ' ') {
                    throw new WrongLoginException("Invalid login contains space");
                }
            }
            return true;
        }

        private static boolean validatePasswordWithCharArray(String password, String confirmPassword) throws WrongPasswordException {
            char[] passChars = password.toCharArray();
            char[] confirmChars = confirmPassword.toCharArray();
            if (passChars.length >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Invalid password");
            }
            for (int i = 0; i < passChars.length; i++) {
                if (passChars[i] != confirmChars[i]) {
                    throw new WrongPasswordException("Passwords do not match");
                }
            }
            return true;
        }
    }
}
