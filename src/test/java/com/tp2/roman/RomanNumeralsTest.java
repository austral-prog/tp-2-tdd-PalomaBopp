package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    RomanNumerals number = new RomanNumerals();
    @Test
    void test1ToI() {
        assertEquals("I", number.convert(1));
    }

    @Test
    void test5ToV() {
        assertEquals("V", number.convert(5));
    }

    @Test
    void test10ToX(){
        assertEquals("X", number.convert(10));
    }

    @Test
    void test4toIV(){
        assertEquals("IV", number.convert(4));
    }

    @Test
    void test9ToIX() {
        assertEquals("IX", number.convert(9));
    }

    @Test
    void test40ToXL() {
        assertEquals("XL", number.convert(40));
    }

    @Test
    void test50ToL(){
        assertEquals("L", number.convert(50));
    }

    @Test
    void test90ToXC(){
        assertEquals("XC", number.convert(90));
    }

    @Test
    void test100ToC(){
        assertEquals("C", number.convert(100));
    }

    @Test
    void test400ToCD(){
        assertEquals("CD", number.convert(400));
    }

    @Test
    void test500ToD(){
        assertEquals("D", number.convert(500));
    }

    @Test
    void test900ToCM(){
        assertEquals("CM", number.convert(900));
    }

    @Test
    void test1000ToM(){
        assertEquals("M", number.convert(1000));
    }

    @Test
    void testComplex(){
        assertEquals("MCMXCIV", number.convert(1994));
    }
}
