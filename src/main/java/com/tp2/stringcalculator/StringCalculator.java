package com.tp2.stringcalculator;

public class StringCalculator {
    
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String[] nums = numbers.split(",|\n"); // separa por coma o salto de línea
        int sum = 0;

        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n < 0) throw new IllegalArgumentException("Negativos no permitidos: " + n);
            sum += n;
        }
        return sum;
    }
}

