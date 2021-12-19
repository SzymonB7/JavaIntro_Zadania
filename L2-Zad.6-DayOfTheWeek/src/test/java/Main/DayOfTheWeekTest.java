package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void shouldReturnCorrectMessageFor1() {
       //given
       int day = 1;
       //when
       String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
       //then
        Assertions.assertEquals("Monday", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor2() {
        //given
        int day = 2;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Tuesday", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor3() {
        //given
        int day = 3;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Wednesday", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor4() {
        //given
        int day = 4;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Thursday", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor5() {
        //given
        int day = 5;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Friday", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor6() {
        //given
        int day = 6;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Weekend", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor7() {
        //given
        int day = 7;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("Weekend", identifyDayOfTheWeek);
    }
    @Test
    void shouldReturnCorrectMessageFor8() {
        //given
        int day = 8;
        //when
        String identifyDayOfTheWeek = DayOfTheWeek.identifyDayOfTheWeek(day);
        //then
        Assertions.assertEquals("There is no such day", identifyDayOfTheWeek);
    }
}