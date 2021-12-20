package pl.minutesandseconds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {
    @Test
    void shouldConvert2MinutesToSeconds(){
        //given
        double min = 2;
        //when
        int seconds = MinutesToSecondsConverter.seconds(min);
        //then
        Assertions.assertEquals(120, seconds);
    }
    @Test
    void shouldConvert120MinutesToSeconds(){
        //given
        double min = 120;
        //when
        int seconds = MinutesToSecondsConverter.seconds(min);
        //then
        Assertions.assertEquals(7200, seconds);
    }
    @Test
    void shouldConvertDecimalMinutesToSeconds(){
        //given
        double min = 0.5;
        //when
        int seconds = MinutesToSecondsConverter.seconds(min);
        //then
        Assertions.assertEquals(30, seconds);
    }
}