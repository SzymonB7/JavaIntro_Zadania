package pl.babiarz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldGetCircleArea(){
        //given
        Circle circle = new Circle(10);
        //when
        double area = circle.getArea();
        //then
        Assertions.assertEquals(314.1592653589793, area);
    }
    @Test
    void shouldGetCircleAPerimeter(){
        //given
        Circle circle = new Circle(25);
        //when
        double perimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(157.07963267948966, perimeter);
    }

}