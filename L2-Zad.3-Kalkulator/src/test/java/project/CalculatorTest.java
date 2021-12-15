package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void shouldAddTwoNumbers2And3(){
        //given
        int a = 2;
        int b = 3;
        //when
        long sum = Calculator.sum(a, b);
        //then
        Assertions.assertEquals(5,sum);
    }
    @Test
    void shouldAddOneToMaxIntiger() {
        //given
        int a = Integer.MAX_VALUE;
        int b = 1;
        //when
        long sum = Calculator.sum(a, b);
        //then
        Assertions.assertEquals(2147483648L,sum);
    }
    @Test
    void shouldAddNegative1To7() {
        //given
        int a = 7;
        int b = -1;
        //when
        long sum = Calculator.sum(a, b);
        //then
        Assertions.assertEquals(6,sum);
    }
    @Test
    void shouldSubtract3From7() {
        //given
        int a = 7;
        int b = 3;
        //when
        long subtract = Calculator.subtract(a, b);
        //then
        Assertions.assertEquals(4,subtract);
    }
    @Test
    void shouldSubtract7From3() {
        //given
        int a = 3;
        int b = 7;
        //when
        long subtract = Calculator.subtract(a, b);
        //then
        Assertions.assertEquals(-4,subtract);
    }
    @Test
    void shouldSubtractMaxIntegerFromNegative3() {
        //given
        int a = -3;
        int b = Integer.MAX_VALUE;
        //when
        long subtract = Calculator.subtract(a, b);
        //then
        Assertions.assertEquals(-2147483650L, subtract);
    }
    @Test
    void shouldMultiply3By6(){
        //given
        int a = 3;
        int b = 6;
        //when
        long multiply = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(18,multiply);
    }
    @Test
    void shouldMultiplyNegative3By7() {
        //given
        int a = -3;
        int b = 7;
        //when
        long multiply = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(-21, multiply);
    }
    @Test
    void shouldMultiplyMaxIntegerBy3() {
        //given
        int a = Integer.MAX_VALUE;
        int b = 3;
        //when
        long multiply = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(6442450941L, multiply);
    }
    @Test
    void shouldMultiplyMaxIntegerByMaxInteger() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        //when
        long multiply = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(4.6116860141324206E18, multiply);
    }
    @Test
    void shouldDivide12By3(){
        //given
        int a = 12;
        int b = 3;
        //when
        double divide = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(4,divide);
    }
    @Test
    void shouldDivide2By4(){
        //given
        int a = 2;
        int b = 4;
        //when
        double divide = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(0.5,divide);
    }
    @Test
    void shouldDivide6By0() {
        //given
        int a = 6;
        int b = 0;
        //when
        double divide = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(0, divide);
    }
}