package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 public class StringCalculatorTest {
     @Test
     public void testEmptyString() {
         StringCalculator calc = new StringCalculator();
         assertEquals(0, calc.add(""));
     }
     @Test
     public void testEmptyString2() {
         StringCalculator calc = new StringCalculator();
         assertEquals(1, calc.add("1"));
     }
     @Test
     public void testEmptyString3() {
         StringCalculator calc = new StringCalculator();
         assertEquals(3, calc.add("1,2"));
     }
     @Test
     public void testEmptyString4() {
         StringCalculator calc = new StringCalculator();
         assertEquals(6, calc.add("1,2,3"));
     }
     @Test
     public void testEmptyString5() {
         StringCalculator calc = new StringCalculator();
         assertEquals(6, calc.add("1\n2,3"));
     }
     @Test
     public void testEmptyString6() {
         StringCalculator calc = new StringCalculator();
         assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2"));
     }
 }