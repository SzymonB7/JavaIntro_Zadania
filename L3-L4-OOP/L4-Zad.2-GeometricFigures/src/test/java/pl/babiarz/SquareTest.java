package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldGetSquareArea(){
        //given
        Square square = new Square(5);
        //when
        double area = square.getArea();
        //then
        Assertions.assertEquals(25, area);
    }
    @Test
    void shouldGetSquarePerimeter(){
        //given
        Square square = new Square(7);
        //when
        double perimeter = square.getPerimeter();
        //then
        Assertions.assertEquals(28, perimeter);
    }
}