package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("abc")); // muy corta
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validator.isValid("abcdefg1!")); // sin mayúscula
    }

    @Test
    void testMissingLowercase() {
        assertFalse(validator.isValid("ABCDEFG1!")); // sin minúscula
    }

    @Test
    void testMissingNumber() {
        assertFalse(validator.isValid("Abcdefgh!")); // sin número
    }

    @Test
    void testMissingSpecialCharacter() {
        assertFalse(validator.isValid("Abcdefg1")); // sin especial
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Abcdefg1!")); // cumple todos los criterios
    }
}
