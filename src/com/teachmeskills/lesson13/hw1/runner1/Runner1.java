package com.teachmeskills.lesson13.hw1.runner1;

import com.teachmeskills.lesson13.hw1.exceptions.WrongLoginException1;
import com.teachmeskills.lesson13.hw1.exceptions.WrongPasswordException1;
import com.teachmeskills.lesson13.hw1.validation.UserValidation1;

public class Runner1 {
        public static void main(String[] args) {
            try {
                UserValidation1.UserValidation.validateUser("username", "password1", "password1");
                System.out.println("Validation successful");
            } catch (WrongLoginException1 | WrongPasswordException1 e) {
                System.out.println("Validation failed: " + e.getMessage());
            }
        }
    }
