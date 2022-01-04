package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldGetRectangleArea(){
        //given
        Rectangle rectangle = new Rectangle(4,8);
        //when
        double area = rectangle.getArea();
        //then
        Assertions.assertEquals(32, area);
    }
    @Test
    void shouldGetRectanglePerimeter(){
        //given
        Rectangle rectangle = new Rectangle(2,10);
        //when
        double perimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(24, perimeter);
    }

}