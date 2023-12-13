package com.teachmeskills.lesson13.hw.runner;

import com.teachmeskills.lesson13.hw.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.hw.exceptions.WrongPasswordException;
import com.teachmeskills.lesson13.hw.validation.UserValidation;

public class Runner {
    public static void main(String[] args) {
        try {
            UserValidation.validateUser("username", "password1", "password1");
            System.out.println("Validation successful");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
