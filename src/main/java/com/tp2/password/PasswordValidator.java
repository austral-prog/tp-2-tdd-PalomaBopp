package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {
                if (password == null || password.length() < 8) return false;
                boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
                boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
                boolean hasDigit = password.chars().anyMatch(Character::isDigit);
                boolean hasSpecial = password.chars().anyMatch(
                        ch -> "!@#$%^&*()_+-=[]{}|;:,.<>?".indexOf(ch) >= 0
                );
                return hasUpper && hasLower && hasDigit && hasSpecial;
            }
        }




