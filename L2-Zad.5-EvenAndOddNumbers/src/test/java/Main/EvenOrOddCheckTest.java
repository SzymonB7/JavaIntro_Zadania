package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOrOddCheckTest {
    @Test
    void shouldCheckIf4IsEven() {
        //given
        int a = 4;
        //when
        boolean isNumberEven = EvenOrOddCheck.isNumberEven(a);
        //then
        Assertions.assertTrue(isNumberEven);
    }
    @Test
    void shouldCheckIfNegative4IsEven() {
        //given
        int a = -4;
        //when
        boolean isNumberEven = EvenOrOddCheck.isNumberEven(a);
        //then
        Assertions.assertTrue(isNumberEven);
    }
    @Test
    void shouldCheckIf0IsEven() {
        //given
        int a = 0;
        //when
        boolean isNumberEven = EvenOrOddCheck.isNumberEven(a);
        //then
        Assertions.assertTrue(isNumberEven);
    }
    @Test
    void shouldCheckIf9IsNotEven() {
        //given
        int a = 9;
        //when
        boolean isNumberEven = EvenOrOddCheck.isNumberEven(a);
        //then
        Assertions.assertFalse(isNumberEven);
    }
    @Test
    void shouldCheckIf9IsOdd() {
        //given
        int a = 9;
        //when
        boolean isNumberOdd = EvenOrOddCheck.isNumberOdd(a);
        //then
        Assertions.assertTrue(isNumberOdd);
    }
    @Test
    void shouldCheckIfNegative9IsOdd() {
        //given
        int a = -111;
        //when
        boolean isNumberOdd = EvenOrOddCheck.isNumberOdd(a);
        //then
        Assertions.assertTrue(isNumberOdd);
    }
    @Test
    void shouldCheckIf0IsNotOdd() {
        //given
        int a = 0;
        //when
        boolean isNumberOdd = EvenOrOddCheck.isNumberOdd(a);
        //then
        Assertions.assertFalse(isNumberOdd);
    }
    @Test
    void shouldCheckIf1000IsNotOdd() {
        //given
        int a = 1000;
        //when
        boolean isNumberOdd = EvenOrOddCheck.isNumberOdd(a);
        //then
        Assertions.assertFalse(isNumberOdd);
    }

}