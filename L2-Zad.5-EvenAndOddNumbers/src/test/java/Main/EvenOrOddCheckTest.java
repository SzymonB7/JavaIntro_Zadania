package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddCheckTest {
    @Test
    void shouldCheckIf10IsEven() {
        //given
        int a = 10;
        //when
        String evenOrOdd = EvenOrOddCheck.evenOrOddCheck(10);
        //then
        Assertions.assertEquals("Even number", evenOrOdd);
    }
    @Test
    void shouldCheckIf7IsOdd(){
        //given
        int a = 7;
        //when
        String evenOrOdd = EvenOrOddCheck.evenOrOddCheck(7);
        //then
        Assertions.assertEquals("Odd number", evenOrOdd);
    }
    @Test
    void shouldCheckIf0IsEven(){
        //given
        int a = 0;
        //when
        String evenOrOdd = EvenOrOddCheck.evenOrOddCheck(0);
        //then
        Assertions.assertEquals("Even number", evenOrOdd);
    }
    @Test
    void shouldCheckIfNegative5IsOdd(){
        //given
        int a = -5;
        //when
        String evenOrOdd = EvenOrOddCheck.evenOrOddCheck(-5);
        //then
        Assertions.assertEquals("Odd number", evenOrOdd);
    }
    @Test
    void shouldCheckIfNegative100IsEven(){
        //given
        int a = -100;
        //when
        String evenOrOdd = EvenOrOddCheck.evenOrOddCheck(-100);
        //then
        Assertions.assertEquals("Even number", evenOrOdd);
    }

}