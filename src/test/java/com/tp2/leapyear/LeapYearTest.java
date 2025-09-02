package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    @Test
    public void testNotDivisibleBy4() {
        LeapYear ly = new LeapYear();
        ly.isLeapYear(2001);
        assertFalse(ly.isLeapYear(2001));// 2001 no es divisible por 4 → no bisiesto
    }

    @Test
    public void testDivisibleBy4() {
        LeapYear ly = new LeapYear();
        ly.isLeapYear(2004);
        assertTrue(ly.isLeapYear(2004));
    }

    @Test
    public void testDivisibleBy100Not400() {
        LeapYear ly = new LeapYear();
        ly.isLeapYear(1900);
        assertFalse(ly.isLeapYear(1900));
    }

    @Test
    public void testDivisibleBy400() {
        LeapYear ly = new LeapYear();
        ly.isLeapYear(2000);
        assertTrue(ly.isLeapYear(2000));
    }
}


//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400

