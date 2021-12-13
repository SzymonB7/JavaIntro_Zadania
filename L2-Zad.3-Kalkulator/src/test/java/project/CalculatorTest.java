package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void shouldAddTwoNumbers(){
        //given
        int a = 2;
        int b = 3;
        //when
        int sum = Calculator.sum(a, b);
        //then
        Assertions.assertEquals(5,sum);
    }
    @Test
    void shouldSubtractOneNumberFromAnother(){
        //given
        int a = 7;
        int b = 3;
        //when
        int subtract = Calculator.subtract(a, b);
        //then
        Assertions.assertEquals(4,subtract);
    }
    @Test
    void shouldMultiplyTwoNumbers(){
        //given
        int a = 3;
        int b = 6;
        //when
        int multiply = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(18,multiply);
    }
    @Test
    void shouldDivideOneNumberByAnother(){
        //given
        int a = 12;
        int b = 3;
        //when
        int divide = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(4,divide);
    }

}