package com.teachmeskills.lesson13.hw.validation;

import com.teachmeskills.lesson13.hw.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.hw.exceptions.WrongPasswordException;

public class UserValidation {
    public static void validateUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}