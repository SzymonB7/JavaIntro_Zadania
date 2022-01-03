package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldGetSquareArea(){
        //given
        Square square = new Square(5);
        square.getArea();
        //when
        double getArea = square.getArea();
        //then
        Assertions.assertEquals(25, getArea);
    }
    @Test
    void shouldGetSquarePerimeter(){
        //given
        Square square = new Square(7);
        square.getPerimeter();
        //when
        double getPerimeter = square.getPerimeter();
        //then
        Assertions.assertEquals(28, getPerimeter);
    }
}