package pl.righttriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    @Test
    void shouldCheckIfReturnsTrueForRightTriangle(){
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        //when
        boolean isTriangleRight = RightTriangle.isTriangleRight(a, b, c);
        //then
        Assertions.assertTrue(isTriangleRight);
    }

    @Test
    void shouldCheckIfReturnsWrongForNotARightTriangle(){
        //given
        int a = 2;
        int b = 4;
        int c = 5;
        //when
        boolean isTriangleRight = RightTriangle.isTriangleRight(a, b, c);
        //then
        Assertions.assertFalse(isTriangleRight);
    }
}